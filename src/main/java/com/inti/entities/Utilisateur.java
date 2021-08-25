package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nom;
	private String prenom;
	
	@Column(unique = true)
	private String mail;
	@Column(unique = true)
	private String username;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "profil", joinColumns = {
			@JoinColumn(name = "id_utilisateur", referencedColumnName = "idUtilisateur") }, inverseJoinColumns = {
					@JoinColumn(name = "id_role", table = "role", referencedColumnName = "idRole") })
	private Set<Role> roles = new HashSet<Role>();
	private boolean enabled = true;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "reservations_associees", joinColumns = {
			@JoinColumn(name = "utilisateur", referencedColumnName = "idUtilisateur") }, inverseJoinColumns = {
					@JoinColumn(name = "reservation", referencedColumnName = "idReservation") })
	private Set<Reservation> reservations;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "agence_liees", joinColumns = {
			@JoinColumn(name = "utilisateur", referencedColumnName = "idUtilisateur") }, inverseJoinColumns = {
					@JoinColumn(name = "agence", referencedColumnName = "idAgence") })
	private Set<Agence> agences;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idFeedback")
	@JsonBackReference
	private List<Feedback> feedbacks;	
	
	/*Ajouter une image sous format binaire*/
//	@Lob
//	private byte[] image;

}
