package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Annonce;

public interface IAnnonceService {

	public Annonce saveAnnonce(Annonce x);
	public List<Annonce> findAll();
	public Annonce findOne(Long id);
	public void deleteAnnonce(Long id);
}
