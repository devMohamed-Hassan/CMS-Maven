package com.coursemanagement.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "courses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@SQLRestriction("is_active = true")
public class Course {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @Column(nullable = false)
     private String title;

     @Column(length = 1000)
     private String description;

     @Column(nullable = false)
     private Integer credits;

     @Column(name = "is_active", nullable = false)
     @Builder.Default
     private boolean active = true;

     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "instructor_id")
     private Instructor instructor;

     @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
     @Builder.Default
     private List<Enrollment> enrollments = new ArrayList<>();
}