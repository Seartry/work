package com.zhangxp.online.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zhangxp.online.model.Customer;
import com.zhangxp.online.service.CustomerService;

@Controller
@RequestMapping(value="/customer")
public class CustomerController{

	@Resource
	private CustomerService customerService;
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Model model,Customer customer) {
		try {
			customerService.saveCustomer(customer);
			System.out.println("新增用户成功！");
		}catch(Exception e) {
			System.out.println("新增用户失败！");
			e.printStackTrace();
		}
		return "success";
	}
	
	@RequestMapping("/findAll")
	public String findAll() {
		List<Customer> list =  customerService.findAll();
		for(Customer customer:list) {
			System.out.println(customer.getCname());
		}
		return "success";
	}
	
}
