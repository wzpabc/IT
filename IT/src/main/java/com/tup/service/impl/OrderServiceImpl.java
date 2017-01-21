package com.tup.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.base.DbcontextHolder;
import com.tup.commons.base.RequestOrderParamHelper;
import com.tup.commons.utils.PageInfo;
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
	public RequestOrderParamHelper helper;

	public void setHelper(RequestOrderParamHelper helper) {
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
		// Page<OrderHeaderInVo> page = new
		// Page<OrderHeaderInVo>(pageInfo.getNowpage(), pageInfo.getSize());
		System.out.println("helper.toString()");
		System.out.println(helper.toString());
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd ");
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
		OrderHeaderInVoExample example = new OrderHeaderInVoExample();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(helper.getOrderno())) {
			criteria.andSyvr01EqualTo(helper.getOrderno());
		}
		if (!StringUtils.isEmpty(helper.getCreatedateStart())&&!StringUtils.isEmpty(helper.getCreatedateEnd())) {
		try {
			criteria.andSytrdjBetween(fmt.parse(helper.getCreatedateStart()), fmt.parse(helper.getCreatedateEnd()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		}
		if (!StringUtils.isEmpty(helper.getJdestatus())) {
			criteria.andJdeStatusEqualTo("3");
		}
		if (!StringUtils.isEmpty(helper.getOrdertype())) {
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
}
