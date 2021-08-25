package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Reservation;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Long> {

}
