package com.zhangxp.system.dao;

import java.util.List;

import com.zhangxp.system.model.SysUser;
/**
 * 描述：用户mapper接口
 * @author y
 *
 */
public interface SysUserMapper {
	void saveSysUser(SysUser sysUser);
    boolean updateSysUser(SysUser sysUser);
    boolean deleteSysUser(Integer userId);
    SysUser findByUserId(Integer userId);
    SysUser findByUserName(String userName);
    List<SysUser> findAll();
}