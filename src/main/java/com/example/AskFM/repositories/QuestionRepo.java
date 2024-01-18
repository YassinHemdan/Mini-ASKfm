package com.example.AskFM.repositories;


import com.example.AskFM.entites.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Long> {
}
