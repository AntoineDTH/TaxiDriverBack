package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Feedback;
import com.inti.repositories.FeedbackRepository;
import com.inti.services.interfaces.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	FeedbackRepository feedbackRepository;

	@Override
	public Feedback saveFeedback(Feedback feedback) {
		return feedbackRepository.save(feedback);
	}

	@Override
	public List<Feedback> findAll() {
		return feedbackRepository.findAll();
	}

	@Override
	public Feedback findOne(Long id) {
		return feedbackRepository.findById(id).get();
	}

	@Override
	public void deleteFeedback(Long id) {
		feedbackRepository.deleteById(id);
	}

}
