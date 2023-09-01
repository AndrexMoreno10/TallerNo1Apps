package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.User;
import com.example.demo.repository.IUserRepository;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/user") //Direccionar a nivel a clase
public class demoControllerUser {
	
	@Autowired //Pa que no solo se instancie una vez 
	private IUserRepository userRepository;
	
	@GetMapping("/users")//Direccionar a nivel de metodo
	public String listUsers(Model model) { //Model hace referencia a la plantilla html
		
		List<User> users = userRepository.findAll();
		 model.addAttribute("users", users); //Model.addatribute le estamos pasando ese atributo al modelo
	     return "user-list"; // Retorna el nombre del archivo HTML en src/main/resources/templates
		
	}

}
