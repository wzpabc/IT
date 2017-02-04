package com.tup.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Outletstock;
import com.tup.model.OutletstockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutletstockMapper extends BaseMapper<Outletstock>{
    int countByExample(OutletstockExample example);

    int deleteByExample(OutletstockExample example);

    int deleteByPrimaryKey(Integer id);

    Integer insert(Outletstock record);

    int insertSelective(Outletstock record);

    List<Outletstock> selectByExample(OutletstockExample example);

    Outletstock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Outletstock record, @Param("example") OutletstockExample example);

    int updateByExample(@Param("record") Outletstock record, @Param("example") OutletstockExample example);

    int updateByPrimaryKeySelective(Outletstock record);

    int updateByPrimaryKey(Outletstock record);
}