package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Vehicule;
import com.inti.repositories.IVehiculeRepository;
import com.inti.services.interfaces.IVehiculeService;

@Service
public class VehiculeServiceImpl implements IVehiculeService {
	@Autowired
	IVehiculeRepository vehiculeRepository;

	@Override
	public Vehicule saveVehicule(Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	@Override
	public List<Vehicule> findAll() {
		return vehiculeRepository.findAll();
	}

	@Override
	public Vehicule findOne(Long id) {
		return vehiculeRepository.findById(id).get();
	}

	@Override
	public void deleteVehicule(Long id) {
		vehiculeRepository.deleteById(id);
	}

}
