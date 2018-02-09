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
    boolean deleteSysUser(String userId);
    SysUser findByUserId(String userId);
    List<SysUser> findAll();
}