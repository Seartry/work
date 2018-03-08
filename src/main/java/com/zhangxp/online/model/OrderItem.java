package com.zhangxp.online.model;
/***********************************************************************
 * Module:  OrderItem.java
 * Author:  y
 * Purpose: Defines the Class OrderItem
 ***********************************************************************/

import java.util.*;

/**
 * 订单项表
 * 
 * @pdOid 4a71eeb1-c88d-4cd2-9db2-4fc9844ebb6c
 */
public class OrderItem {
	/** @pdOid c54960ef-6630-4f1f-874f-e37827fd9566 */
	private int oiid;
	/** @pdOid d54d4660-beec-4bfa-9454-a7a7c05b4f32 */
	private int iobuynum;
	/** @pdOid 8f2f8542-fc9b-4a95-8394-f01154a76525 */
	private double iosummoney;
	/** @pdOid 1222ec8b-30fc-41f6-bfe2-68d2f9014d41 */
	private int pid;
	/** @pdOid a59781dc-35d3-412d-8228-c49944009e89 */
	private int oid;

	public int getOiid() {
		return oiid;
	}

	public void setOiid(int oiid) {
		this.oiid = oiid;
	}

	public int getIobuynum() {
		return iobuynum;
	}

	public void setIobuynum(int iobuynum) {
		this.iobuynum = iobuynum;
	}

	public double getIosummoney() {
		return iosummoney;
	}

	public void setIosummoney(double iosummoney) {
		this.iosummoney = iosummoney;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

}