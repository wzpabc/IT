package com.tup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tup.commons.utils.PageInfo;
import com.tup.form.TableauuserHelper;
import com.tup.mapper.TableauuserMapper;
import com.tup.model.Tableauuser;
import com.tup.model.TableauuserExample;
import com.tup.model.TableauuserExample.Criteria;
import com.tup.service.ITableauuserService;
/**
 * <p>
 *   服务实现类
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Service
public class TableauuserServiceImpl extends ServiceImpl<TableauuserMapper, Tableauuser> implements ITableauuserService {
	@Autowired private TableauuserMapper mapper;
	 
	private TableauuserHelper helper;

	private int count = 0;

	@Autowired
	public void setBaseMapper() {
		super.baseMapper = mapper;
	}

	
	public void setHelper(TableauuserHelper helper) {
		this.helper = helper;
	}

	
	public boolean Add(Tableauuser entity) {
		return super.insert(entity);
	}
	
 

	public void selectDataGrid(PageInfo pageInfo) {
		System.out.println(helper.toString());
		TableauuserExample example = new TableauuserExample();
		example.setOrderByClause(helper.getSort() + " " + helper.getOrder());
		example.setOffset(String.valueOf(((helper.getPage() - 1) * helper.getRows())));//mysql
		example.setRows(String.valueOf(helper.getRows()));
		Criteria criteria = example.createCriteria();

		List<Tableauuser> list = mapper.selectByExample(example);
		pageInfo.setRows(list);
		count = mapper.countByExample(example);
		pageInfo.setTotal(count);
	}
	
	
}
