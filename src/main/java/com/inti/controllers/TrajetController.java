package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Trajet;
import com.inti.services.interfaces.TrajetService;

@CrossOrigin
@RestController
@RequestMapping(value = "/TaxiDriver")
public class TrajetController {

	@Autowired
	TrajetService trajetService;
//	@Autowired
//	PasswordEncoder passwordEncoder;

	@PostMapping("/users")
	public Trajet saveTrajet(@RequestBody Trajet trajet) {
		return trajetService.saveTrajet(trajet);
	}

	@GetMapping("/users")
	public List<Trajet> findAll() {
		return trajetService.findAll();                                                                                                                                                                     
	}

	@RequestMapping(value = "/users/{idUser}", method = RequestMethod.GET)
	public Trajet findOne(@PathVariable("idUser") Long id) {
		return trajetService.findOne(id);
	}

	@DeleteMapping("/users/{idUser}")
	public void deleteTrajet(@PathVariable("idUser") Long id) {
		trajetService.deleteTrajet(id);
	}

}