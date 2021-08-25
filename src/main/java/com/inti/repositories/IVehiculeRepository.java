package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Vehicule;

@Repository
public interface IVehiculeRepository extends JpaRepository<Vehicule, Long>{

}
