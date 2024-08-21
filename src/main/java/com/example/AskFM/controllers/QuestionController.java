package com.example.AskFM.controllers;

import com.example.AskFM.entites.Question;
import com.example.AskFM.repositories.QuestionRepo;
import com.example.AskFM.services.servicesImpl.QuestionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@RequestMapping("/questions")
@AllArgsConstructor
@RestController
public class QuestionController {
    private QuestionServiceImpl questionService;

//    @GetMapping("/findAll")
//    public List<Question> findAll(){
//        return questionService.findAll();
//    }
}
// a->b