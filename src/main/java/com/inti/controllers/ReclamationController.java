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

import com.inti.entities.Reclamation;
import com.inti.services.interfaces.ReclamationService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionReclamations")
public class ReclamationController {
	
	@Autowired
	ReclamationService service;
	
	@PostMapping("/reclamations")
	public Reclamation saveReclamation(@RequestBody Reclamation reclamation) {
		return service.saveReclamation(reclamation);
	}
	
	@GetMapping("/reclamations")
	public List<Reclamation> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/reclamations/{idReclamation}", method = RequestMethod.GET)
	public Reclamation findOne(@PathVariable("idReclamation") Long id) {
		return service.findOne(id);
	}
	
	@DeleteMapping("/reclamations/{idReclamation}")
	public void deleteReclamation(@PathVariable("idReclamation") Long id) {
		service.deleteReclamation(id);
	}
	
}
