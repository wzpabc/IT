package com.tup.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tup.commons.base.DbcontextHolder;
import com.tup.commons.utils.PageInfo;
import com.tup.service.IOrderService;

@Controller
@RequestMapping("/ordersync")
public class OrderController {
	@Autowired
	private IOrderService iOrderService;

	//@PostMapping("/dataGrid")
	@RequestMapping(value="/dataGrid")
	@ResponseBody
	public PageInfo dataGrid(Integer page, Integer rows) {
		PageInfo pageInfo = new PageInfo(page, rows);
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		DbcontextHolder.setDbType(DbcontextHolder.DATA_SOURCE_ORG);// 切换数据源
		iOrderService.selectDataGrid(pageInfo);
		//pageInfo.setTotal(111);
		DbcontextHolder.clearDbType();// 恢复默认数据源
		return pageInfo;
	}
	// public void test(){

	// ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[]
	// {"conf/app-context.xml"});
	// IAuthenticate service = (IAuthenticate)cxt.getBean("iAuthenticate");
	// SysOrg org = new SysOrg();
	// org.setOrgId(123456789L);
	// org.setOrgName("测试数据源");
	// org.setAreaid(1L);
	// //service.add(org);
	// List<ISysOrg> sysorg_ =service.getAllOrgs();
	// JSONArray json =JSONArray.fromObject(sysorg_);
	// System.out.println(json.toString());
	// DbContextHolder.setDbType(DbContextHolder.DATA_SOURCE_ORG);//切换数据源
	// List<ISysOrg> sysorg_1 =service.getAllOrgs();
	// JSONArray json1 =JSONArray.fromObject(sysorg_1);
	// System.out.println(json1.toString());
	// DbContextHolder.clearDbType();//恢复默认数据源
	// }
}
