package com.example.level1.question;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private  final  QuestionRepository questionRepository;

    public List<Question> getAll() {
        List<Question> questions = this.questionRepository.findAll();
        return questions;
    }

    public Question getQuestion(int id) {
        Question question= this.questionRepository.getById(id);
        return question;
    }

    public void create(String subject, String content) {
        Question question = new Question();
        question.setSubject(subject);
        question.setContent(content);
        question.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(question);
    }
}
