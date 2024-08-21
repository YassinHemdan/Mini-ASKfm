package com.example.AskFM.services.servicesImpl;

import com.example.AskFM.controllers.QuestionController;
import com.example.AskFM.entites.Question;
import com.example.AskFM.repositories.QuestionRepo;
import com.example.AskFM.services.Iservices.QuestionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepo questionRepo;

    @Override
    public List<Question> findAll() {
        return null;
    }

//    @Autowired
//    public QuestionServiceImpl(QuestionRepo questionRepo){
//        this.questionRepo = questionRepo;
//    }

//    public List<Question> findAll(){
//        // logic
//        return questionRepo.findAll();
//    }
}
