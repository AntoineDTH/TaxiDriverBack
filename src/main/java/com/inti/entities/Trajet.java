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
public class Trajet implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String depart;
	private String arrivee;
	private Double distance;
	private Date horaire;

}
