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
	
	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.saveCustomer(customer);
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerMapper.updateCustomer(customer);
	}

	@Override
	public boolean deleteCustomer(String cid) {
		// TODO Auto-generated method stub
		return customerMapper.deleteCustomer(cid);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.findAll();
	}

	@Override
	public Customer findCustomerByCid(String cid) {
		// TODO Auto-generated method stub
		return customerMapper.findCustomerByCid(cid);
	}

}
