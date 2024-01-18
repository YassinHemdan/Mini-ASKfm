package com.example.AskFM.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionToUserDTO {
    private String question_text;
    private UserDTO from_user;
    private List<AnswerDTO> answers;
    private List<QuestionFromDTO> threaded_questions;
}
