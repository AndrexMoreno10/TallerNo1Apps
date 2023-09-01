package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Product;
import com.example.demo.repository.IRepositoryProduct;

@Controller
@RequestMapping("/product")
public class demoControllerProduct {
	
	@Autowired
	private IRepositoryProduct productRepository;
	
	@GetMapping("/products")
	public String listProducts(Model models) {
		
		List<Product> products = productRepository.findAll();
		models.addAttribute("products",products);
		return "product-list";
		
	}
	
	
}
