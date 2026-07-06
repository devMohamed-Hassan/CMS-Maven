package com.coursemanagement.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coursemanagement.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

     Page<Course> findByInstructorId(Long instructorId, Pageable pageable);

     Page<Course> findByTitleContainingIgnoreCase(String title, Pageable pageable);

     @Query("SELECT c FROM Course c WHERE c.active = false")
     Page<Course> findAllIncludingInactive(Pageable pageable);
}
