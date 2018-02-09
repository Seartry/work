package com.zhangxp.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangxp.system.dao.SysUserMapper;
import com.zhangxp.system.model.SysUser;
@Service
public class SysUserServiceImpl implements SysUserService{

	@Autowired
	private SysUserMapper userMapper;

	@Override
	public void saveSysUser(SysUser sysUser) {
		userMapper.saveSysUser(sysUser);
	}

	@Override
	public boolean updateSysUser(SysUser sysUser) {
		return userMapper.updateSysUser(sysUser);
	}

	@Override
	public boolean deleteSysUser(String userId) {
		return userMapper.deleteSysUser(userId);
	}

	@Override
	public SysUser findByUserId(String userId) {
		return userMapper.findByUserId(userId);
	}
	
	@Override
	public List<SysUser> findAll() {
		return userMapper.findAll();
	}

}
