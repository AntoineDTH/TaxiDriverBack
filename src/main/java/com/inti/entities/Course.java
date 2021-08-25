package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Course implements Serializable{

	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCo;
	
	private Double coutCalcule;
	private boolean isAccepted=false;

	//Associations UML
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "offre",referencedColumnName = "idOf")
	private Offre offre;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "trajet_id",referencedColumnName = "idTr")
	private Trajet trajet;
	
//	@OneToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name="chauffeur_id",referencedColumnName = "idUs")
//	private Utilisateur chauffeur;
	
}
