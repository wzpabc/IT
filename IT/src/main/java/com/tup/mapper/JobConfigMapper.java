package com.tup.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tup.model.JobConfig; 
import com.tup.service.IJobConfigService;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobConfigMapper extends BaseMapper<JobConfig>{
    int countByExample(IJobConfigService example);

    int deleteByExample(IJobConfigService example);

   // void insert(JobConfig record);

    int insertSelective(JobConfig record);

    List<JobConfig> selectByExample(IJobConfigService example);

    int updateByExampleSelective(@Param("record") JobConfig record, @Param("example") IJobConfigService example);

    int updateByExample(@Param("record") JobConfig record, @Param("example") IJobConfigService example);
}