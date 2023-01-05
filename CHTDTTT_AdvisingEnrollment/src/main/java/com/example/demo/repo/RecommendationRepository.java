package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Recommendation;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Integer>{
	@Query(value = "select * from recommendation where holland = :hl and training = :tl",nativeQuery = true)
	List<Recommendation> findByHollandAndTraining(@Param("hl") Integer holland,@Param("tl") Integer training);
}
