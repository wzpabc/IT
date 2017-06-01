package com.tup.service.impl;

import com.tup.model.Mailtemp;
import com.tup.mapper.MailtempMapper;
import com.tup.service.IMailtempService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.tup.commons.utils.PageInfo;
import com.tup.form.MailtempHelper;
import com.tup.mapper.MailtempMapper;
import com.tup.model.Mailtemp;
import com.tup.model.MailtempExample;
import com.tup.model.MailtempExample.Criteria;
import com.tup.service.IMailtempService;
/**
 * <p>
 *   服务实现类
 * </p>
 * @author patrick.wang
 * @since 2017-05-27
 */
@Service
public class MailtempServiceImpl extends ServiceImpl<MailtempMapper, Mailtemp> implements IMailtempService {
	@Autowired private MailtempMapper mapper;
	 
	private MailtempHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(MailtempHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(Mailtemp entity) {
		return super.insert(entity);
	}
	
 

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		MailtempExample example = new MailtempExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Mailtemp> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
	
	
}
