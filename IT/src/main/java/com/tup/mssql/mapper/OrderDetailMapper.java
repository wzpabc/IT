package com.tup.mssql.mapper;

import com.tup.mssql.model.OrderDetail;
import com.tup.mssql.model.OrderDetailKey;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(OrderDetailKey key);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(OrderDetailKey key);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}