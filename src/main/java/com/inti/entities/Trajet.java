package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.annotation.Generated;
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
	private Long id;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTr;
	
	private String depart;
	private String arrivee;
	private Double distance;
	private Date horaire;

}
