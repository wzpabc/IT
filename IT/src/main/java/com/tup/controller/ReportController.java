package com.tup.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.tup.commons.base.BaseController;
import com.tup.commons.utils.PageInfo;
import com.tup.model.Report;
import com.tup.service.IReportService;
import com.tup.form.ReportHelper;

/**
 * <p>
 * 前端控制器
 * </p>
 * 
 * @author patrick.wang
 * @since 2017-01-23
 */
@Controller
@RequestMapping("/report")
public class ReportController extends BaseController {

	@Autowired
	private IReportService reportService;

	@GetMapping("/manager")
	public String manager() {
		return "/admin/report/report";
	}

	@PostMapping("/dataGrid")
	@ResponseBody
	public PageInfo dataGrid(ReportHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
		Map<String, Object> condition = new HashMap<String, Object>();
		pageInfo.setCondition(condition);
		reportService.setHelper(helper);
		reportService.selectDataGrid(pageInfo);
		return pageInfo;
	}

	/**
	 * 添加页面
	 * 
	 * @return
	 */
	@GetMapping("/addPage")
	public String addPage() {
		return "admin/report/reportAdd";
	}

	/**
	 * 添加
	 * 
	 * @param
	 * @return
	 */
	@PostMapping("/add")
	@ResponseBody
	public Object add(Report report) {
		report.setCreatetime(new Date());
		report.setCreatetime(new Date());
		boolean b = reportService.insert(report);
		if (b) {
			return renderSuccess("添加成功！");
		} else {
			return renderError("添加失败！");
		}
	}

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(Integer id) {
		Report report = new Report();
		// report.setId(id);
		report.setCreatetime(new Date());
		report.setDeleteflag(1);
		boolean b = reportService.updateById(report);
		if (b) {
			return renderSuccess("删除成功！");
		} else {
			return renderError("删除失败！");
		}
	}

	/**
	 * 编辑
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("/editPage")
	public String editPage(Model model, Long id) {
		Report report = reportService.selectById(id);
		model.addAttribute("report", report);
		return "admin/report/reportEdit";
	}

	/**
	 * 编辑
	 * 
	 * @param
	 * @return
	 */
	@RequestMapping("/edit")
	@ResponseBody
	public Object edit(Report report) {
		report.setCreatetime(new Date());
		boolean b = reportService.updateById(report);
		if (b) {
			return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
	}

}
