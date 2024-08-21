package com.example.AskFM.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "answers")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Answer extends BaseEntity{
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "generator"
    )
    @SequenceGenerator(
            name = "generator",
            sequenceName = "answers_seq",
            allocationSize = 1
    )
    @Column(name = "answer_id")
    private Long id;

    @Column(nullable = false)
    private String answer_text;
}















