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
import com.tup.model.Mailtemp;
import com.tup.service.IMailtempService;
import com.tup.form.MailtempHelper;


/**
 * <p>
 *   前端控制器
 * </p>
 * @author patrick.wang
 * @since 2017-05-27
 */
@Controller
@RequestMapping("/mailtemp")
public class MailtempController extends BaseController {
	
	@Autowired private IMailtempService mailtempService;
	
	@GetMapping("/manager")
    public String manager() {
        return "admin/mailtemp/mailtemp";
    }


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(MailtempHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        mailtempService.setHelper(helper);
        mailtempService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "admin/mailtemp/mailtempAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(Mailtemp mailtemp) {
    	mailtemp.setCreatetime(new Date());
    	mailtemp.setCreatetime(new Date());
        boolean b = mailtempService.insert(mailtemp);
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
    	Mailtemp mailtemp = new Mailtemp();
    	//mailtemp.setId(id);
    	mailtemp.setCreatetime(new Date());
    	mailtemp.setDeleteflag(1);
    	boolean b = mailtempService.updateById(mailtemp);
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
        Mailtemp mailtemp = mailtempService.selectById(id);
        model.addAttribute("mailtemp", mailtemp);
        return "admin/mailtemp/mailtempEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Mailtemp mailtemp) {
    	mailtemp.setCreatetime(new Date());
    	boolean b = mailtempService.updateById(mailtemp);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
