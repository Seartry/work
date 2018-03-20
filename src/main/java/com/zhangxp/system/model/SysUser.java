package com.zhangxp.system.model;

/**
 * 用户信息
 */
public class SysUser {
    // 成员变量
    private Integer userId;
    private String userName;
    private String password;
    
    public SysUser() {
		super();
	}
	public SysUser(Integer userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SysUser [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

}