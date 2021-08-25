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

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnnonce;

	// Association UML
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "offres_presentees", joinColumns = {
			@JoinColumn(name = "annonce", referencedColumnName = "idAnnonce") }, inverseJoinColumns = {
					@JoinColumn(name = "offre", referencedColumnName = "idOffre") })
	private List<Offre> offres;
}
