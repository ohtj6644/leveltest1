package com.example.level1;

import com.example.level1.question.Question;
import com.example.level1.question.QuestionRepository;
import com.example.level1.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Level1ApplicationTests {
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void contextLoads() {
		Question question = new Question();
		question.setCreateDate(LocalDateTime.now());
		question.setSubject("제목1");
		question.setContent("내용1");
		this.questionRepository.save(question);

	}

}
