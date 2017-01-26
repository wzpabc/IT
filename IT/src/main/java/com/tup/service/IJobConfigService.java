package com.tup.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.tup.commons.utils.PageInfo;
import com.tup.form.JobconfigHelper;
import com.tup.model.JobConfig;

public interface IJobConfigService extends IService<JobConfig> {

	void setHelper(JobconfigHelper helper);

	void selectDataGrid(PageInfo pageInfo);

	List<JobConfig> selectJobConfigList(int size);

	boolean RetryAutoIncrement(JobConfig entity);

	boolean UpdateTime(JobConfig entity);

	boolean updateByIdRunStatus(JobConfig entity, String status);

}