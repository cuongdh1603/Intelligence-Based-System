package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Recommendation;
import com.example.demo.repo.RecommendationRepository;

@Service
public class RecommendationService {
	@Autowired
	private RecommendationRepository recommendationRepository;
	public List<Recommendation> getRecommendations(int holland, int training){
		List<Recommendation> rcms = recommendationRepository.findByHollandAndTraining(holland, training);
		return rcms;
	}
}
