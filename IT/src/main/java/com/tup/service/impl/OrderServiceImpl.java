package com.tup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.base.RequestOrderParamHelper;
import com.tup.commons.utils.PageInfo;
import com.tup.mssql.mapper.OrderHeaderInMapper;
import com.tup.mssql.model.OrderHeaderIn;
import com.tup.service.IOrderService;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderHeaderInMapper, OrderHeaderIn> implements IOrderService {
	@Autowired
	private OrderHeaderInMapper mapper;
	private RequestOrderParamHelper helper;

	public OrderServiceImpl setHelper(RequestOrderParamHelper helper) {
		this.helper = helper;
		return this;
	}

	// @Override
	public void selectDataGrid(PageInfo pageInfo) {
		Page<OrderHeaderIn> page = new Page<OrderHeaderIn>(pageInfo.getNowpage(), pageInfo.getSize());
		List<OrderHeaderIn> list = mapper.selectOrderHeaderInList(page);
		pageInfo.setRows(list);
		// pageInfo.setTotal(page.getTotal());
		pageInfo.setTotal(mapper.getCount());
	}
}
