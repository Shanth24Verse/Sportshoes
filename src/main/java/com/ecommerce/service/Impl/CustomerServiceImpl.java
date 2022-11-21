package com.ecommerce.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Admin;
import com.ecommerce.model.Customer;
import com.ecommerce.repository.AdminRepository;
import com.ecommerce.repository.CustomerRepository;
import com.ecommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) {
		this.customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		Optional<Customer> optional = customerRepository.findById(id);
		Customer customer = null;
		if (optional.isPresent()) {
			customer = optional.get();
		} else {
			throw new RuntimeException(" Customer not found for id :: " + id);
		}
		return customer;
	}

	@Override
	public void deleteCustomerById(int id) {
		this.customerRepository.deleteById(id);
	}
	

}
