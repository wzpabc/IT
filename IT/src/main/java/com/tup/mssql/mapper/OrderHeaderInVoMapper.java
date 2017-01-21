package com.tup.mssql.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.mssql.model.OrderHeaderInVo;
import com.tup.mssql.model.OrderHeaderInVoExample;

public interface OrderHeaderInVoMapper extends BaseMapper<OrderHeaderInVo> {
	int countByExample(OrderHeaderInVoExample example);

	int deleteByExample(OrderHeaderInVoExample example);

	Integer insert(OrderHeaderInVo entity);

	int insertSelective(OrderHeaderInVo record);

	List<OrderHeaderInVo> selectByExample(OrderHeaderInVoExample example);

	int updateByExampleSelective(@Param("record") OrderHeaderInVo record,
			@Param("example") OrderHeaderInVoExample example);

	int updateByExample(@Param("record") OrderHeaderInVo record, @Param("example") OrderHeaderInVoExample example);
}