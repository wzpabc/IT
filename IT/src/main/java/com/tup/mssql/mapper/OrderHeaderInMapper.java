package com.tup.mssql.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.tup.mssql.model.OrderHeaderIn;

public interface OrderHeaderInMapper extends BaseMapper<OrderHeaderIn> {
	// int insert(OrderheaderIn record);

	int insertSelective(OrderHeaderIn record);

	int getCount();

	List<OrderHeaderIn> selectOrderHeaderInList(Pagination page);
}