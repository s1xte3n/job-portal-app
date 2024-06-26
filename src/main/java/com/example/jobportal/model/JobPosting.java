package com.example.jobportal.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "job_postings")
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String location;
    private String company;
    private LocalDate postedDate;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "jobPosting")
    private Set<Application> applications;
}
