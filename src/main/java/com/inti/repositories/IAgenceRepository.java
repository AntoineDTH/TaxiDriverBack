package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Agence;

@Repository
public interface IAgenceRepository extends JpaRepository<Agence, Long>{

}
