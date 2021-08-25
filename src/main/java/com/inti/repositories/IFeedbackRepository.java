package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Feedback;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Long>{

}
