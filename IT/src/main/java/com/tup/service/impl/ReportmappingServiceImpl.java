package com.tup.service.impl;

import com.tup.model.Reportmapping;
import com.tup.mapper.ReportmappingMapper;
import com.tup.service.IReportmappingService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tup.commons.utils.PageInfo;
import com.tup.form.ReportmappingHelper;
import com.tup.mapper.ReportmappingMapper;
import com.tup.model.Reportmapping;
import com.tup.model.ReportmappingExample;
import com.tup.model.ReportmappingExample.Criteria;
import com.tup.service.IReportmappingService;
/**
 * <p>
 *   服务实现类
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Service
public class ReportmappingServiceImpl extends ServiceImpl<ReportmappingMapper, Reportmapping> implements IReportmappingService {
	@Autowired private ReportmappingMapper mapper;
	 
	private ReportmappingHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(ReportmappingHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(Reportmapping entity) {
		return super.insert(entity);
	}
	
 

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		ReportmappingExample example = new ReportmappingExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Reportmapping> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
	
	
}
