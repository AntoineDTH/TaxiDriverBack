package com.inti.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;
import com.inti.services.interfaces.IUtilisateurService;

@CrossOrigin
@RestController
@RequestMapping(value = "/login")
public class LoginController {
	
	@Autowired
	IUtilisateurService service;
	
	@GetMapping("/users")
	public Utilisateur login(Principal principal) {
		return service.findByUsername(principal.getName());
	}

}
