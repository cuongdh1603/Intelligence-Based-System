package com.example.demo.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Answer {
	private List<TrainingAnswer> trainingAnswers;
	private List<HollandAnswer> hollandAnswers;
}
