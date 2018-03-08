package com.zhangxp.online.model;
/***********************************************************************
 * Module:  Product.java
 * Author:  y
 * Purpose: Defines the Class Product
 ***********************************************************************/

import java.util.*;

/**
 * 产品表
 * 
 * @pdOid 564c8cbc-6032-4d77-a75f-ad5d2e2b14d6
 */
public class Product {
	/** @pdOid 8a19a41a-d2ca-4acf-a422-926bf3668033 */
	private int pid;
	/** @pdOid ee165563-397f-462b-a068-cdfa48c49b61 */
	private String pname;
	/** @pdOid 8844d96b-877e-49f3-bccc-9bd9e35c1347 */
	private double pprice;
	/** @pdOid 6321548b-49f5-4d8d-b165-df32d56776a3 */
	private int premain;
	/** @pdOid 8c28bff4-cc00-467a-b508-209120965bf8 */
	private int mid;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public int getPremain() {
		return premain;
	}

	public void setPremain(int premain) {
		this.premain = premain;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

}