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

import com.inti.entities.Offre;
import com.inti.services.interfaces.IOffreService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionOffre")
public class OffreController {

	@Autowired
	IOffreService OffreService;

	@PostMapping("/offres")
	public Offre saveOffre(@RequestBody Offre Offre) {
		return OffreService.saveOffre(Offre);
	}

	@GetMapping("/offres")
	public List<Offre> findAll() {
		return OffreService.findAll();                                                                                                                                                                     
	}

	@RequestMapping(value = "/offres/{idOffre}", method = RequestMethod.GET)
	public Offre findOne(@PathVariable("idOffre") Long id) {
		return OffreService.findOne(id);
	}

	@DeleteMapping("/offres/{idOffre}")
	public void deleteOffre(@PathVariable("idOffre") Long id) {
		OffreService.deleteOffre(id);
	}
}
