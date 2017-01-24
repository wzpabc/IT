package com.tup.mssql.mapper;

import com.tup.mssql.model.OrderHeader;
import com.tup.mssql.model.OrderHeaderExample;
import com.tup.mssql.model.OrderHeaderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHeaderMapper {
    int countByExample(OrderHeaderExample example);

    int deleteByExample(OrderHeaderExample example);

    int deleteByPrimaryKey(OrderHeaderKey key);

    int insert(OrderHeader record);

    int insertSelective(OrderHeader record);

    List<OrderHeader> selectByExample(OrderHeaderExample example);

    OrderHeader selectByPrimaryKey(OrderHeaderKey key);

    int updateByExampleSelective(@Param("record") OrderHeader record, @Param("example") OrderHeaderExample example);

    int updateByExample(@Param("record") OrderHeader record, @Param("example") OrderHeaderExample example);

    int updateByPrimaryKeySelective(OrderHeader record);

    int updateByPrimaryKey(OrderHeader record);
}