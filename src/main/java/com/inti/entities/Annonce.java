package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
public class Annonce implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAn;

	// Association UML
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "offres présentées", joinColumns = {
			@JoinColumn(name = "annonce", referencedColumnName = "idAn") }, inverseJoinColumns = {
					@JoinColumn(name = "offre", referencedColumnName = "idOf") })
	private List<Offre> offres;
}
