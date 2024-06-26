package com.example.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jobportal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
