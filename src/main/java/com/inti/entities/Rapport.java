package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
public class Rapport implements Serializable{
		
	private static final long serialVersionUID = 1L;
	//Attributs
	@Id
	private Long idRapport;
	
	// traduction de l'asso uml en java
	@ManyToOne
	@JoinColumn(name = "Agence_ID", referencedColumnName = "idAgence")
	private Agence agence;




}