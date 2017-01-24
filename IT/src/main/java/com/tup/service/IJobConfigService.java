package com.tup.service;

import com.baomidou.mybatisplus.service.IService;
import com.tup.commons.utils.PageInfo;
import com.tup.form.JobconfigHelper;
import com.tup.model.JobConfig;

public interface IJobConfigService  extends IService <JobConfig>{

	void setHelper(JobconfigHelper helper);

	void selectDataGrid(PageInfo pageInfo);

}