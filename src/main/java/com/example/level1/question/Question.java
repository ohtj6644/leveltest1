package com.example.level1.question;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import org.hibernate.annotations.BatchSize;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String subject;

    @Column(columnDefinition = "text")
    private String content;

    private LocalDateTime createDate;

}
