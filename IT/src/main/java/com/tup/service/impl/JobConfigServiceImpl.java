package com.tup.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.PageInfo;
import com.tup.commons.utils.VeDate;
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

	public boolean RetryAutoIncrement(JobConfig entity) {
		int count = 0;
		JobConfigExample example = new JobConfigExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(entity.getId());
		criteria.andRunStatusGreaterThan("-1");
		List<JobConfig> list = mapper.selectByExample(example);
		JobConfig temp = new JobConfig();
		temp.setRetryTime(list.get(0).getRetryTime() + 1);
		count = mapper.updateByExampleSelective(temp, example);
		if (count > 0) {
			return true;
		}
		return false;
	}

	public boolean UpdateTime(JobConfig entity) {
		int count = 0;
		JobConfigExample example = new JobConfigExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(entity.getId());
		criteria.andRunStatusGreaterThan("-1");
		List<JobConfig> list = mapper.selectByExample(example);
		JobConfig temp = new JobConfig();
		temp.setUpdateTime(VeDate.getNow());
		count = mapper.updateByExampleSelective(temp, example);
		if (count > 0) {
			return true;
		}
		return false;
	}

	public List<JobConfig> selectJobConfigList(int size) {
		int count = 0;
		JobConfigExample example = new JobConfigExample();
		example.setOrderByClause(" id asc");
		example.setOffset("0");// mysql
		example.setRows(String.valueOf(size));
		Criteria criteria = example.createCriteria();
		criteria.andRunStatusEqualTo("0");// realse
		criteria.andRetryTimeLessThan(4);// worth
		criteria.andConfigStatusEqualTo("1");// active
		//criteria.andUpdateTimeLessThan(new Date(VeDate.getNowDate().getTime() + (5 * 60 * 1000))); 
		System.out.println("selectJobConfigList");
		List<JobConfig> list = mapper.selectByExample(example);
		System.out.println(list.size());
		example.clear();
		List<JobConfig> finallist = new ArrayList<JobConfig>();
		// prevent dirty read, filtering dirty read records
		for (JobConfig job : list) {
			JobConfig temp = new JobConfig();
			System.out.println(job.toString());
			temp.setRunStatus("1");
			example = new JobConfigExample();
			criteria = example.createCriteria();
			criteria.andIdEqualTo(job.getId());
			criteria.andRunStatusEqualTo("0");
			count = mapper.updateByExampleSelective(temp, example);
			if (count > 0) {
				finallist.add(job);
			}
			temp = null;
		}
		list = null;
		System.out.println(finallist.size());
		return finallist;
	}

	public boolean updateByIdRunStatus(JobConfig entity, String status) {
		int count = 0;
		JobConfigExample example = new JobConfigExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(entity.getId());
		criteria.andRunStatusGreaterThan("-1");
		JobConfig temp = new JobConfig();
		temp.setRunStatus(status);
		temp.setUpdateTime(VeDate.getNow());
		count = mapper.updateByExampleSelective(temp, example);
		if (count > 0) {
			return true;
		}
		return false;
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
