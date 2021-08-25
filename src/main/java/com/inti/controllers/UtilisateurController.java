package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Utilisateur;
import com.inti.services.interfaces.IUtilisateurService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionUsers")
public class UtilisateurController {
	
	@Autowired
	IUtilisateurService service;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	//@RequestMapping(value = "/users", method = RequestMethod.POST)
	@PostMapping("/users")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		Utilisateur user = new Utilisateur();
		user.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
		user.setUsername(utilisateur.getUsername());
		user.setNom(utilisateur.getNom());
		user.setPrenom(utilisateur.getPrenom());
		user.setRoles(utilisateur.getRoles());
		return service.saveUtilisateur(user);
	}
	
	//@RequestMapping(value = "/users", method = RequestMethod.GET)
	@GetMapping("/users")
	public List<Utilisateur> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/users/{idUser}", method = RequestMethod.GET)
	//@GetMapping("/users/{idUser}")
	public Utilisateur findOne(@PathVariable("idUser") Long id) {
		return service.findOne(id);
	}
//	@GetMapping("/users")
//	public Utilisateur findOne(@RequestParam("idUser") Long id) {
//		return service.findOne(id);
//	}
	
	//@RequestMapping(value = "/users/{idUser}", method = RequestMethod.DELETE)
	@DeleteMapping("/users/{idUser}")
	public void deleteUtilisateur(@PathVariable("idUser") Long id) {
		service.deleteUtilisateur(id);
	}
	
}
