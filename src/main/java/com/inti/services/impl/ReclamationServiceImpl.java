package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Reclamation;
import com.inti.repositories.IReclamationRepository;
import com.inti.services.interfaces.IReclamationService;

@Service
public class ReclamationServiceImpl implements IReclamationService {
	@Autowired
	IReclamationRepository reclamationRepository;

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
