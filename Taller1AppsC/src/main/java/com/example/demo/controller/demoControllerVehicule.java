package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Vehicule;
import com.example.demo.repository.IVehiculeRepository;

@Controller
@RequestMapping("/vehicule")
public class demoControllerVehicule {
	
	@Autowired
	private IVehiculeRepository vehiculoRepository;
	
	@GetMapping("/vehicules")
	public String listVehiculos(Model models) {
		
		List<Vehicule> vehicules = vehiculoRepository.findAll();
		models.addAttribute("vehicules",vehicules);
		return "vehicule-list";
	}
	
	

	

	
	

}
