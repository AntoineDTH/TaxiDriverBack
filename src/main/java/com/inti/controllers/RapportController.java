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

import com.inti.entities.Rapport;
import com.inti.services.interfaces.IRapportService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionRapports")
public class RapportController {
	
	@Autowired
	IRapportService service;
	
	@PostMapping("/rapports")
	public Rapport saveRapport(@RequestBody Rapport rapport) {
		return service.saveRapport(rapport);
	}
	
	@GetMapping("/rapports")
	public List<Rapport> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/rapports/{idRapport}", method = RequestMethod.GET)
	public Rapport findOne(@PathVariable("idRapport") Long id) {
		return service.findOne(id);
	}
	
	@DeleteMapping("/rapports/{idRapport}")
	public void deleteRapport(@PathVariable("idRapport") Long id) {
		service.deleteRapport(id);
	}
	
}
