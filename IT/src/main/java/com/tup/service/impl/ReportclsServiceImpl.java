package com.tup.service.impl;

import com.tup.model.Reportcls;
import com.tup.mapper.ReportclsMapper;
import com.tup.service.IReportclsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tup.commons.utils.PageInfo;
import com.tup.form.ReportclsHelper;
import com.tup.mapper.ReportclsMapper;
import com.tup.model.Reportcls;
import com.tup.model.ReportclsExample;
import com.tup.model.ReportclsExample.Criteria;
import com.tup.service.IReportclsService;
/**
 * <p>
 *   服务实现类
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Service
public class ReportclsServiceImpl extends ServiceImpl<ReportclsMapper, Reportcls> implements IReportclsService {
	@Autowired private ReportclsMapper mapper;
	 
	private ReportclsHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(ReportclsHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(Reportcls entity) {
		return super.insert(entity);
	}
	
 

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		ReportclsExample example = new ReportclsExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Reportcls> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
	
	
}
