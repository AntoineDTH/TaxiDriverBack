package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Agence;

public interface IAgenceService {
	Agence saveAgence(Agence agence);

	List<Agence> findAll();

	Agence findOne(Long id);

	void deleteAgence(Long id);
}
