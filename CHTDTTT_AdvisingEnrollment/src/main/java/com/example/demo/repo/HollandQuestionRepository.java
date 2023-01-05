package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HollandQuestion;

@Repository
public interface HollandQuestionRepository extends JpaRepository<HollandQuestion, Integer>{
	
}
