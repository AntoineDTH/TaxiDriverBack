package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Commentaire;
import com.inti.repositories.ICommentaireRepository;
import com.inti.services.interfaces.ICommentaireService;

@Service
public class CommentaireServiceImpl implements ICommentaireService {
	@Autowired
	ICommentaireRepository commentaireRepository;

	@Override
	public Commentaire saveCommentaire(Commentaire commentaire) {
		return commentaireRepository.save(commentaire);
	}

	@Override
	public List<Commentaire> findAll() {
		return commentaireRepository.findAll();
	}

	@Override
	public Commentaire findOne(Long id) {
		return commentaireRepository.findById(id).get();
	}

	@Override
	public void deleteCommentaire(Long id) {
		commentaireRepository.deleteById(id);
	}

}
