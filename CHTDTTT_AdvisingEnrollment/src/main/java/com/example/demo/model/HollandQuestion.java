package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "holland_question")
public class HollandQuestion {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "content")
	private String content;
	@Column(name = "weight")
	private int weight;
	@Column(name = "g1")
	private float g1;
	@Column(name = "g2")
	private float g2;
	@Column(name = "g3")
	private float g3;
	@Column(name = "g4")
	private float g4;
	@Column(name = "g5")
	private float g5;
	@Column(name = "g6")
	private float g6;
}
