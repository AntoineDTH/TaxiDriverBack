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

import com.inti.entities.Annonce;
import com.inti.services.interfaces.IAnnonceService;

@CrossOrigin
@RestController
@RequestMapping(value = "/TaxiDriver")
public class AnnonceController {

	@Autowired
	IAnnonceService AnnonceService;

	@PostMapping("/users")
	public Annonce saveAnnonce(@RequestBody Annonce Annonce) {
		return AnnonceService.saveAnnonce(Annonce);
	}

	@GetMapping("/users")
	public List<Annonce> findAll() {
		return AnnonceService.findAll();                                                                                                                                                                     
	}

	@RequestMapping(value = "/users/{idUser}", method = RequestMethod.GET)
	public Annonce findOne(@PathVariable("idUser") Long id) {
		return AnnonceService.findOne(id);
	}

	@DeleteMapping("/users/{idUser}")
	public void deleteAnnonce(@PathVariable("idUser") Long id) {
		AnnonceService.deleteAnnonce(id);
	}
	
}
