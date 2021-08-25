package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Offre;
import com.inti.repositories.IOffreRepository;
import com.inti.services.interfaces.IOffreService;

@Service
public class OffreServiceImpl implements IOffreService {

	@Autowired
	IOffreRepository OffreRepository;

	@Override
	public Offre saveOffre(Offre Offre) {
		return OffreRepository.save(Offre);
	}

	@Override
	public List<Offre> findAll() {
		return OffreRepository.findAll();
	}

	@Override
	public Offre findOne(Long id) {
		return OffreRepository.findById(id).get();
	}

	@Override
	public void deleteOffre(Long id) {
		OffreRepository.deleteById(id);
	}

}
