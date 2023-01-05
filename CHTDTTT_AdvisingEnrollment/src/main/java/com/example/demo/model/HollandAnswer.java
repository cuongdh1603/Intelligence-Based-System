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
public class HollandAnswer {
	private HollandQuestion question; 
	private List<HollandChoice> choices;
	private int choose = -1;
}
