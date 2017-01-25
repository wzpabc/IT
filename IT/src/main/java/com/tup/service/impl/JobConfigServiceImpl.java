package com.tup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.PageInfo;
import com.tup.form.JobconfigHelper;
import com.tup.mapper.JobConfigMapper;
import com.tup.model.JobConfig;
import com.tup.model.JobConfigExample;
import com.tup.model.JobConfigExample.Criteria;
import com.tup.service.IJobConfigService;

@Service
public class JobConfigServiceImpl extends ServiceImpl<JobConfigMapper, JobConfig> implements IJobConfigService {
	@Autowired
	private JobConfigMapper mapper;
	// @Autowired
	private JobconfigHelper helper;

	private int count = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tup.service.impl.IJobConfigService#setHelper(com.tup.commons.base.
	 * RequestJobconfigParamHelper)
	 */
	public void setHelper(JobconfigHelper helper) {
		this.helper = helper;
	}

	public List<JobConfig> selectJobConfigList(int size) {
		JobConfigExample example = new JobConfigExample();
		example.setOrderByClause(" id asc");
		example.setOffset("0");// mysql
		example.setRows(String.valueOf(size));
		Criteria criteria = example.createCriteria();

		List<JobConfig> list = mapper.selectByExample(example);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tup.service.impl.IJobConfigService#selectDataGrid(com.tup.commons.
	 * utils.PageInfo)
	 */
	// @Transactional
	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		JobConfigExample example = new JobConfigExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<JobConfig> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
}
