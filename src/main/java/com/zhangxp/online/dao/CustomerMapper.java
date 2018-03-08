package com.zhangxp.online.dao;

import java.util.List;

import com.zhangxp.online.model.Customer;

public interface CustomerMapper {

	void saveCustomer(Customer customer);
	boolean updateCustomer(Customer customer);
	boolean deleteCustomer(String cid);
	List<Customer> findAll();
	Customer findCustomerByCid(String cid);
	
}
