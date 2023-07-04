package com.example.level1.question;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class QuestionController {

    private  final QuestionService questionService;


    @GetMapping("/question/list")
    public String list(Model model){
        List<Question> questions = this.questionService.getAll();
        model.addAttribute("questions",questions);
        return "question_list";
    }
    @GetMapping(value = "question/detail/{id}")
    public  String detail(Model model , @PathVariable("id") Integer id){
        Question question= this.questionService.getQuestion(id);
        model.addAttribute("question",question);
        return "question_detail";

    }

    @GetMapping("question/create")
    public String create(){
        return "question_form";
    }

    @PostMapping("question/create")
    public String create(QuestionForm questionForm , BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "question_form";
        }
        this.questionService.create(questionForm.getSubject(),questionForm.getContent());
      return "redirect:http://localhost:8080/question/list";
    }

}
