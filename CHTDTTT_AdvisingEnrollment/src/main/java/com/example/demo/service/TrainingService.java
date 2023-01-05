package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TrainingChoice;
import com.example.demo.model.TrainingQuestion;
import com.example.demo.repo.TrainingChoiceRepository;
import com.example.demo.repo.TrainingQuestionRepository;

@Service
public class TrainingService {
	@Autowired
	private TrainingQuestionRepository trainingQuestionRepository;
	@Autowired
	private TrainingChoiceRepository trainingChoiceRepository;
	
	public List<TrainingQuestion> getAllTrainingQuestion(){
		return trainingQuestionRepository.findAll();
	}
	
	public List<TrainingChoice> getAllTrainingChoices(){
		return trainingChoiceRepository.findAll();
	}
}
