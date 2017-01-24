package com.tup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.PageInfo;
import com.tup.form.UsermappingHelper;
import com.tup.mapper.UsermappingMapper;
import com.tup.model.Usermapping;
import com.tup.model.UsermappingExample;
import com.tup.model.UsermappingExample.Criteria;
import com.tup.service.IUsermappingService;
/**
 * <p>
 *   服务实现类
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Service
public class UsermappingServiceImpl extends ServiceImpl<UsermappingMapper, Usermapping> implements IUsermappingService {
	@Autowired private UsermappingMapper mapper;
	 
	private UsermappingHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(UsermappingHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(Usermapping entity) {
		return super.insert(entity);
	}
	
 

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		UsermappingExample example = new UsermappingExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Usermapping> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
	
	
}
