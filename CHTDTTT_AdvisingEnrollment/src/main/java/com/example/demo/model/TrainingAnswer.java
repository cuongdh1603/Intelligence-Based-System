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
public class TrainingAnswer {
	private TrainingQuestion question;
	private List<TrainingChoice> choices;
	private int choose = -1;
}
