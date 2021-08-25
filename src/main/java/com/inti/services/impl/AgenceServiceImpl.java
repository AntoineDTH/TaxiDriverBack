package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Agence;
import com.inti.repositories.IAgenceRepository;
import com.inti.services.interfaces.IAgenceService;

@Service
public class AgenceServiceImpl implements IAgenceService {
	@Autowired
	IAgenceRepository agenceRepository;

	@Override
	public Agence saveAgence(Agence agence) {
		return agenceRepository.save(agence);
	}

	@Override
	public List<Agence> findAll() {
		return agenceRepository.findAll();
	}

	@Override
	public Agence findOne(Long id) {
		return agenceRepository.findById(id).get();
	}

	@Override
	public void deleteAgence(Long id) {
		agenceRepository.deleteById(id);
	}

}
