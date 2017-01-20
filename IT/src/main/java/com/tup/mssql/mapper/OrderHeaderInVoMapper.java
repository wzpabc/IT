package com.tup.mssql.mapper;

import com.tup.mssql.model.OrderHeaderInVo;
import com.tup.mssql.model.OrderHeaderInVoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderHeaderInVoMapper {
    int countByExample(OrderHeaderInVoExample example);

    int deleteByExample(OrderHeaderInVoExample example);

    int insert(OrderHeaderInVo record);

    int insertSelective(OrderHeaderInVo record);

    List<OrderHeaderInVo> selectByExample(OrderHeaderInVoExample example);

    int updateByExampleSelective(@Param("record") OrderHeaderInVo record, @Param("example") OrderHeaderInVoExample example);

    int updateByExample(@Param("record") OrderHeaderInVo record, @Param("example") OrderHeaderInVoExample example);
}