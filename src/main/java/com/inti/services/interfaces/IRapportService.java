package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Rapport;

public interface IRapportService {
	Rapport saveRapport(Rapport rapport);

	List<Rapport> findAll();

	Rapport findOne(Long id);

	void deleteRapport(Long id);
}
