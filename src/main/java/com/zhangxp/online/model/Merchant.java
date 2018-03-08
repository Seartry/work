package com.zhangxp.online.model;
/***********************************************************************
 * Module:  Merchant.java
 * Author:  y
 * Purpose: Defines the Class Merchant
 ***********************************************************************/

import java.util.*;

/**
 * 商家表
 * 
 * @pdOid 025589ff-125b-4b2a-8709-af02235d4c98
 */
public class Merchant {
	/** @pdOid 96ff03be-5ba9-4616-b149-705c36bdc11b */
	private int mid;
	/** @pdOid ca4fd31f-cad7-4b0c-9e49-e7ad94a83854 */
	private String mname;
	/** @pdOid df919eb0-1bd2-4ad8-90ce-c496467f6e85 */
	private String mphone;
	/** @pdOid 8013c897-1f02-4d2a-9262-d005c7b5d790 */
	private String madress;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getMadress() {
		return madress;
	}

	public void setMadress(String madress) {
		this.madress = madress;
	}

}