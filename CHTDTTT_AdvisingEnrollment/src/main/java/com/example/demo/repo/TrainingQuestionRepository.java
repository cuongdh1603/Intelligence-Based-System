package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TrainingQuestion;
@Repository
public interface TrainingQuestionRepository extends JpaRepository<TrainingQuestion, Integer>{
	
}
