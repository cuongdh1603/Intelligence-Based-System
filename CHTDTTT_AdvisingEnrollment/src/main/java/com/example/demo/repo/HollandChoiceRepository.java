package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HollandChoice;

@Repository
public interface HollandChoiceRepository extends JpaRepository<HollandChoice, Integer>{

}
