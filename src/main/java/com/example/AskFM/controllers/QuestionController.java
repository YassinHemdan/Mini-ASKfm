package com.example.AskFM.controllers;

import com.example.AskFM.repositories.QuestionRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
@AllArgsConstructor
public class QuestionController {
    private final QuestionRepo questionRepo;
}
