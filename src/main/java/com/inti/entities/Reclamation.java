package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
@ToString
@Data
@Inheritance
public class Reclamation extends Feedback{

	//private Annonce annonce;
}
