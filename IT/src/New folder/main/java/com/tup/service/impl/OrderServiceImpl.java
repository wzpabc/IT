package com.tup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.PageInfo;
import com.tup.commons.utils.VeDate;
import com.tup.form.OrderHelper;
import com.tup.mssql.mapper.OrderHeaderInMapper;
import com.tup.mssql.mapper.OrderHeaderInVoMapper;
import com.tup.mssql.model.OrderHeaderIn;
import com.tup.mssql.model.OrderHeaderInVo;
import com.tup.mssql.model.OrderHeaderInVoExample;
import com.tup.mssql.model.OrderHeaderInVoExample.Criteria;
import com.tup.service.IOrderService;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderHeaderInMapper, OrderHeaderIn> implements IOrderService {
	@Autowired
	private OrderHeaderInMapper mapper;
	@Autowired
	private OrderHeaderInVoMapper vmapper;
	public OrderHelper helper;

	public void setHelper(OrderHelper helper) {
		this.helper = helper;
	}

	// @Override
	public void selectDataGrid(PageInfo pageInfo) {
		Page<OrderHeaderIn> page = new Page<OrderHeaderIn>(pageInfo.getNowpage(), pageInfo.getSize());
		List<OrderHeaderIn> list = mapper.selectOrderHeaderInList(page);
		pageInfo.setRows(list);
		// pageInfo.setTotal(page.getTotal());
		pageInfo.setTotal(mapper.getCount());
	}

	public void selectDataGridVo(PageInfo pageInfo) {
		System.out.println(helper);
		OrderHeaderInVoExample example = new OrderHeaderInVoExample();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(helper.getOrderno()) && !helper.getOrderno().equals("")) {
			criteria.andSyvr01EqualTo(helper.getOrderno());
		}
		if (!StringUtils.isEmpty(helper.getOrganno()) && !helper.getOrganno().equals("")) {
			criteria.andSydocoEqualTo(Long.valueOf(helper.getOrganno()));
		}
		if (!StringUtils.isEmpty(helper.getCreatedateStart()) && !StringUtils.isEmpty(helper.getCreatedateEnd())) {
			criteria.andSytrdjBetween(VeDate.strToDate(helper.getCreatedateStart()),
					VeDate.strToDate(helper.getCreatedateEnd()));
		}
		if (StringUtils.isEmpty(helper.getJdestatus())) {
			criteria.andJdeStatusEqualTo("3");
		}
		if (!StringUtils.isEmpty(helper.getOrdertype()) && !helper.getOrdertype().equals("ALL")) {
			criteria.andSydctoEqualTo(helper.getOrdertype());
		}

		example.setOrderByClause(" syvr01 desc");
		example.setPage(String.valueOf(helper.getPage()));
		example.setRows(String.valueOf(helper.getRows()));

		List<OrderHeaderInVo> list = vmapper.selectByExample(example);

		pageInfo.setRows(list);
		Integer count = vmapper.countByExample(example);
		pageInfo.setTotal(count);
	}

	public int updateJdestatusBySyvr01() {
		OrderHeaderInVoExample example = new OrderHeaderInVoExample();
		Criteria criteria = example.createCriteria();
		criteria.andSyvr01EqualTo(helper.getOrderno());
		OrderHeaderInVo order = new OrderHeaderInVo();
		order.setJdeStatus("5");// 放单
		Integer count = vmapper.updateByExampleSelective(order, example);
		return count;
	}

	public int updateAll() {
		return vmapper.updateByBatch();
	}
}
