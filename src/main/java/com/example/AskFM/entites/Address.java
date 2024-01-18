package com.example.AskFM.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    @Column(length = 50)
    private String street;

    @Column(length = 50)
    private String city;

    @Column(nullable = false, length = 50)
    private String country;
}
