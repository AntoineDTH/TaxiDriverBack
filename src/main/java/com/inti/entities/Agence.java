package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Agence implements Serializable{
		
	private static final long serialVersionUID = 1L;
	//Attributs
	@Id
	private Long idAgence;
	
	// Traduction de l'asso uml en java
	
//	@OneToOne
//	@JoinColumn(name = "ID_RESPO")   -
//	private Utilisateur respoAgence;
	
	@OneToMany(cascade = CascadeType.REMOVE)//(mappedBy = "Agence", cascade = CascadeType.REMOVE)
	private List<Vehicule> flotte;
	
//	OneToMany(cascade = CascadeType.REMOVE)
//	private List<Utilisateur> chauffeurs;
	
	@OneToMany(cascade = CascadeType.REMOVE)
	private List<Rapport> rapports;
	
//  private List<Stats> stats;
	




}