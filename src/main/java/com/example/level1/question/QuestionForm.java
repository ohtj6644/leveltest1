package com.example.level1.question;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {


//    @NotEmpty(message = "제목은 필수항목입니다.")
    public String subject;

    public  String content;
}
