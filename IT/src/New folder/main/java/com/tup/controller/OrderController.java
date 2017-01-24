package com.tup.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tup.commons.base.BaseController;
import com.tup.commons.base.DbcontextHolder;
import com.tup.commons.utils.PageInfo;
import com.tup.form.OrderHelper;
import com.tup.form.OrdernoHelper;
import com.tup.service.IOrderService;

@Controller
@RequestMapping("/ordersync")
public class OrderController  extends BaseController {
	@Autowired
	private IOrderService iOrderService;

	private Integer count = 0;

	@PostMapping("/dataGrid")
	@ResponseBody
	public PageInfo dataGrid(OrderHelper order) {
		PageInfo pageInfo = new PageInfo(order.getPage(), order.getRows());
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
		iOrderService.setHelper(order);
		iOrderService.selectDataGridVo(pageInfo);
		DbcontextHolder.clearDbType();// 恢复默认数据源
		return pageInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.controller.SDFDSF#search(java.lang.Integer,
	 * java.lang.Integer)
	 */
	@PostMapping("/search")
	@ResponseBody
	public PageInfo search(Integer page, Integer rows) {
		PageInfo pageInfo = new PageInfo(page, rows);
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
		iOrderService.selectDataGrid(pageInfo);
		DbcontextHolder.clearDbType();// 恢复默认数据源
		return pageInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.controller.SDFDSF#updateAll()
	 */
	@PostMapping("/updateAll")
	@ResponseBody
	public int updateAll() {
		this.count = 0;
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
		count = iOrderService.updateAll();
		DbcontextHolder.clearDbType();// 恢复默认数据源
		return count;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.controller.SDFDSF#update(com.tup.commons.base.UpdOrders[])
	 */
	@PostMapping("/update")
	@ResponseBody
	public int update(@RequestBody OrdernoHelper[] orders) {
		this.count = 0;
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_SQLSERVER);// 切换数据源
		OrderHelper helper = new OrderHelper();
		for (OrdernoHelper order : orders) {
			helper.setOrderno(order.getOrderno());
			iOrderService.setHelper(helper);
			count += iOrderService.updateJdestatusBySyvr01();
		}
		DbcontextHolder.clearDbType();// 恢复默认数据源
		return count;
	}

}
