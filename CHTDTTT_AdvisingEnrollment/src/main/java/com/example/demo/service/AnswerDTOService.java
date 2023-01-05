package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnswerDTO;
import com.example.demo.model.HollandAnswer;
import com.example.demo.repo.AnswerDTORepository;

@Service
public class AnswerDTOService {
	@Autowired
	private AnswerDTORepository answerDTORepository;
	
	public AnswerDTO getSameAnswerDTO(List<HollandAnswer> answers) {
		Optional<AnswerDTO> op = answerDTORepository.getSameAnswer(answers.get(0).getChoose(), answers.get(1).getChoose(), answers.get(2).getChoose(), answers.get(3).getChoose(), answers.get(4).getChoose(), answers.get(5).getChoose(), answers.get(6).getChoose(), answers.get(7).getChoose(), answers.get(8).getChoose(), answers.get(9).getChoose(), answers.get(10).getChoose(), answers.get(11).getChoose(), answers.get(12).getChoose(), answers.get(13).getChoose(), answers.get(14).getChoose(), answers.get(15).getChoose(), answers.get(16).getChoose(), answers.get(17).getChoose(), answers.get(18).getChoose(), answers.get(19).getChoose(), answers.get(20).getChoose(), answers.get(21).getChoose(), answers.get(22).getChoose(), answers.get(23).getChoose(), answers.get(24).getChoose(), answers.get(25).getChoose(), answers.get(26).getChoose(), answers.get(27).getChoose(), answers.get(28).getChoose(), answers.get(29).getChoose(), answers.get(30).getChoose(), answers.get(31).getChoose(), answers.get(32).getChoose(), answers.get(33).getChoose(), answers.get(34).getChoose(), answers.get(35).getChoose(), answers.get(36).getChoose(), answers.get(37).getChoose(), answers.get(38).getChoose(), answers.get(39).getChoose(), answers.get(40).getChoose(), answers.get(41).getChoose(), answers.get(42).getChoose(), answers.get(43).getChoose(), answers.get(44).getChoose(), answers.get(45).getChoose(), answers.get(46).getChoose(), answers.get(47).getChoose(), answers.get(48).getChoose(), answers.get(49).getChoose(), answers.get(50).getChoose(), answers.get(51).getChoose(), answers.get(52).getChoose(), answers.get(53).getChoose(), answers.get(54).getChoose(), answers.get(55).getChoose(), answers.get(56).getChoose(), answers.get(57).getChoose(), answers.get(58).getChoose(), answers.get(59).getChoose(), answers.get(60).getChoose(), answers.get(61).getChoose());
		if(op.isPresent()) return op.get();
		else return null;
	}
	public AnswerDTO newCase(List<HollandAnswer> answers,int holland_index) {
		AnswerDTO answerDTO = new AnswerDTO();
		answerDTO.setQ1(answers.get(0).getChoose());
		answerDTO.setQ2(answers.get(1).getChoose());
		answerDTO.setQ3(answers.get(2).getChoose());
		answerDTO.setQ4(answers.get(3).getChoose());
		answerDTO.setQ5(answers.get(4).getChoose());
		answerDTO.setQ6(answers.get(5).getChoose());
		answerDTO.setQ7(answers.get(6).getChoose());
		answerDTO.setQ8(answers.get(7).getChoose());
		answerDTO.setQ9(answers.get(8).getChoose());
		answerDTO.setQ10(answers.get(9).getChoose());
		answerDTO.setQ11(answers.get(10).getChoose());
		answerDTO.setQ12(answers.get(11).getChoose());
		answerDTO.setQ13(answers.get(12).getChoose());
		answerDTO.setQ14(answers.get(13).getChoose());
		answerDTO.setQ15(answers.get(14).getChoose());
		answerDTO.setQ16(answers.get(15).getChoose());
		answerDTO.setQ17(answers.get(16).getChoose());
		answerDTO.setQ18(answers.get(17).getChoose());
		answerDTO.setQ19(answers.get(18).getChoose());
		answerDTO.setQ20(answers.get(19).getChoose());
		answerDTO.setQ21(answers.get(20).getChoose());
		answerDTO.setQ22(answers.get(21).getChoose());
		answerDTO.setQ23(answers.get(22).getChoose());
		answerDTO.setQ24(answers.get(23).getChoose());
		answerDTO.setQ25(answers.get(24).getChoose());
		answerDTO.setQ26(answers.get(25).getChoose());
		answerDTO.setQ27(answers.get(26).getChoose());
		answerDTO.setQ28(answers.get(27).getChoose());
		answerDTO.setQ29(answers.get(28).getChoose());
		answerDTO.setQ30(answers.get(29).getChoose());
		answerDTO.setQ31(answers.get(30).getChoose());
		answerDTO.setQ32(answers.get(31).getChoose());
		answerDTO.setQ33(answers.get(32).getChoose());
		answerDTO.setQ34(answers.get(33).getChoose());
		answerDTO.setQ35(answers.get(34).getChoose());
		answerDTO.setQ36(answers.get(35).getChoose());
		answerDTO.setQ37(answers.get(36).getChoose());
		answerDTO.setQ38(answers.get(37).getChoose());
		answerDTO.setQ39(answers.get(38).getChoose());
		answerDTO.setQ40(answers.get(39).getChoose());
		answerDTO.setQ41(answers.get(40).getChoose());
		answerDTO.setQ42(answers.get(41).getChoose());
		answerDTO.setQ43(answers.get(42).getChoose());
		answerDTO.setQ44(answers.get(43).getChoose());
		answerDTO.setQ45(answers.get(44).getChoose());
		answerDTO.setQ46(answers.get(45).getChoose());
		answerDTO.setQ47(answers.get(46).getChoose());
		answerDTO.setQ48(answers.get(47).getChoose());
		answerDTO.setQ49(answers.get(48).getChoose());
		answerDTO.setQ50(answers.get(49).getChoose());
		answerDTO.setQ51(answers.get(50).getChoose());
		answerDTO.setQ52(answers.get(51).getChoose());
		answerDTO.setQ53(answers.get(52).getChoose());
		answerDTO.setQ54(answers.get(53).getChoose());
		answerDTO.setQ55(answers.get(54).getChoose());
		answerDTO.setQ56(answers.get(55).getChoose());
		answerDTO.setQ57(answers.get(56).getChoose());
		answerDTO.setQ58(answers.get(57).getChoose());
		answerDTO.setQ59(answers.get(58).getChoose());
		answerDTO.setQ60(answers.get(59).getChoose());
		answerDTO.setQ61(answers.get(60).getChoose());
		answerDTO.setQ62(answers.get(61).getChoose());
		answerDTO.setA(holland_index);
		return answerDTO;
	}
	public void saveNewCase(AnswerDTO answerDTO) {
		answerDTORepository.save(answerDTO);
	}
}
