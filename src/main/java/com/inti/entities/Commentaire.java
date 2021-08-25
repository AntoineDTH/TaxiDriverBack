package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Inheritance
public class Commentaire extends Feedback{

	private boolean isDealtWith;
	private Course course;
}
