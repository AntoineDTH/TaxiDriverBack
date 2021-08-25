package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Trajet;

@Repository
public interface AgenceRepository extends JpaRepository<Trajet, Long>{

}
