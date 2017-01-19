package com.tup.mssql.mapper;

import com.tup.mssql.model.OrderHeader;
import com.tup.mssql.model.OrderHeaderKey;

public interface OrderHeaderMapper {
    int deleteByPrimaryKey(OrderHeaderKey key);

    int insert(OrderHeader record);

    int insertSelective(OrderHeader record);

    OrderHeader selectByPrimaryKey(OrderHeaderKey key);

    int updateByPrimaryKeySelective(OrderHeader record);

    int updateByPrimaryKey(OrderHeader record);
}