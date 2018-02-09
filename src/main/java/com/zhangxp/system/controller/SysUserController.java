package com.zhangxp.system.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangxp.system.model.SysUser;
import com.zhangxp.system.service.SysUserService;

/**
 * 用户控制器
 */
@Controller
@RequestMapping(value = "/sysUser")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    /**
     * 跳转到添加用户界面
     * @return
     */
    @RequestMapping("/toAddSysUser")
    public String toAddSysUser() {
        return "addSysUser";
    }

    /**
     * 添加用户并重定向
     * @param model
     * @param sysUser
     * @return
     */
    @RequestMapping("/addSysUser")
    public String addSysUser(Model model,SysUser sysUser) {
    	if(sysUser != null) {
    		sysUserService.saveSysUser(sysUser);
    	}
        return "redirect:/sysUser/sysUserInfo";
    }

    /**
     * 编辑用户
     * @param model
     * @param sysUser
     * @return
     */
    @RequestMapping("/updateSysUser")
    public String updateSysUser(Model model,SysUser sysUser) {
        if(sysUserService.updateSysUser(sysUser)) {
        	sysUser = sysUserService.findByUserId(sysUser.getUserId());
        	model.addAttribute("sysUser", sysUser);
        	return "redirect:/sysUser/sysUserInfo";
        }
        return "/error";
    }
    
    /**
     * 查询所有的用户
     * @return
     */
    @RequestMapping("/getAllSysUser")
    public String getAllSysUser(Model model) {
    	List<SysUser> userList = sysUserService.findAll();
    	model.addAttribute("sysUser", userList);
    	return "allSysUser";
    }
    
    /**
     * 查询单个用户
     * @param username
     * @param model
     * @return
     */
    @RequestMapping("/getSysUser")
    public String getSysUser(String userId,Model model) {
    	SysUser sysUser = sysUserService.findByUserId(userId);
    	model.addAttribute("sysUser",sysUser);
    	return "editSysUser";
    }
    /**
     * 根据username删除用户
     * @param username
     * @param model
     * @return
     */
    @RequestMapping("/delSysUser")
    public String deleteSysUser(String userId,Model model) {
    	model.addAttribute("sysUser", sysUserService.deleteSysUser(userId));
    	return "redirect:/sysUser/sysUserInfo";
    }
    /**
     * 分页查询用户信息
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("/sysUserInfo")
    public String getSysUsers(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
    	//从第一条开始 每页查询五条数据
    	PageHelper.startPage(pn, 5);
    	List<SysUser> sysUsers = sysUserService.findAll();
    	System.out.println("sysUsers的值是：----->");
    	for (SysUser sysUser : sysUsers) {
			System.out.println(sysUser.toString());
		}
    	System.out.println();
    	//将用户信息放入PageInfo对象里
    	PageInfo page = new PageInfo(sysUsers,5);
    	model.addAttribute("pageInfo",page);
    	System.out.println(sysUsers.size());
    	return "allSysUser";
    }
    
    
}