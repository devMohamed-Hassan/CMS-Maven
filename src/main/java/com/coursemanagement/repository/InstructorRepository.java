package com.coursemanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursemanagement.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
     Optional<Instructor> findByEmail(String email);

     boolean existsByEmail(String email);
}
