package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Utilisateur;
import com.inti.repositories.IUtilisateurRepository;
import com.inti.services.interfaces.IUtilisateurService;

@Service
public class UtilisateurServiceImpl implements IUtilisateurService {

	@Autowired
	IUtilisateurRepository utilisteurRepository;

	@Override
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisteurRepository.save(utilisateur);
	}

	@Override
	public List<Utilisateur> findAll() {
		return utilisteurRepository.findAll();
	}

	@Override
	public Utilisateur findOne(Long id) {
		return utilisteurRepository.findById(id).get();
	}

	@Override
	public void deleteUtilisateur(Long id) {
		utilisteurRepository.deleteById(id);
	}

	@Override
	public Utilisateur findByUsername(String username) {
		return utilisteurRepository.findByUsername(username);
	}

	@Override
	public List<Utilisateur> triChauffeur() {
		return utilisteurRepository.triChauffeur();
	}

}
