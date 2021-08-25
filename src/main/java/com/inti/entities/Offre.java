package com.inti.entities;

import java.io.Serializable;

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
public class Offre implements Serializable{

	private static final long serialVersionUID = 1L;

	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOffre;
	
	private String promotion;
}
