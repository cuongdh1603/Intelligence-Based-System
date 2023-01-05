package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Answer;
import com.example.demo.model.AnswerDTO;
import com.example.demo.model.HollandAnswer;
import com.example.demo.model.HollandChoice;
import com.example.demo.model.HollandQuestion;
import com.example.demo.model.Recommendation;
import com.example.demo.model.TrainingAnswer;
import com.example.demo.model.TrainingChoice;
import com.example.demo.model.TrainingQuestion;
import com.example.demo.service.AnswerDTOService;
import com.example.demo.service.HollandService;
import com.example.demo.service.RecommendationService;
import com.example.demo.service.TrainingService;


@Controller
public class LoginController {
	@Autowired
	private TrainingService trainingService;
	@Autowired
	private HollandService hollandService;
	@Autowired
	private AnswerDTOService answerDTOService;
	@Autowired
	private RecommendationService recommendationService;
	@GetMapping({"/index","/"})
	public String login() {
		return "index";
	}
	@GetMapping("/quiz")
	public String quiz(Model model) {
		List<TrainingQuestion> trainingQuestions = trainingService.getAllTrainingQuestion();
		List<TrainingChoice> trainingChoices = trainingService.getAllTrainingChoices(); 
		
		List<HollandQuestion> hollandQuestions = hollandService.getAllHollandQuestion();
		for (HollandQuestion hl : hollandQuestions) {
			System.out.println(hl.getG1() + "<---->"+hl.getG2());
		}
		List<HollandChoice> hollandChoices = hollandService.getAllHollandChoices();
		Answer form = new Answer();
		form.setHollandAnswers(new ArrayList<HollandAnswer>());
		form.setTrainingAnswers(new ArrayList<TrainingAnswer>());
		for(int i=0;i<hollandQuestions.size();i++) {
//		for(int i=0;i<12;i++) {
			HollandAnswer hollandAnswer = new HollandAnswer();
			hollandAnswer.setChoices(new ArrayList<HollandChoice>());
			hollandAnswer.setQuestion(hollandQuestions.get(i));
			for(int j=i*5;j<i*5+5;j++) {
				hollandAnswer.getChoices().add(hollandChoices.get(j));
			}
			form.getHollandAnswers().add(hollandAnswer);
		}
		for(int i=0;i<trainingQuestions.size();i++) {
//		for(int i=0;i<2;i++) {
			TrainingAnswer trainingAnswer = new TrainingAnswer();
			trainingAnswer.setChoices(new ArrayList<TrainingChoice>());
			trainingAnswer.setQuestion(trainingQuestions.get(i));
			for(int j=0;j<trainingChoices.size();j++) {
				if(trainingChoices.get(j).getQId()==trainingQuestions.get(i).getId())
					trainingAnswer.getChoices().add(trainingChoices.get(j));
			}
			form.getTrainingAnswers().add(trainingAnswer);
		}
		model.addAttribute("form", form);
		return "quiz";
	}
	@PostMapping("/submit")
	public String recieveQuiz(Model model, @ModelAttribute("form") Answer answer) {
		List<HollandQuestion> hollandQuestions = hollandService.getAllHollandQuestion();
		if(answer.getTrainingAnswers() == null || answer.getHollandAnswers() == null || answer.getTrainingAnswers().size() < 4 || answer.getHollandAnswers().size() < 62) {
			
			List<TrainingQuestion> trainingQuestions = trainingService.getAllTrainingQuestion();
			
			List<TrainingChoice> trainingChoices = trainingService.getAllTrainingChoices(); 
			
			List<HollandChoice> hollandChoices = hollandService.getAllHollandChoices();
			Answer newForm = new Answer();
			newForm.setHollandAnswers(new ArrayList<HollandAnswer>());
			newForm.setTrainingAnswers(new ArrayList<TrainingAnswer>());
			for(int i=0;i<hollandQuestions.size();i++) {
				HollandAnswer hollandAnswer = new HollandAnswer();
				hollandAnswer.setChoices(new ArrayList<HollandChoice>());
				hollandAnswer.setQuestion(hollandQuestions.get(i));
				for(int j=i*5;j<i*5+5;j++) {
					hollandAnswer.getChoices().add(hollandChoices.get(j));
				}
				newForm.getHollandAnswers().add(hollandAnswer);
			}
			for(int i=0;i<trainingQuestions.size();i++) {
				TrainingAnswer trainingAnswer = new TrainingAnswer();
				trainingAnswer.setChoices(new ArrayList<TrainingChoice>());
				trainingAnswer.setQuestion(trainingQuestions.get(i));
				for(int j=0;j<trainingChoices.size();j++) {
					if(trainingChoices.get(j).getQId()==trainingQuestions.get(i).getId())
						trainingAnswer.getChoices().add(trainingChoices.get(j));
				}
				newForm.getTrainingAnswers().add(trainingAnswer);
			}
			if(answer.getTrainingAnswers() != null) {
				for(int i=0;i<answer.getTrainingAnswers().size();i++) {
					newForm.getTrainingAnswers().get(i).setChoose(answer.getTrainingAnswers().get(i).getChoose());
				}
			}
			if(answer.getHollandAnswers() != null) {
				for(int i=0;i<answer.getHollandAnswers().size();i++) {
					newForm.getHollandAnswers().get(i).setChoose(answer.getHollandAnswers().get(i).getChoose());
				}
			}
			model.addAttribute("form", newForm);
			return "quiz";
		}
		
		float uni_index = 1.0f,col_index = 1.0f,g1_index = 0.0f,g2_index = 0.0f,g3_index = 0.0f,g4_index = 0.0f,g5_index = 0.0f,g6_index = 0.0f;
		
		/*-------------------------------------------------------BAYES-------------------------------------------------------*/
		
		if(answer.getTrainingAnswers().get(0).getChoose()==0) {
			uni_index *= 1.0/5.0;
			col_index *= 2.0/9.0;
		}
		else if (answer.getTrainingAnswers().get(0).getChoose()==1) {
			uni_index *= 3.0/5.0;
			col_index *= 2.0/9.0;
		}
		else if (answer.getTrainingAnswers().get(0).getChoose()==2) {
			uni_index *= 1.0/5.0;
			col_index *= 3.0/9.0;
		}
		else if (answer.getTrainingAnswers().get(0).getChoose()==3) {
			uni_index *= 0.0/5.0;
			col_index *= 2.0/9.0;
		}

		if(answer.getTrainingAnswers().get(1).getChoose()==0) {
			uni_index *= 4.0/5.0;
			col_index *= 1.0/9.0;
		}
		else if (answer.getTrainingAnswers().get(1).getChoose()==1) {
			uni_index *= 1.0/5.0;
			col_index *= 5.0/9.0;
		}
		else if (answer.getTrainingAnswers().get(1).getChoose()==2) {
			uni_index *= 0.0/5.0;
			col_index *= 3.0/9.0;
		}
		
		if(answer.getTrainingAnswers().get(2).getChoose()==0) {
			uni_index *= 2.0/5.0;
			col_index *= 6.0/9.0;
		}
		else if (answer.getTrainingAnswers().get(2).getChoose()==1) {
			uni_index *= 3.0/5.0;
			col_index *= 3.0/9.0;
		}
		
		if(answer.getTrainingAnswers().get(3).getChoose()==0) {
			uni_index *= 3.0/5.0;
			col_index *= 4.0/9.0;
		}
		else if (answer.getTrainingAnswers().get(3).getChoose()==1) {
			uni_index *= 2.0/5.0;
			col_index *= 5.0/9.0;
		}
		System.out.println("Uni_index: "+uni_index+" Col_index: "+col_index);
		int training_index = (uni_index > col_index) ? 0 : 1;

		/*-------------------------------------------------------CBR-------------------------------------------------------*/
		int weightSum = 0;
		for (HollandQuestion hq : hollandQuestions) {
			weightSum += hq.getWeight();
		}
		System.out.println("weightSum: "+weightSum);
		List<Float> percents = new ArrayList<Float>();
		
		for (HollandAnswer ha : answer.getHollandAnswers()) {
			if(ha.getChoose()==0)
				percents.add((float) 0.0);
			else if(ha.getChoose()==1)
				percents.add((float) 0.1);
			else if(ha.getChoose()==2)
				percents.add((float) 0.35);
			else if(ha.getChoose()==3)
				percents.add((float) 0.6);
			else if(ha.getChoose()==4)
				percents.add((float) 0.9);
		}
		
		int holland_index = 0;
		AnswerDTO answerDTO = answerDTOService.getSameAnswerDTO(answer.getHollandAnswers());
		if(answerDTO == null) {
			System.out.println("New case");
			for(int i=0;i<hollandQuestions.size();i++) {
				g1_index += hollandQuestions.get(i).getWeight()*(1 - Math.abs(hollandQuestions.get(i).getG1()-percents.get(i)));
				g2_index += hollandQuestions.get(i).getWeight()*(1 - Math.abs(hollandQuestions.get(i).getG2()-percents.get(i)));
				g3_index += hollandQuestions.get(i).getWeight()*(1 - Math.abs(hollandQuestions.get(i).getG3()-percents.get(i)));
				g4_index += hollandQuestions.get(i).getWeight()*(1 - Math.abs(hollandQuestions.get(i).getG4()-percents.get(i)));
				g5_index += hollandQuestions.get(i).getWeight()*(1 - Math.abs(hollandQuestions.get(i).getG5()-percents.get(i)));
				g6_index += hollandQuestions.get(i).getWeight()*(1 - Math.abs(hollandQuestions.get(i).getG6()-percents.get(i)));
			}

			g1_index /= (weightSum);
			g2_index /= (weightSum);
			g3_index /= (weightSum);
			g4_index /= (weightSum);
			g5_index /= (weightSum);
			g6_index /= (weightSum);
			System.out.println("G1: "+g1_index+" G2: "+g2_index+" G3: "+g3_index+" G4: "+g4_index+" G5: "+g5_index+" G6: "+g6_index);
			List<Float> cbr_index = new ArrayList<Float>();
			cbr_index.add(g1_index);
			cbr_index.add(g2_index);
			cbr_index.add(g3_index);
			cbr_index.add(g4_index);
			cbr_index.add(g5_index);
			cbr_index.add(g6_index);
			
			float max_cbr = g1_index; 
			for (int i=0;i<cbr_index.size();i++) {
				if(max_cbr < cbr_index.get(i)) {
					max_cbr = cbr_index.get(i);
					holland_index = i;
				}
			}
			answerDTO = answerDTOService.newCase(answer.getHollandAnswers(), holland_index);
			answerDTOService.saveNewCase(answerDTO);
		}
		else {
			System.out.println("Saved case");
			holland_index = answerDTO.getA();
		}
		
		/*-----------------------------------------------------------------------------------------------------------------*/
		System.out.println("Training system: "+ training_index+" Holland: "+holland_index);
		List<Recommendation> rcms = recommendationService.getRecommendations(holland_index, training_index);
		for (Recommendation recommendation : rcms) {
			System.out.println(recommendation.getContent());
		}
		model.addAttribute("training", training_index);
		model.addAttribute("rcms", rcms);
		return "result";
	}
	@GetMapping("/result")
	public String result() {
		return "result";
	}
}
