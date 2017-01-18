package com.tup.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tup.commons.utils.PageInfo;
import com.tup.service.IJobConfigService;

 
@Controller
@RequestMapping("/job")
public class JobConfigController {
	@Autowired
	private IJobConfigService JobConfigService;

	@GetMapping("/monitor")
	public String monitor() {
		return "job/monitor";
	}
	@GetMapping("/manage")
	public String manager() {
		return "job/manage";
	}
	
	@GetMapping("/order")
	public String ordersync() {
		return "job/ordersync";
	}
	@PostMapping("/home")
	@ResponseBody
	public PageInfo dataGrid(Integer page, Integer rows) {
		PageInfo pageInfo = new PageInfo(page, rows);
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		// sysLogService.selectDataGrid(pageInfo);
		return pageInfo;
	}
}
