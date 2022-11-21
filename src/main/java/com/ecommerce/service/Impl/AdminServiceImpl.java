package com.ecommerce.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Admin;
import com.ecommerce.repository.AdminRepository;
import com.ecommerce.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}


	@Override
	public Admin admin(String username, String password) {
		Admin user = adminRepository.findByUsernameAndPassword(username, password);
		return user;
	}

}
