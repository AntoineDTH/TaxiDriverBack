package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Trajet;

public interface ITrajetService {

	Trajet saveTrajet(Trajet trajet);

	List<Trajet> findAll();

	Trajet findOne(Long id);

	void deleteTrajet(Long id);

}
