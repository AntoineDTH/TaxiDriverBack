package com.inti.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@DiscriminatorValue(value = "Évaluation")
public class Evaluation extends Feedback{

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="chauffeur",referencedColumnName = "idUtilisateur")
	private Utilisateur utilisateur; // Chauffeur
	private double note;
	
	
}
