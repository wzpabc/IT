package com.tup.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Reportmapping;
import com.tup.model.ReportmappingExample;
import com.tup.model.Reportmapping;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface ReportmappingMapper extends BaseMapper<Reportmapping> {
  int countByExample(ReportmappingExample example);

    int deleteByExample(ReportmappingExample example);

    Integer insert(Reportmapping record);

    int insertSelective(Reportmapping record);

    List<Reportmapping> selectByExample(ReportmappingExample example);

    int updateByExampleSelective(@Param("record") Reportmapping record, @Param("example") ReportmappingExample example);

    int updateByExample(@Param("record") Reportmapping record, @Param("example") ReportmappingExample example);
}