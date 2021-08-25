package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Commentaire;

public interface CommentaireService {
	Commentaire saveCommentaire(Commentaire commentaire);

	List<Commentaire> findAll();

	Commentaire findOne(Long id);

	void deleteCommentaire(Long id);
}
