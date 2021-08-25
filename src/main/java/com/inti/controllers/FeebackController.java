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

import com.inti.entities.Feedback;
import com.inti.services.interfaces.FeedbackService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionFeedbacks")
public class FeebackController {
	
	@Autowired
	FeedbackService service;
	
	@PostMapping("/feedbacks")
	public Feedback saveFeedback(@RequestBody Feedback feedback) {
		return service.saveFeedback(feedback);
	}
	
	@GetMapping("/feedbacks")
	public List<Feedback> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/feedbacks/{idFeedback}", method = RequestMethod.GET)
	public Feedback findOne(@PathVariable("idFeedback") Long id) {
		return service.findOne(id);
	}
	
	@DeleteMapping("/feedbacks/{idFeedback}")
	public void deleteFeedback(@PathVariable("idFeedback") Long id) {
		service.deleteFeedback(id);
	}
	
}
