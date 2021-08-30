package com.inti.entities;

import javax.persistence.DiscriminatorValue;
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
@DiscriminatorValue(value = "Réclamation")
public class Reclamation extends Feedback{

	private boolean isDealtWith;
	private Course course;
	
	public boolean isDealtWith() {
		return isDealtWith;
	}
	public void setDealtWith(boolean isDealtWith) {
		this.isDealtWith = isDealtWith;
	}
	
	
	
}
