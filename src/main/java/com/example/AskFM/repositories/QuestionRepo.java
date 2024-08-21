package com.example.AskFM.repositories;


import com.example.AskFM.entites.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface QuestionRepo extends JpaRepository<Question, Long> {

}
