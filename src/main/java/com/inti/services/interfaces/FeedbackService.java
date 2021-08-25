package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Feedback;

public interface FeedbackService {
	Feedback saveFeedback(Feedback feedback);

	List<Feedback> findAll();

	Feedback findOne(Long id);

	void deleteFeedback(Long id);
}
