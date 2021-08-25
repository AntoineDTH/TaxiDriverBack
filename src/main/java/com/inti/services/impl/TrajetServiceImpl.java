package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Trajet;
import com.inti.repositories.TrajetRepository;
import com.inti.services.interfaces.TrajetService;

@Service
public class TrajetServiceImpl implements TrajetService{

	@Autowired
	TrajetRepository trajetRepository;

	@Override
	public Trajet saveTrajet(Trajet trajet) {
		return trajetRepository.save(trajet);
	}

	@Override
	public List<Trajet> findAll() {
		return trajetRepository.findAll();
	}

	@Override
	public Trajet findOne(Long id) {
		return trajetRepository.findById(id).get();
	}

	@Override
	public void deleteTrajet(Long id) {
		trajetRepository.deleteById(id);
	}

}