package com.example.jobportal.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resume;
    private String coverLetter;
    private LocalDate applicationDate;

    @ManyToOne
    private JobPosting jobPosting;

    @ManyToOne
    private User user;
}
