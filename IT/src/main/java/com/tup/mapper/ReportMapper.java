package com.tup.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.Report;
import com.tup.model.ReportExample;
import com.tup.model.Report;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface ReportMapper extends BaseMapper<Report> {
  int countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    Integer insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExample(ReportExample example);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);
}