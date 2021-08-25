package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Annonce;
import com.inti.repositories.IAnnonceRepository;
import com.inti.services.interfaces.IAnnonceService;

@Service
public class AnnonceServiceImpl implements IAnnonceService {

	@Autowired
	IAnnonceRepository AnnonceRepository;

	@Override
	public Annonce saveAnnonce(Annonce Annonce) {
		return AnnonceRepository.save(Annonce);
	}

	@Override
	public List<Annonce> findAll() {
		return AnnonceRepository.findAll();
	}

	@Override
	public Annonce findOne(Long id) {
		return AnnonceRepository.findById(id).get();
	}

	@Override
	public void deleteAnnonce(Long id) {
		AnnonceRepository.deleteById(id);
	}

}
