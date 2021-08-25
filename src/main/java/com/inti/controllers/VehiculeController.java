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

import com.inti.entities.Vehicule;
import com.inti.services.interfaces.IVehiculeService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionVehicules")
public class VehiculeController {
	
	@Autowired
	IVehiculeService service;
	
	@PostMapping("/vehicules")
	public Vehicule saveVehicule(@RequestBody Vehicule vehicule) {
		return service.saveVehicule(vehicule);
	}
	
	@GetMapping("/vehicules")
	public List<Vehicule> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/vehicules/{idVehicule}", method = RequestMethod.GET)
	public Vehicule findOne(@PathVariable("idVehicule") Long id) {
		return service.findOne(id);
	}
	
	@DeleteMapping("/vehicules/{idVehicule}")
	public void deleteVehicule(@PathVariable("idVehicule") Long id) {
		service.deleteVehicule(id);
	}
	
}
