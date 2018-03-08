package com.zhangxp.online.service;

import java.util.List;

import com.zhangxp.online.model.Customer;

public interface CustomerService {
	void saveCustomer(Customer customer);
	boolean updateCustomer(Customer customer);
	boolean deleteCustomer(String cid);
	List<Customer> findAll();
	Customer findCustomerByCid(String cid);
}
