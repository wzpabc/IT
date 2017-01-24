package com.tup.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.JobEmail;
import com.tup.model.JobEmailExample;
import com.tup.model.JobEmail;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface JobEmailMapper extends BaseMapper<JobEmail> {
  int countByExample(JobEmailExample example);

    int deleteByExample(JobEmailExample example);

    Integer insert(JobEmail record);

    int insertSelective(JobEmail record);

    List<JobEmail> selectByExample(JobEmailExample example);

    int updateByExampleSelective(@Param("record") JobEmail record, @Param("example") JobEmailExample example);

    int updateByExample(@Param("record") JobEmail record, @Param("example") JobEmailExample example);
}