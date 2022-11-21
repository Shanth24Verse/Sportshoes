package com.ecommerce.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.model.Admin;
import com.ecommerce.model.Customer;
import com.ecommerce.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("showCustomerForm")
	public String addCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "newcustomer";
	}
	
	@RequestMapping("saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/";
	}
	
	@RequestMapping("viewAllCustomers")
	public String getAllCustomers(Model model) {
		model.addAttribute("customers", customerService.getAllCustomers());
		return "CustomerList";
	}
	
	
}
