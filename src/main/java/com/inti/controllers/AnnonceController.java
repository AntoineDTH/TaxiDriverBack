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
@RequestMapping(value = "/gestionAnnonce")
public class AnnonceController {

	@Autowired
	IAnnonceService AnnonceService;

	@PostMapping("/annonces")
	public Annonce saveAnnonce(@RequestBody Annonce Annonce) {
		return AnnonceService.saveAnnonce(Annonce);
	}

	@GetMapping("/annonces")
	public List<Annonce> findAll() {
		return AnnonceService.findAll();                                                                                                                                                                     
	}

	@RequestMapping(value = "/annonces/{idAnnonce}", method = RequestMethod.GET)
	public Annonce findOne(@PathVariable("idAnnonce") Long id) {
		return AnnonceService.findOne(id);
	}

	@DeleteMapping("/annonces/{idAnnonce}")
	public void deleteAnnonce(@PathVariable("idAnnonce") Long id) {
		AnnonceService.deleteAnnonce(id);
	}
	
}
