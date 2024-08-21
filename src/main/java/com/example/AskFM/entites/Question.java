package com.example.AskFM.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "questions")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Question extends BaseEntity{
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "generator"
    )
    @SequenceGenerator(
            name = "generator",
            sequenceName = "questions_seq",
            allocationSize = 1
    )
    @Column(name = "question_id")
    private Long id;

    @Column(nullable = false)
    private String question_text;


//    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    @JoinColumn(name = "from_user_id", referencedColumnName = "user_id")
//    private User from_user;
//
//    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    @JoinColumn(name = "to_user_id", referencedColumnName = "user_id")
//    private User to_user;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "parent_question_id", referencedColumnName = "question_id")
    private List<Question> threaded_questions;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "question_id")
    private List<Answer> answers;
}















