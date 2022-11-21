package com.ecommerce.service;

import com.ecommerce.model.Admin;

public interface AdminService {
	Admin admin(String username, String password);
}
