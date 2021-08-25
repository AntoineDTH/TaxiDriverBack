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

import com.inti.entities.Commentaire;
import com.inti.services.interfaces.CommentaireService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionCommentaires")
public class CommentaireController {
	
	@Autowired
	CommentaireService service;
	
	@PostMapping("/commentaires")
	public Commentaire saveCommentaire(@RequestBody Commentaire commentaire) {
		return service.saveCommentaire(commentaire);
	}
	
	@GetMapping("/commentaires")
	public List<Commentaire> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/commentaires/{idCommentaire}", method = RequestMethod.GET)
	public Commentaire findOne(@PathVariable("idCommentaire") Long id) {
		return service.findOne(id);
	}
	
	@DeleteMapping("/commentaires/{idCommentaire}")
	public void deleteCommentaire(@PathVariable("idCommentaire") Long id) {
		service.deleteCommentaire(id);
	}
	
}
