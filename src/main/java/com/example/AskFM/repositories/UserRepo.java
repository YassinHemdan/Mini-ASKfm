package com.example.AskFM.repositories;


import com.example.AskFM.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
