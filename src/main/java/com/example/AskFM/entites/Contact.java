package com.example.AskFM.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "contacts")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Contact extends BaseEntity{
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "generator"
    )
    @SequenceGenerator(
            name = "generator",
            sequenceName = "contacts_seq",
            allocationSize = 1
    )
    @Column(name = "contact_id")
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(unique = true, length = 20)
    private String phone;
}
















