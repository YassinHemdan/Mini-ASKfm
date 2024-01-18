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
public class FeedDTO {
    private String question_text;
    private UserDTO from_user;
    private UserDTO to_user;
    private List<AnswerDTO> answers;
    private List<FeedQuestionDTO> threaded_questions;
}
