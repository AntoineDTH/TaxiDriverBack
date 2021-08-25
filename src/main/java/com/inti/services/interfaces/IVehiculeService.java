package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Vehicule;

public interface IVehiculeService {
	Vehicule saveVehicule(Vehicule vehicule);

	List<Vehicule> findAll();

	Vehicule findOne(Long id);

	void deleteVehicule(Long id);
}
