package com.tup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.PageInfo;
import com.tup.form.EmailHelper;
import com.tup.mapper.EmailMapper;
import com.tup.model.Email;
import com.tup.model.EmailExample;
import com.tup.model.EmailExample.Criteria;
import com.tup.service.IEmailService;

@Service
public class EmailServiceImpl extends ServiceImpl<EmailMapper, Email> implements IEmailService {
	@Autowired
	private EmailMapper mapper;
	private EmailHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.service.impl.IEmailService#setHelper(com.tup.commons.base.
	 * RequestEmailParamHelper)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.service.impl.IEmailService#setHelper(com.tup.request.form.
	 * EmailHelper)
	 */
	public void setHelper(EmailHelper helper) {
		this.helper = helper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tup.service.impl.IEmailService#selectDataGrid(com.tup.commons.utils.
	 * PageInfo)
	 */
	// @Transactional
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tup.service.impl.IEmailService#selectDataGrid(com.tup.commons.utils.
	 * PageInfo)
	 */
	public boolean Add(Email entity) {
		return super.insert(entity);
	}
	
 

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		EmailExample example = new EmailExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Email> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
}
