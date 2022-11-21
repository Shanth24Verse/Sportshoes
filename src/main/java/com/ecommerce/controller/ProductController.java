package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("showProductForm")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "newproduct";
	}
	
	@RequestMapping("addProduct")
	public String addProduct(@ModelAttribute("product") Product product) {
		productService.addProduct(product);
		return "redirect:/";
	}
	
	@RequestMapping("viewAllProducts")
	public String getAllProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "ProductList";
	}
	
	@RequestMapping("reports")
	public String getReports(Model model) {
		model.addAttribute("products", productService.getReports());
		return "report";
	}
	
}
