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
@RequestMapping(value = "/TaxiDriver")
public class ReservationController {

	@Autowired
	IReservationService ReservationService;

	@PostMapping("/users")
	public Reservation saveReservation(@RequestBody Reservation Reservation) {
		return ReservationService.saveReservation(Reservation);
	}

	@GetMapping("/users")
	public List<Reservation> findAll() {
		return ReservationService.findAll();                                                                                                                                                                     
	}

	@RequestMapping(value = "/users/{idUser}", method = RequestMethod.GET)
	public Reservation findOne(@PathVariable("idUser") Long id) {
		return ReservationService.findOne(id);
	}

	@DeleteMapping("/users/{idUser}")
	public void deleteReservation(@PathVariable("idUser") Long id) {
		ReservationService.deleteReservation(id);
	}
}
