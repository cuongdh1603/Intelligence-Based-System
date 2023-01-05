package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.HollandChoice;
import com.example.demo.model.HollandQuestion;
import com.example.demo.repo.HollandChoiceRepository;
import com.example.demo.repo.HollandQuestionRepository;

@Service
public class HollandService {
	@Autowired
	private HollandQuestionRepository hollandQuestionRepository;
	@Autowired
	private HollandChoiceRepository hollandChoiceRepository;
	
	public List<HollandQuestion> getAllHollandQuestion(){
		return hollandQuestionRepository.findAll();
	}
	
	public List<HollandChoice> getAllHollandChoices(){
		return hollandChoiceRepository.findAll();
	}
}
