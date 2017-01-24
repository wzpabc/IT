package com.tup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.PageInfo;
import com.tup.form.ReportHelper;
import com.tup.mapper.ReportMapper;
import com.tup.model.Report;
import com.tup.model.ReportExample;
import com.tup.model.ReportExample.Criteria;
import com.tup.service.IReportService;
/**
 * <p>
 *   服务实现类
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Service
public class ReportServiceImpl extends ServiceImpl<ReportMapper, Report> implements IReportService {
	@Autowired private ReportMapper mapper;
	 
	private ReportHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(ReportHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(Report entity) {
		return super.insert(entity);
	}
	
 

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		ReportExample example = new ReportExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Report> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
	
	
}
