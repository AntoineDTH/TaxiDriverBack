package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Reservation;

public interface IReservationService {

	public Reservation saveReservation(Reservation x);
	public List<Reservation> findAll();
	public Reservation findOne(Long id);
	public void deleteReservation(Long id);
}
