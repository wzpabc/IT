package com.tup.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.tup.model.JobConfig;
import com.tup.service.impl.JobConfigServiceImpl.Criteria;

public interface IJobConfigService extends IService<JobConfig> {

	void setOrderByClause(String orderByClause);

	String getOrderByClause();

	void setDistinct(boolean distinct);

	boolean isDistinct();

	List<Criteria> getOredCriteria();

	void or(Criteria criteria);

	Criteria or();

	Criteria createCriteria();

	void clear();

}