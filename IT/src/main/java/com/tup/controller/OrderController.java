package com.tup.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.tup.commons.base.DbcontextHolder;
import com.tup.commons.base.RequestOrderParamHelper;
import com.tup.commons.base.UpdOrders;
import com.tup.commons.utils.PageInfo;
import com.tup.mssql.model.OrderHeaderInVoExample;
import com.tup.mssql.model.OrderHeaderInVoExample.Criteria;
import com.tup.service.IOrderService;

@Controller
@RequestMapping("/ordersync")
public class OrderController  {
	@Autowired
	private IOrderService iOrderService;

	/* (non-Javadoc)
	 * @see com.tup.controller.SDFDSF#dataGrid(java.lang.Integer, java.lang.Integer, java.lang.String)
	 */
//	@PostMapping("/dataGrid") 
//	@ResponseBody
//	public PageInfo dataGrid(Integer page, Integer rows,String orderno) {
//		PageInfo pageInfo = new PageInfo(page, rows);
//		Map<String, Object> condition = new HashMap<String, Object>();
//		pageInfo.setCondition(condition);
//		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
//		iOrderService.selectDataGrid(pageInfo);
//		//pageInfo.setTotal(111);
//		DbcontextHolder.clearDbType();// 恢复默认数据源
//		return pageInfo;
//	}
	
	@PostMapping("/dataGrid") 
	@ResponseBody
	public PageInfo dataGrid(RequestOrderParamHelper order) {
		System.out.println(order.toString());
		PageInfo pageInfo = new PageInfo(order.getPage(), order.getRows());
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
		iOrderService.setHelper(order).selectDataGridVo(pageInfo);
		//pageInfo.setTotal(111);
		DbcontextHolder.clearDbType();// 恢复默认数据源
		return pageInfo;
	}
	
	/* (non-Javadoc)
	 * @see com.tup.controller.SDFDSF#search(java.lang.Integer, java.lang.Integer)
	 */
	@PostMapping("/search") 
	@ResponseBody
	public PageInfo search(Integer page, Integer rows) {
		PageInfo pageInfo = new PageInfo(page, rows);
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
		iOrderService.selectDataGrid(pageInfo);
		//pageInfo.setTotal(111);
		DbcontextHolder.clearDbType();// 恢复默认数据源
		return pageInfo;
	}
	
	/* (non-Javadoc)
	 * @see com.tup.controller.SDFDSF#updateAll()
	 */
	@PostMapping("/updateAll") 
	@ResponseBody
	public PageInfo updateAll() {
		PageInfo pageInfo = new PageInfo();
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
		iOrderService.selectDataGrid(pageInfo);
		//pageInfo.setTotal(111);
		DbcontextHolder.clearDbType();// 恢复默认数据源
		return pageInfo;
	}
	
	/* (non-Javadoc)
	 * @see com.tup.controller.SDFDSF#update(com.tup.commons.base.UpdOrders[])
	 */
	@PostMapping("/update") 
	@ResponseBody
	public PageInfo update(@RequestBody UpdOrders[] orders) {
		PageInfo pageInfo = new PageInfo(  );
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
		iOrderService.selectDataGrid(pageInfo);
		//pageInfo.setTotal(111);
		DbcontextHolder.clearDbType();// 恢复默认数据源
		return pageInfo;
	}
	// public void test(){
 
}
