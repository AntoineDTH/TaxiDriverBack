package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

import lombok.Builder;
import lombok.ToString;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
@ToString
@Inheritance
public class Reclamation extends Feedback{

	private Annonce annonce;
}
