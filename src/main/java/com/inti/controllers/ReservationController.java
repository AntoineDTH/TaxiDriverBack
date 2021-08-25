package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Reservation;
import com.inti.services.interfaces.IReservationService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionReservation")
public class ReservationController {

	@Autowired
	IReservationService ReservationService;

	@PostMapping("/reservations")
	public Reservation saveReservation(@RequestBody Reservation Reservation) {
		return ReservationService.saveReservation(Reservation);
	}

	@GetMapping("/reservations")
	public List<Reservation> findAll() {
		return ReservationService.findAll();                                                                                                                                                                     
	}

	@RequestMapping(value = "/reservations/{idReservation}", method = RequestMethod.GET)
	public Reservation findOne(@PathVariable("idReservation") Long id) {
		return ReservationService.findOne(id);
	}

	@DeleteMapping("/reservations/{idReservation}")
	public void deleteReservation(@PathVariable("idReservation") Long id) {
		ReservationService.deleteReservation(id);
	}
}
