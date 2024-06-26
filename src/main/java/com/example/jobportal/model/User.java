package com.example.jobportal.model;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String username;
   private String password;
   private String role;

   @OneToMany(mappedBy = "user")
   private Set<JobPosting> jobPostings;

   @OneToMany(mappedBy = "user")
   private Set<Application> applications;
}
