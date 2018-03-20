package com.zhangxp.online.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangxp.online.dao.CustomerMapper;
import com.zhangxp.online.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.saveCustomer(customer);
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerMapper.updateCustomer(customer);
	}

	public boolean deleteCustomer(String cid) {
		// TODO Auto-generated method stub
		return customerMapper.deleteCustomer(cid);
	}

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.findAll();
	}

	public Customer findCustomerByCid(String cid) {
		// TODO Auto-generated method stub
		return customerMapper.findCustomerByCid(cid);
	}
}
