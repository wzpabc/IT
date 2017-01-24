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
import com.tup.model.Usermapping;
import com.tup.service.IUsermappingService;
import com.tup.form.UsermappingHelper;


/**
 * <p>
 *   前端控制器
 * </p>
 * @author patrick.wang
 * @since 2017-01-23
 */
@Controller
@RequestMapping("/usermapping")
public class UsermappingController extends BaseController {
	
	@Autowired private IUsermappingService usermappingService;
	
	@GetMapping("/manager")
    public String manager() {
        return "admin/usermapping/usermapping";
    }


    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(UsermappingHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        usermappingService.setHelper(helper);
        usermappingService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "admin/usermapping/usermappingAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(Usermapping usermapping) {
    	usermapping.setCreatetime(new Date());
    	usermapping.setCreatetime(new Date());
        boolean b = usermappingService.insert(usermapping);
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
    	Usermapping usermapping = new Usermapping();
    	//usermapping.setId(id);
    	usermapping.setCreatetime(new Date());
    	usermapping.setDeleteflag(1);
    	boolean b = usermappingService.updateById(usermapping);
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
        Usermapping usermapping = usermappingService.selectById(id);
        model.addAttribute("usermapping", usermapping);
        return "admin/usermapping/usermappingEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Usermapping usermapping) {
    	usermapping.setCreatetime(new Date());
    	boolean b = usermappingService.updateById(usermapping);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
