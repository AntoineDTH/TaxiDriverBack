package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Evaluation;

public interface IEvaluationService {
	Evaluation saveEvaluation(Evaluation evaluation);

	List<Evaluation> findAll();

	Evaluation findOne(Long id);

	void deleteEvaluation(Long id);
}
