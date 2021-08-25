package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Evaluation;
import com.inti.repositories.IEvaluationRepository;
import com.inti.services.interfaces.IEvaluationService;

@Service
public class EvaluationServiceImpl implements IEvaluationService {
	@Autowired
	IEvaluationRepository evaluationRepository;

	@Override
	public Evaluation saveEvaluation(Evaluation evaluation) {
		return evaluationRepository.save(evaluation);
	}

	@Override
	public List<Evaluation> findAll() {
		return evaluationRepository.findAll();
	}

	@Override
	public Evaluation findOne(Long id) {
		return evaluationRepository.findById(id).get();
	}

	@Override
	public void deleteEvaluation(Long id) {
		evaluationRepository.deleteById(id);
	}

}
