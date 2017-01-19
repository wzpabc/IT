package com.tup.mssql.mapper;

import com.tup.mssql.model.OrderDetailIn;

public interface OrderDetailInMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderDetailIn record);

    int insertSelective(OrderDetailIn record);

    OrderDetailIn selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderDetailIn record);

    int updateByPrimaryKey(OrderDetailIn record);
}