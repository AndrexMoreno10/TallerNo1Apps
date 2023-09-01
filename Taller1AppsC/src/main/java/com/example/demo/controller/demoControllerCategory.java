package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Category;
import com.example.demo.repository.ICategoryRepository;

@Controller
@RequestMapping("/category")
public class demoControllerCategory {
	
	@Autowired
	private ICategoryRepository categoryRepository;
	
	@GetMapping("/categories")
	public String listCategory(Model models) {
		
		List<Category> categories = categoryRepository.findAll();
		models.addAttribute("categories", categories);
		return "category-list";
		
	}

	
	
}
