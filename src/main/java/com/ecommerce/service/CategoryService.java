package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Category;

public interface CategoryService {
	Category saveCategory(Category category);
	List<Category> getAllCategory();
}
