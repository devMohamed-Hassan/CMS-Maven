package com.coursemanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.coursemanagement.entity.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

     Page<Enrollment> findByStudentId(Long studentId, Pageable pageable);

     Page<Enrollment> findByCourseId(Long courseId, Pageable pageable);

     Optional<Enrollment> findByStudentIdAndCourseId(Long studentId, Long courseId);

     boolean existsByStudentIdAndCourseId(Long studentId, Long courseId);

     List<Enrollment> findByStudentId(Long studentId);
}
