package com.tup.service.impl;

import com.tup.model.Outletstock;
import com.tup.mapper.OutletstockMapper;
import com.tup.service.IOutletstockService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tup.commons.utils.PageInfo;
import com.tup.form.OutletstockHelper;
import com.tup.mapper.OutletstockMapper;
import com.tup.model.Outletstock;
import com.tup.model.OutletstockExample;
import com.tup.model.OutletstockExample.Criteria;
import com.tup.service.IOutletstockService;
/**
 * <p>
 *   服务实现类
 * </p>
 * @author patrick.wang
 * @since 2017-02-04
 */
@Service
public class OutletstockServiceImpl extends ServiceImpl<OutletstockMapper, Outletstock> implements IOutletstockService {
	@Autowired private OutletstockMapper mapper;
	 
	private OutletstockHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(OutletstockHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(Outletstock entity) {
		return super.insert(entity);
	}
	
 

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		OutletstockExample example = new OutletstockExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Outletstock> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
	
	
}
