package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AnswerDTO;

@Repository
public interface AnswerDTORepository extends JpaRepository<AnswerDTO, Integer>{
	@Query(value = "SELECT * FROM answers where q1 = :q1 "
			+ "and q2 = :q2 "
			+ "and q3 = :q3 "
			+ "and q4 = :q4 "
			+ "and q5 = :q5 "
			+ "and q6 = :q6 "
			+ "and q7 = :q7 "
			+ "and q8 = :q8 "
			+ "and q9 = :q9 "
			+ "and q10 = :q10 "
			+ "and q11 = :q11 "
			+ "and q12 = :q12 "
			+ "and q13 = :q13 "
			+ "and q14 = :q14 "
			+ "and q15 = :q15 "
			+ "and q16 = :q16 "
			+ "and q17 = :q17 "
			+ "and q18 = :q18 "
			+ "and q19 = :q19 "
			+ "and q20 = :q20 "
			+ "and q21 = :q21 "
			+ "and q22 = :q22 "
			+ "and q23 = :q23 "
			+ "and q24 = :q24 "
			+ "and q25 = :q25 "
			+ "and q26 = :q26 "
			+ "and q27 = :q27 "
			+ "and q28 = :q28 "
			+ "and q29 = :q29 "
			+ "and q30 = :q30 "
			+ "and q31 = :q31 "
			+ "and q32 = :q32 "
			+ "and q33 = :q33 "
			+ "and q34 = :q34 "
			+ "and q35 = :q35 "
			+ "and q36 = :q36 "
			+ "and q37 = :q37 "
			+ "and q38 = :q38 "
			+ "and q39 = :q39 "
			+ "and q40 = :q40 "
			+ "and q41 = :q41 "
			+ "and q42 = :q42 "
			+ "and q43 = :q43 "
			+ "and q44 = :q44 "
			+ "and q45 = :q45 "
			+ "and q46 = :q46 "
			+ "and q47 = :q47 "
			+ "and q48 = :q48 "
			+ "and q49 = :q49 "
			+ "and q50 = :q50 "
			+ "and q51 = :q51 "
			+ "and q52 = :q52 "
			+ "and q53 = :q53 "
			+ "and q54 = :q54 "
			+ "and q55 = :q55 "
			+ "and q56 = :q56 "
			+ "and q57 = :q57 "
			+ "and q58 = :q58 "
			+ "and q59 = :q59 "
			+ "and q60 = :q60 "
			+ "and q61 = :q61 "
			+ "and q62 = :q62 ",nativeQuery = true)
	Optional<AnswerDTO> getSameAnswer(@Param("q1") Integer q1,
			@Param("q2") Integer q2,
			@Param("q3") Integer q3,
			@Param("q4") Integer q4,
			@Param("q5") Integer q5,
			@Param("q6") Integer q6,
			@Param("q7") Integer q7,
			@Param("q8") Integer q8,
			@Param("q9") Integer q9,
			@Param("q10") Integer q10,
			@Param("q11") Integer q11,
			@Param("q12") Integer q12,
			@Param("q13") Integer q13,
			@Param("q14") Integer q14,
			@Param("q15") Integer q15,
			@Param("q16") Integer q16,
			@Param("q17") Integer q17,
			@Param("q18") Integer q18,
			@Param("q19") Integer q19,
			@Param("q20") Integer q20,
			@Param("q21") Integer q21,
			@Param("q22") Integer q22,
			@Param("q23") Integer q23,
			@Param("q24") Integer q24,
			@Param("q25") Integer q25,
			@Param("q26") Integer q26,
			@Param("q27") Integer q27,
			@Param("q28") Integer q28,
			@Param("q29") Integer q29,
			@Param("q30") Integer q30,
			@Param("q31") Integer q31,
			@Param("q32") Integer q32,
			@Param("q33") Integer q33,
			@Param("q34") Integer q34,
			@Param("q35") Integer q35,
			@Param("q36") Integer q36,
			@Param("q37") Integer q37,
			@Param("q38") Integer q38,
			@Param("q39") Integer q39,
			@Param("q40") Integer q40,
			@Param("q41") Integer q41,
			@Param("q42") Integer q42,
			@Param("q43") Integer q43,
			@Param("q44") Integer q44,
			@Param("q45") Integer q45,
			@Param("q46") Integer q46,
			@Param("q47") Integer q47,
			@Param("q48") Integer q48,
			@Param("q49") Integer q49,
			@Param("q50") Integer q50,
			@Param("q51") Integer q51,
			@Param("q52") Integer q52,
			@Param("q53") Integer q53,
			@Param("q54") Integer q54,
			@Param("q55") Integer q55,
			@Param("q56") Integer q56,
			@Param("q57") Integer q57,
			@Param("q58") Integer q58,
			@Param("q59") Integer q59,
			@Param("q60") Integer q60,
			@Param("q61") Integer q61,
			@Param("q62") Integer q62
			);
}
