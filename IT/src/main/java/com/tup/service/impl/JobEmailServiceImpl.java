package com.tup.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.Convertor;
import com.tup.commons.utils.PageInfo;
import com.tup.form.JobEmailHelper;
import com.tup.mapper.JobEmailMapper;
import com.tup.model.JobEmail;
import com.tup.model.JobEmailExample;
import com.tup.model.JobEmailExample.Criteria;
import com.tup.service.IJobEmailService;

/**
 * <p>
 * 服务实现类
 * </p>
 * 
 * @author patrick.wang
 * @since 2017-01-23
 */
@Service
public class JobEmailServiceImpl extends ServiceImpl<JobEmailMapper, JobEmail> implements IJobEmailService {
	@Autowired
	private JobEmailMapper mapper;

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

	public void updateByIdStatus2(JobEmail entity, int status) {
		//System.out.println("selectMailList");
		JobEmailExample example = new JobEmailExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(entity.getId());
		JobEmail temp = new JobEmail();
		temp.setStatus(Convertor.intToByte(status));
		mapper.updateByExampleSelective(temp, example);
		temp = null;
	}

	public List<JobEmail> selectMailList(int size) {
		//System.out.println("selectMailList");
		JobEmailExample example = new JobEmailExample();
		example.setOrderByClause(" id asc");
		example.setOffset("0");// mysql
		example.setRows(String.valueOf(size));
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(Convertor.intToByte(0));// 初始
		List<JobEmail> list = mapper.selectByExample(example);
		example.clear();
		 
		List<JobEmail> finallist = new ArrayList<JobEmail>();

		for (JobEmail entity : list) {
			entity.setStatus(Convertor.intToByte(1));// 处理中
			example = new JobEmailExample();
			criteria=example.createCriteria(); 
			criteria.andStatusEqualTo(Convertor.intToByte(0));
			criteria.andIdEqualTo(entity.getId()); 
			JobEmail temp = new JobEmail();
			temp.setStatus(Convertor.intToByte(1));
			for(JobEmail emal :mapper.selectByExample(example)){
				//System.out.println(emal.toString());
			}
			int cnt = mapper.updateByExampleSelective(temp, example);
			//System.out.println(cnt);
			if (cnt > 0) {
				finallist.add(entity);
			}
			temp = null;
			example.clear();
		}
		list = null;
		//System.out.println(finallist.size());
		return finallist;
	}

	public void selectDataGrid(PageInfo pageInfo) {
		//System.out.println(helper.toString());
		JobEmailExample example = new JobEmailExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));// mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<JobEmail> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}

}
