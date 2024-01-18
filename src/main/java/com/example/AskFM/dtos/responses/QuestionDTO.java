package com.example.AskFM.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {
    private String question_text;
    private List<AnswerDTO> answers;
}
