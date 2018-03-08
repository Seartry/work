package com.zhangxp.online.model;
/***********************************************************************
 * Module:  Customer.java
 * Author:  y
 * Purpose: Defines the Class Customer
 ***********************************************************************/

import java.util.*;

/**
 * 用户表
 * 
 * @pdOid a41863d0-d829-4809-bbef-265072315120
 */
public class Customer {
	/** @pdOid 11989510-b647-404c-b8be-73b96add3288 */
	private int cid;
	/** @pdOid 735a69ac-68f9-4f03-84ed-a40cc38eee20 */
	private String cname;
	/** @pdOid acc3c8fd-e224-4492-8154-1c992ef113fb */
	private String cphone;
	/** @pdOid 4b34f1b4-973e-469b-8642-1a1f66abdf85 */
	private String caddress;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

}