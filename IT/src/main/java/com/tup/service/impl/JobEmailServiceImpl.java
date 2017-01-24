package com.tup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.PageInfo;
import com.tup.form.JobEmailHelper;
import com.tup.mapper.JobEmailMapper;
import com.tup.model.JobEmail;
import com.tup.model.JobEmailExample;
import com.tup.model.JobEmailExample.Criteria;
import com.tup.service.IJobEmailService;
/**
 * <p>
 *   服务实现类
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Service
public class JobEmailServiceImpl extends ServiceImpl<JobEmailMapper, JobEmail> implements IJobEmailService {
	@Autowired private JobEmailMapper mapper;
	 
	private JobEmailHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(JobEmailHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(JobEmail entity) {
		return super.insert(entity);
	}
	
	public List<JobEmail>  selectMailList(int size) { 
		JobEmailExample example = new JobEmailExample(); 
		example.setOffset("0");//mysql
		example.setRows(String.valueOf(size));
		Criteria criteria = example.createCriteria();
		List<JobEmail> list = mapper.selectByExample(example);
		return list;
	}

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		JobEmailExample example = new JobEmailExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<JobEmail> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
	
	
}
