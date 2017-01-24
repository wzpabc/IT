package com.tup.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Fmsuser;
import com.tup.model.FmsuserExample;
import com.tup.model.Fmsuser;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface FmsuserMapper extends BaseMapper<Fmsuser> {
  int countByExample(FmsuserExample example);

    int deleteByExample(FmsuserExample example);

    Integer insert(Fmsuser record);

    int insertSelective(Fmsuser record);

    List<Fmsuser> selectByExample(FmsuserExample example);

    int updateByExampleSelective(@Param("record") Fmsuser record, @Param("example") FmsuserExample example);

    int updateByExample(@Param("record") Fmsuser record, @Param("example") FmsuserExample example);
}