package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_RESPO",referencedColumnName = "idUtilisateur")
	private Utilisateur respoAgence;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE,mappedBy = "idVehicule")//(mappedBy = "Agence", cascade = CascadeType.REMOVE)
	private List<Vehicule> vehicules;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE,mappedBy = "idUtilisateur")
	private List<Utilisateur> chauffeurs;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE,mappedBy = "idRapport")
	private List<Rapport> rapports;
	

}