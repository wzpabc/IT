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
import com.tup.form.JobconfigHelper;
import com.tup.model.Role;
import com.tup.service.IJobConfigService;

/**
 * @description：权限管理
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
@Controller
@RequestMapping("/jobconfig")
public class JobConfigController extends BaseController {

    @Autowired
    private IJobConfigService Service;

    /**
     * 权限管理页
     *
     * @return
     */
    @GetMapping("/manage")
    public String manager() {
        return "/job/manage";
    }

    /**
     * 权限列表
     *
     * @param page
     * @param rows
     * @param sort
     * @param order
     * @return
     */
    @PostMapping("/dataGrid")
    @ResponseBody
    public Object dataGrid( JobconfigHelper helper) {
        PageInfo pageInfo = new PageInfo(helper.getPage(), helper.getRows(), helper.getSort(), helper.getOrder());
        Map<String, Object> condition = new HashMap<String, Object>();
        pageInfo.setCondition(condition);
        Service.setHelper(helper);
        Service.selectDataGrid(pageInfo);
        return pageInfo;
    }

    
    @GetMapping("/addPage")
    public String addPage() {
        return "admin/roleAdd";
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
        //roleService.insert(role);
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
        //roleService.deleteById(id);
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
        //Role role = roleService.selectById(id);
       // model.addAttribute("role", role);
        return "admin/roleEdit";
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
        return "admin/roleGrant";
    }

    /**
     * 授权页面页面根据角色查询资源
     *
     * @param id
     * @return
     */
    @RequestMapping("/findResourceIdListByRoleId")
    @ResponseBody
    public Object findResourceByRoleId(Long id) {
       // List<Long> resources = roleService.selectResourceIdListByRoleId(id);
        return null;
    }

    /**
     * 授权
     *
     * @param id
     * @param resourceIds
     * @return
     */
    @RequestMapping("/grant")
    @ResponseBody
    public Object grant(Long id, String resourceIds) {
      //  roleService.updateRoleResource(id, resourceIds);
        return renderSuccess("授权成功！");
    }

}
