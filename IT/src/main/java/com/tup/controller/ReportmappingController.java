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
import com.tup.model.Reportmapping;
import com.tup.service.IReportmappingService;
import com.tup.form.ReportmappingHelper;


/**
 * <p>
 *   前端控制器
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Controller
@RequestMapping("/reportmapping")
public class ReportmappingController extends BaseController {
	
	@Autowired private IReportmappingService reportmappingService;
	
	@GetMapping("/manager")
    public String manager() {
        return "admin/reportmapping/reportmapping";
    }


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(ReportmappingHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        reportmappingService.setHelper(helper);
        reportmappingService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "admin/reportmapping/reportmappingAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(Reportmapping reportmapping) {
    	reportmapping.setCreatetime(new Date());
    	reportmapping.setCreatetime(new Date());
        boolean b = reportmappingService.insert(reportmapping);
        if (b) {
        	return renderSuccess("添加成功！");
		} else {
			return renderError("添加失败！");
		}
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(Integer id) {
    	Reportmapping reportmapping = new Reportmapping();
    	//reportmapping.setId(id);
    	reportmapping.setCreatetime(new Date());
    	reportmapping.setDeleteflag(1);
    	boolean b = reportmappingService.updateById(reportmapping);
    	if (b) {
        	return renderSuccess("删除成功！");
		} else {
			return renderError("删除失败！");
		}
    }

    /**
     * 编辑
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/editPage")
    public String editPage(Model model, Long id) {
        Reportmapping reportmapping = reportmappingService.selectById(id);
        model.addAttribute("reportmapping", reportmapping);
        return "admin/reportmapping/reportmappingEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Reportmapping reportmapping) {
    	reportmapping.setCreatetime(new Date());
    	boolean b = reportmappingService.updateById(reportmapping);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
