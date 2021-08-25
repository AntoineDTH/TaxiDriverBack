package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Offre;

public interface IOffreService {

	public Offre saveOffre(Offre x);
	public List<Offre> findAll();
	public Offre findOne(Long id);
	public void deleteOffre(Long id);
}
