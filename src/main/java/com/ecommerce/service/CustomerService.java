package com.ecommerce.service;

import java.util.List;


import com.ecommerce.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	void saveCustomer(Customer customer);
	Customer getCustomerById(int cid);
	void deleteCustomerById(int cid);
	
}
