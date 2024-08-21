package com.example.AskFM.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User extends BaseEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "generator"
    )
    @SequenceGenerator(
            name = "generator",
            sequenceName = "users_seq",
            allocationSize = 1
    )
    @Column(name = "user_id")
    private Long id;

    @Embedded
    private Address address;

    @Column(nullable = false, length = 30)
    private String first_name;

    @Column(nullable = false, length = 30)
    private String last_name;

    @Column(nullable = false, unique = true, updatable = false)
    private String user_name;

    @Column(nullable = false)
    private String password;

    // fetch type is lazy for all one-to-{}
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "user_id")
    private List<Contact> contacts;

//    @OneToMany(mappedBy = "from_user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    private List<Question> questions_from_me;
//
//    @OneToMany(mappedBy = "to_user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
//    private List<Question> questions_to_me;
}


















