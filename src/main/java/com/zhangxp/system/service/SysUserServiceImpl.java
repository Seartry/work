package com.zhangxp.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangxp.system.dao.SysUserMapper;
import com.zhangxp.system.model.SysUser;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper userMapper;

	public void saveSysUser(SysUser sysUser) {
		userMapper.saveSysUser(sysUser);
	}

	public boolean updateSysUser(SysUser sysUser) {
		return userMapper.updateSysUser(sysUser);
	}

	public boolean deleteSysUser(Integer userId) {
		return userMapper.deleteSysUser(userId);
	}

	public SysUser findByUserId(Integer userId) {
		return userMapper.findByUserId(userId);
	}

	public List<SysUser> findAll() {
		return userMapper.findAll();
	}

	public SysUser findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userMapper.findByUserName(userName);
	}

}
