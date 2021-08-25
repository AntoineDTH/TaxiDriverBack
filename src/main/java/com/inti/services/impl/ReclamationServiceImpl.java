package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Reclamation;
import com.inti.repositories.ReclamationRepository;
import com.inti.services.interfaces.ReclamationService;

@Service
public class ReclamationServiceImpl implements ReclamationService {
	@Autowired
	ReclamationRepository reclamationRepository;

	@Override
	public Reclamation saveReclamation(Reclamation reclamation) {
		return reclamationRepository.save(reclamation);
	}

	@Override
	public List<Reclamation> findAll() {
		return reclamationRepository.findAll();
	}

	@Override
	public Reclamation findOne(Long id) {
		return reclamationRepository.findById(id).get();
	}

	@Override
	public void deleteReclamation(Long id) {
		reclamationRepository.deleteById(id);
	}

}
