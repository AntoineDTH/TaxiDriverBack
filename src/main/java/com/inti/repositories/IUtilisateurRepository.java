package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Utilisateur;

@Repository
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {

	Utilisateur findByUsername(String username);

	@Query(nativeQuery = true,
			value = "SELECT * FROM "
					+ "(utilisateur AS u JOIN "
					+ "(profil AS p JOIN role AS r ON p.id_role=r.id_role) "
					+ "ON u.id_utilisateur=p.id_utilisateur) "
					+ "WHERE r.libelle = 'chauffeur' ORDER BY u.note_moyenne")
	List<Utilisateur> triChauffeur();

}
