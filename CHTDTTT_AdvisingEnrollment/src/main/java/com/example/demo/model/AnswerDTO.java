package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "answers")
public class AnswerDTO {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "q1")
	int q1;
	@Column(name = "q2")
	int q2;
	@Column(name = "q3")
	int q3;
	@Column(name = "q4")
	int q4;
	@Column(name = "q5")
	int q5;
	@Column(name = "q6")
	int q6;
	@Column(name = "q7")
	int q7;
	@Column(name = "q8")
	int q8;
	@Column(name = "q9")
	int q9;
	@Column(name = "q10")
	int q10;
	@Column(name = "q11")
	int q11;
	@Column(name = "q12")
	int q12;
	@Column(name = "q13")
	int q13;
	@Column(name = "q14")
	int q14;
	@Column(name = "q15")
	int q15;
	@Column(name = "q16")
	int q16;
	@Column(name = "q17")
	int q17;
	@Column(name = "q18")
	int q18;
	@Column(name = "q19")
	int q19;
	@Column(name = "q20")
	int q20;
	@Column(name = "q21")
	int q21;
	@Column(name = "q22")
	int q22;
	@Column(name = "q23")
	int q23;
	@Column(name = "q24")
	int q24;
	@Column(name = "q25")
	int q25;
	@Column(name = "q26")
	int q26;
	@Column(name = "q27")
	int q27;
	@Column(name = "q28")
	int q28;
	@Column(name = "q29")
	int q29;
	@Column(name = "q30")
	int q30;
	@Column(name = "q31")
	int q31;
	@Column(name = "q32")
	int q32;
	@Column(name = "q33")
	int q33;
	@Column(name = "q34")
	int q34;
	@Column(name = "q35")
	int q35;
	@Column(name = "q36")
	int q36;
	@Column(name = "q37")
	int q37;
	@Column(name = "q38")
	int q38;
	@Column(name = "q39")
	int q39;
	@Column(name = "q40")
	int q40;
	@Column(name = "q41")
	int q41;
	@Column(name = "q42")
	int q42;
	@Column(name = "q43")
	int q43;
	@Column(name = "q44")
	int q44;
	@Column(name = "q45")
	int q45;
	@Column(name = "q46")
	int q46;
	@Column(name = "q47")
	int q47;
	@Column(name = "q48")
	int q48;
	@Column(name = "q49")
	int q49;
	@Column(name = "q50")
	int q50;
	@Column(name = "q51")
	int q51;
	@Column(name = "q52")
	int q52;
	@Column(name = "q53")
	int q53;
	@Column(name = "q54")
	int q54;
	@Column(name = "q55")
	int q55;
	@Column(name = "q56")
	int q56;
	@Column(name = "q57")
	int q57;
	@Column(name = "q58")
	int q58;
	@Column(name = "q59")
	int q59;
	@Column(name = "q60")
	int q60;
	@Column(name = "q61")
	int q61;
	@Column(name = "q62")
	int q62;
	@Column(name = "a")
	int a;

}

