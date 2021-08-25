package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Agence;
import com.inti.services.interfaces.IAgenceService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionAgences")
public class AgenceController {
	
	@Autowired
	IAgenceService service;
	
	@PostMapping("/agences")
	public Agence saveAgence(@RequestBody Agence agence) {
		return service.saveAgence(agence);
	}
	
	@GetMapping("/agences")
	public List<Agence> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/agences/{idAg}", method = RequestMethod.GET)
	public Agence findOne(@PathVariable("idAg") Long id) {
		return service.findOne(id);
	}
	
	@DeleteMapping("/agences/{idAg}")
	public void deleteAgence(@PathVariable("idAg") Long id) {
		service.deleteAgence(id);
	}
	
}
