package com.example.AskFM.dtos.responses;


import com.example.AskFM.entites.Contact;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO {
    private String full_name;
    private String user_name;
    private List<Contact> contacts;
}
