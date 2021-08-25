package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Rapport;
import com.inti.repositories.IRapportRepository;
import com.inti.services.interfaces.IRapportService;

@Service
public class RapportServiceImpl implements IRapportService {
	@Autowired
	IRapportRepository rapportRepository;

	@Override
	public Rapport saveRapport(Rapport rapport) {
		return rapportRepository.save(rapport);
	}

	@Override
	public List<Rapport> findAll() {
		return rapportRepository.findAll();
	}

	@Override
	public Rapport findOne(Long id) {
		return rapportRepository.findById(id).get();
	}

	@Override
	public void deleteRapport(Long id) {
		rapportRepository.deleteById(id);
	}

}
