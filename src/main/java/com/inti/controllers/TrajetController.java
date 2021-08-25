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
import com.inti.services.interfaces.ITrajetService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionTrajet")
public class TrajetController {

	@Autowired
	ITrajetService trajetService;

	@PostMapping("/trajets")
	public Trajet saveTrajet(@RequestBody Trajet trajet) {
		return trajetService.saveTrajet(trajet);
	}

	@GetMapping("/trajets")
	public List<Trajet> findAll() {
		return trajetService.findAll();                                                                                                                                                                     
	}

	@RequestMapping(value = "/trajets/{idTrajet}", method = RequestMethod.GET)
	public Trajet findOne(@PathVariable("idTrajet") Long id) {
		return trajetService.findOne(id);
	}

	@DeleteMapping("/trajets/{idTrajet}")
	public void deleteTrajet(@PathVariable("idTrajet") Long id) {
		trajetService.deleteTrajet(id);
	}

}