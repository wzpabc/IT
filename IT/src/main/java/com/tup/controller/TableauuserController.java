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
import com.tup.model.Tableauuser;
import com.tup.service.ITableauuserService;
import com.tup.form.TableauuserHelper;


/**
 * <p>
 *   前端控制器
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Controller
@RequestMapping("/tableauuser")
public class TableauuserController extends BaseController {
	
	@Autowired private ITableauuserService tableauuserService;
	
	@GetMapping("/manager")
    public String manager() {
        return "admin/tableauuser/tableauuser";
    }


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(TableauuserHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        tableauuserService.setHelper(helper);
        tableauuserService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "admin/tableauuser/tableauuserAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(Tableauuser tableauuser) {
    	tableauuser.setCreatetime(new Date());
    	tableauuser.setCreatetime(new Date());
        boolean b = tableauuserService.insert(tableauuser);
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
    	Tableauuser tableauuser = new Tableauuser();
    	//tableauuser.setId(id);
    	tableauuser.setCreatetime(new Date());
    	tableauuser.setDeleteflag(1);
    	boolean b = tableauuserService.updateById(tableauuser);
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
        Tableauuser tableauuser = tableauuserService.selectById(id);
        model.addAttribute("tableauuser", tableauuser);
        return "admin/tableauuser/tableauuserEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Tableauuser tableauuser) {
    	tableauuser.setCreatetime(new Date());
    	boolean b = tableauuserService.updateById(tableauuser);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
