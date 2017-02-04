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
import com.tup.model.JobEmail;
import com.tup.service.IJobEmailService;
import com.tup.form.JobEmailHelper;


/**
 * <p>
 *   前端控制器
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Controller
@RequestMapping("/jobEmail")
public class JobEmailController extends BaseController {
	
	@Autowired private IJobEmailService jobEmailService;
	
	@GetMapping("/manager")
    public String manager() {
        return "jobEmail/jobEmail";
    } 


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(JobEmailHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        jobEmailService.setHelper(helper);
        jobEmailService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "jobEmail/jobEmailAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(JobEmail jobEmail) {
    	jobEmail.setCreatetime(new Date());
    	jobEmail.setCreatetime(new Date());
        boolean b = jobEmailService.insert(jobEmail);
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
    	JobEmail jobEmail = new JobEmail();
    	//jobEmail.setId(id);
    	jobEmail.setCreatetime(new Date());
    	jobEmail.setDeleteflag(1);
    	boolean b = jobEmailService.updateById(jobEmail);
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
        JobEmail jobEmail = jobEmailService.selectById(id);
        model.addAttribute("jobEmail", jobEmail);
        return "jobEmail/jobEmailEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(JobEmail jobEmail) {
    	jobEmail.setCreatetime(new Date());
    	boolean b = jobEmailService.updateById(jobEmail);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
