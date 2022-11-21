package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Product;

public interface ProductService {
	void addProduct(Product product);
	List<Product> getAllProducts();
	List<Product> getReports();
}
