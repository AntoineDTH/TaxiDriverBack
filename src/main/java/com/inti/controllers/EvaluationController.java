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

import com.inti.entities.Evaluation;
import com.inti.services.interfaces.IEvaluationService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionEvaluations")
public class EvaluationController {
	
	@Autowired
	IEvaluationService service;
	
	@PostMapping("/evaluations")
	public Evaluation saveEvaluation(@RequestBody Evaluation evaluation) {
		return service.saveEvaluation(evaluation);
	}
	
	@GetMapping("/evaluations")
	public List<Evaluation> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/evaluations/{idEvaluation}", method = RequestMethod.GET)
	public Evaluation findOne(@PathVariable("idEvaluation") Long id) {
		return service.findOne(id);
	}
	
	@DeleteMapping("/evaluations/{idEvaluation}")
	public void deleteEvaluation(@PathVariable("idEvaluation") Long id) {
		service.deleteEvaluation(id);
	}
	
}
