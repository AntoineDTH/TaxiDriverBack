package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Reservation;
import com.inti.repositories.IReservationRepository;
import com.inti.services.interfaces.IReservationService;

@Service
public class ReservationServiceImpl implements IReservationService {

	@Autowired
	IReservationRepository ReservationRepository;

	@Override
	public Reservation saveReservation(Reservation Reservation) {
		return ReservationRepository.save(Reservation);
	}

	@Override
	public List<Reservation> findAll() {
		return ReservationRepository.findAll();
	}

	@Override
	public Reservation findOne(Long id) {
		return ReservationRepository.findById(id).get();
	}

	@Override
	public void deleteReservation(Long id) {
		ReservationRepository.deleteById(id);
	}

}
