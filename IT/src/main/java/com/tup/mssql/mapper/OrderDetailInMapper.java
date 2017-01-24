package com.tup.mssql.mapper;

import com.tup.mssql.model.OrderDetailIn;
import com.tup.mssql.model.OrderDetailInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailInMapper {
    int countByExample(OrderDetailInExample example);

    int deleteByExample(OrderDetailInExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderDetailIn record);

    int insertSelective(OrderDetailIn record);

    List<OrderDetailIn> selectByExample(OrderDetailInExample example);

    OrderDetailIn selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDetailIn record, @Param("example") OrderDetailInExample example);

    int updateByExample(@Param("record") OrderDetailIn record, @Param("example") OrderDetailInExample example);

    int updateByPrimaryKeySelective(OrderDetailIn record);

    int updateByPrimaryKey(OrderDetailIn record);
}