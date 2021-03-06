package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Data
public class Trajet implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTrajet;
	
	private String depart;
	private String arrivee;
	private int distance;
	private Date horaire;
	
	public Trajet(String depart, String arrivee, int distance, Date horaire) {
		super();
		this.depart = depart;
		this.arrivee = arrivee;
		this.distance = distance;
		this.horaire = horaire;
	}

	
}
