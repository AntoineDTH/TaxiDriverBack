package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Rapport;

@Repository
public interface IRapportRepository extends JpaRepository<Rapport, Long>{

}
