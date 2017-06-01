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
import com.tup.model.Maillist;
import com.tup.service.IMaillistService;
import com.tup.form.MaillistHelper;


/**
 * <p>
 *   前端控制器
 * </p>
 * @author patrick.wang
 * @since 2017-05-27
 */
@Controller
@RequestMapping("/maillist")
public class MaillistController extends BaseController {
	
	@Autowired private IMaillistService maillistService;
	
	@GetMapping("/manager")
    public String manager() {
        return "admin/maillist/maillist";
    }


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(MaillistHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        maillistService.setHelper(helper);
        maillistService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "admin/maillist/maillistAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(Maillist maillist) {
    	maillist.setCreatetime(new Date());
    	maillist.setCreatetime(new Date());
        boolean b = maillistService.insert(maillist);
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
    	Maillist maillist = new Maillist();
    	//maillist.setId(id);
    	maillist.setCreatetime(new Date());
    	maillist.setDeleteflag(1);
    	boolean b = maillistService.updateById(maillist);
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
        Maillist maillist = maillistService.selectById(id);
        model.addAttribute("maillist", maillist);
        return "admin/maillist/maillistEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Maillist maillist) {
    	maillist.setCreatetime(new Date());
    	boolean b = maillistService.updateById(maillist);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
