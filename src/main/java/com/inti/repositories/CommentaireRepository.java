package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Commentaire;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long>{

}
