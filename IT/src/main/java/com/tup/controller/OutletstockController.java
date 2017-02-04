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
import com.tup.model.Outletstock;
import com.tup.service.IOutletstockService;
import com.tup.form.OutletstockHelper;


/**
 * <p>
 *   前端控制器
 * </p>
 * @author patrick.wang
 * @since 2017-02-04
 */
@Controller
@RequestMapping("/outletstock")
public class OutletstockController extends BaseController {
	
	@Autowired private IOutletstockService outletstockService;
	
	@GetMapping("/manager")
    public String manager() {
        return "outletstock/outletstock";
    }
	
	@GetMapping("/stockcacl")
    public String stockcacl() {
        return "stockcacl";
    }
	
    @PostMapping("/dataGrid")
    @ResponseBody
    public PageInfo dataGrid(OutletstockHelper helper) {
		PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        outletstockService.setHelper(helper);
        outletstockService.selectDataGrid(pageInfo);
        return pageInfo;
    }
    
    /**
     * 添加页面
     * @return
     */
    @GetMapping("/addPage")
    public String addPage() {
        return "outletstock/outletstockAdd";
    }

    /**
     * 添加
     * @param 
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public Object add(Outletstock outletstock) {
//    	outletstock.setCreatetime(new Date());
//    	outletstock.setCreatetime(new Date());
        boolean b = outletstockService.insert(outletstock);
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
    	Outletstock outletstock = new Outletstock();
//    	//outletstock.setId(id);
//    	outletstock.setCreatetime(new Date());
//    	outletstock.setDeleteflag(1);
     	boolean b = outletstockService.updateById(outletstock);
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
        Outletstock outletstock = outletstockService.selectById(id);
        model.addAttribute("outletstock", outletstock);
        return "outletstock/outletstockEdit";
    }

    /**
     * 编辑
     * @param 
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Object edit(Outletstock outletstock) {
//    	outletstock.setCreatetime(new Date());
    	boolean b = outletstockService.updateById(outletstock);
        if (b) {
        	return renderSuccess("编辑成功！");
		} else {
			return renderError("编辑失败！");
		}
    }
    
	
	
	
}
