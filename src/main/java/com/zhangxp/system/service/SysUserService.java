package com.zhangxp.system.service;

import java.util.List;

import com.zhangxp.system.model.SysUser;

public interface SysUserService {
	void saveSysUser(SysUser sysUser);
    boolean updateSysUser(SysUser sysUser);
    boolean deleteSysUser(Integer userId);
    SysUser findByUserId(Integer userId);
    SysUser findByUserName(String userName);
    List<SysUser> findAll();
}
