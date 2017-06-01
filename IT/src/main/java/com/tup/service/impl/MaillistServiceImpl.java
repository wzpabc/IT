package com.tup.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.Convertor;
import com.tup.commons.utils.PageInfo;
import com.tup.form.MaillistHelper;
import com.tup.mapper.MaillistMapper;
import com.tup.model.JobEmail;
import com.tup.model.Maillist;
import com.tup.model.MaillistExample;
import com.tup.model.MaillistExample.Criteria;
import com.tup.service.IMaillistService;

/**
 * <p>
 * 服务实现类
 * </p>
 * 
 * @author patrick.wang
 * @since 2017-05-27
 */
@Service
public class MaillistServiceImpl extends ServiceImpl<MaillistMapper, Maillist> implements IMaillistService {
	@Autowired
	private MaillistMapper mapper;

	private MaillistHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	public void setHelper(MaillistHelper helper) {
		this.helper = helper;
	}

	public boolean Add(Maillist entity) {
		return super.insert(entity);
	}

	public Boolean markSuccess(Maillist entity) {
		entity.setStatus(1);
		entity.setUpdatetime(new Date());
		MaillistExample example = new MaillistExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(2);// 2->1
		criteria.andIdEqualTo(entity.getId());
		int cnt = mapper.updateByExampleSelective(entity, example);
		if (cnt >0) {
			return true;
		}
		return false;
		
	}

	public Boolean markFail(Maillist entity) {
		entity.setStatus(3);
		entity.setUpdatetime(new Date());
		entity.setRetrytimes(entity.getRetrytimes()+1);
		MaillistExample example = new MaillistExample();
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(2);// 2->3
		criteria.andIdEqualTo(entity.getId());
		int cnt = mapper.updateByExampleSelective(entity, example);
		if (cnt >0) {
			return true;
		}
		return false;
	}

	public List<Maillist> selectMailList(int size) {
		MaillistExample example = new MaillistExample();
		example.setOrderByClause(" id asc");
		example.setOffset("0");// mysql
		example.setRows(String.valueOf(size));
		Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(3);// started 3
		criteria.andRetrytimesLessThan(5);
		criteria.andExecdateLessThanOrEqualTo(new Date());
		List<Maillist> list = mapper.selectByExample(example);
		example.clear();

		for (int i = 0; i < list.size(); i++) {
			Maillist entity = list.get(i);
			entity.setStatus(2);// process 2 finish 1
			entity.setUpdatetime(new Date());
			example = new MaillistExample();
			criteria = example.createCriteria();
			criteria.andIdEqualTo(entity.getId());
			criteria.andStatusEqualTo(3);// 3-->2
			int cnt = mapper.updateByExampleSelective(entity, example);
			if (cnt < 1) {
				list.remove(i);
			}

			// System.out.println(list.get(i));
		}
		return list;
	}

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		MaillistExample example = new MaillistExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));// mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Maillist> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}

}
