package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;

@Controller
public class CategoryController {
		
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("showCategoryForm")
	public String addCategory(Model model) {
		Category category = new Category();
		model.addAttribute("category", category);
		return "newcategory";
	}
	
	@RequestMapping("saveCategory")
	public String saveCategory(@ModelAttribute("category") Category category) {
		categoryService.saveCategory(category);
		return "redirect:/";
	}
	
	@RequestMapping("viewAllCategorys")
	public String getAllCategorys(Model model) {
		model.addAttribute("categorys", categoryService.getAllCategory());
		return "CategoryList";
	}
}
