package com.zhangxp.online.model;
/***********************************************************************
 * Module:  Order.java
 * Author:  y
 * Purpose: Defines the Class Order
 ***********************************************************************/

import java.sql.Timestamp;
import java.util.*;

/**
 * 订单表
 * 
 * @pdOid 16eb30be-48e2-45b3-ae89-a0c7c98149c7
 */
public class Order {
	/** @pdOid 3a78bbae-19c2-4f6a-b7fd-75e361c8486e */
	private int oid;
	/** @pdOid a80c465b-3eba-4c60-a0dc-1837a7f5fa69 */
	private Timestamp odatetime;
	/** @pdOid 63b2eaf1-0cf8-4480-a682-a831c61c3f9d */
	private String ostate;
	/** @pdOid c0df6f20-4910-4e6a-88fc-5e5a4a6c0a71 */
	private double osummoney;
	/** @pdOid 3cf17374-5154-4c15-9f0d-b63a157962a4 */
	private int cid;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public Timestamp getOdatetime() {
		return odatetime;
	}

	public void setOdatetime(Timestamp odatetime) {
		this.odatetime = odatetime;
	}

	public String getOstate() {
		return ostate;
	}

	public void setOstate(String ostate) {
		this.ostate = ostate;
	}

	public double getOsummoney() {
		return osummoney;
	}

	public void setOsummoney(double osummoney) {
		this.osummoney = osummoney;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

}