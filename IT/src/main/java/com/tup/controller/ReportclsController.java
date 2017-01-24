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
import com.tup.model.Reportcls;
import com.tup.service.IReportclsService;
import com.tup.form.ReportclsHelper;


/**
 * <p>
 *   前端控制器
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Controller
@RequestMapping("/reportcls")
public class ReportclsController extends BaseController {
	
	@Autowired private IReportclsService reportclsService;
	
	@GetMapping("/manager")
    public String manager() {
        return "admin/reportcls/reportcls";
    }


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(ReportclsHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        reportclsService.setHelper(helper);
        reportclsService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "admin/reportcls/reportclsAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(Reportcls reportcls) {
    	reportcls.setCreatetime(new Date());
    	reportcls.setCreatetime(new Date());
        boolean b = reportclsService.insert(reportcls);
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
    	Reportcls reportcls = new Reportcls();
    	//reportcls.setId(id);
    	reportcls.setCreatetime(new Date());
    	reportcls.setDeleteflag(1);
    	boolean b = reportclsService.updateById(reportcls);
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
        Reportcls reportcls = reportclsService.selectById(id);
        model.addAttribute("reportcls", reportcls);
        return "admin/reportcls/reportclsEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Reportcls reportcls) {
    	reportcls.setCreatetime(new Date());
    	boolean b = reportclsService.updateById(reportcls);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
