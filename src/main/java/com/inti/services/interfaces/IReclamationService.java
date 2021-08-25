package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Reclamation;

public interface IReclamationService {
	Reclamation saveReclamation(Reclamation reclamation);

	List<Reclamation> findAll();

	Reclamation findOne(Long id);

	void deleteReclamation(Long id);
}
