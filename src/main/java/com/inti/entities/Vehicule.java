package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
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
public class Vehicule implements Serializable{
		
	private static final long serialVersionUID = 1L;
	//Attributs
	@Id
	private Long idVehicule;
	private String marque;
	private String modele;
	private String type;



}
