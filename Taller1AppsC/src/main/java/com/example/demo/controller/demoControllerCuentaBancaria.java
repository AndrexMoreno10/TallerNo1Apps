package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.CuentaBancaria;
import com.example.demo.repository.ICuentaBancariaRepository;


@Controller
@RequestMapping("/cuentaBancaria")
public class demoControllerCuentaBancaria {
	
	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepository;
	
	@GetMapping("/cuentasBancarias")
	public String ListCuentasBancarias(Model model) {
		
		List<CuentaBancaria> cuentasBancarias = cuentaBancariaRepository.findAll();
		model.addAttribute("cuentasBancarias", cuentasBancarias);
		return "cuentaBancaria-list";
	}

}
