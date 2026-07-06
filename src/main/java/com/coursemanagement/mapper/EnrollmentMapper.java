package com.coursemanagement.mapper;

import org.springframework.stereotype.Component;

import com.coursemanagement.dto.EnrollmentDto;
import com.coursemanagement.entity.Enrollment;

@Component
public class EnrollmentMapper {

     public EnrollmentDto toDto(Enrollment enrollment) {
          return EnrollmentDto.builder()
                    .id(enrollment.getId())
                    .studentId(enrollment.getStudent().getId())
                    .studentName(enrollment.getStudent().getName())
                    .courseId(enrollment.getCourse().getId())
                    .courseTitle(enrollment.getCourse().getTitle())
                    .enrolledAt(enrollment.getEnrolledAt())
                    .build();
     }
}
