package com.tup.service.impl;

import com.tup.model.Fmsuser;
import com.tup.mapper.FmsuserMapper;
import com.tup.service.IFmsuserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tup.commons.utils.PageInfo;
import com.tup.form.FmsuserHelper;
import com.tup.mapper.FmsuserMapper;
import com.tup.model.Fmsuser;
import com.tup.model.FmsuserExample;
import com.tup.model.FmsuserExample.Criteria;
import com.tup.service.IFmsuserService;
/**
 * <p>
 *   服务实现类
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Service
public class FmsuserServiceImpl extends ServiceImpl<FmsuserMapper, Fmsuser> implements IFmsuserService {
	@Autowired private FmsuserMapper mapper;
	 
	private FmsuserHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(FmsuserHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(Fmsuser entity) {
		return super.insert(entity);
	}
	
 

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		FmsuserExample example = new FmsuserExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Fmsuser> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
	
	
}
