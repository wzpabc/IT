package com.tup.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.JobConfig;
import com.tup.model.JobConfigExample;

public interface JobConfigMapper extends BaseMapper<JobConfig>{
    int countByExample(JobConfigExample example);

    int deleteByExample(JobConfigExample example);

    Integer insert(JobConfig record);

    int insertSelective(JobConfig record);

    List<JobConfig> selectByExample(JobConfigExample example);

    int updateByExampleSelective(@Param("record") JobConfig record, @Param("example") JobConfigExample example);

    int updateByExample(@Param("record") JobConfig record, @Param("example") JobConfigExample example);
}