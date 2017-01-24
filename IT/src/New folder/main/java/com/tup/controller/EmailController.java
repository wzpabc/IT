package com.tup.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tup.commons.base.BaseController;
import com.tup.commons.utils.PageInfo;
import com.tup.form.EmailHelper;
import com.tup.model.Role;
import com.tup.service.IEmailService;

@Controller
@RequestMapping("/mail")
public class EmailController extends BaseController {

	@Autowired
	private IEmailService Service;
	private String homePath="/mail";

	/**
	 * 理页
	 *
	 * @return
	 */
	@GetMapping("/")
	public String home() {
		return homePath+"/home";
	}


	@PostMapping("/dataGrid")
	@ResponseBody
	public Object dataGrid(EmailHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		Service.setHelper(helper);
		Service.selectDataGrid(pageInfo);
		return pageInfo;
	}

	@GetMapping("/addPage")
	public String addPage() {
		return homePath+"/Add";
	}

	/**
	 * 添加权限
	 *
	 * @param role
	 * @return
	 */
	@PostMapping("/add")
	@ResponseBody
	public Object add(Role role) {
		// roleService.insert(role);
		return renderSuccess("添加成功！");
	}

	/**
	 * 删除权限
	 *
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(Long id) {
		// roleService.deleteById(id);
		return renderSuccess("删除成功！");
	}

	/**
	 * 编辑权限页
	 *
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("/editPage")
	public String editPage(Model model, Long id) {
		// Role role = roleService.selectById(id);
		// model.addAttribute("role", role);
		return homePath+"/Edit";
	}

	/**
	 * 删除权限
	 *
	 * @param role
	 * @return
	 */
	@RequestMapping("/edit")
	@ResponseBody
	public Object edit(Role role) {
		// roleService.updateById(role);
		return renderSuccess("编辑成功！");
	}

	/**
	 * 授权页面
	 *
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/grantPage")
	public String grantPage(Long id, Model model) {
		model.addAttribute("id", id);
		return homePath+"/Grant";
	}

	
}
