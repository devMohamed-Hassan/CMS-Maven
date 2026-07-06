package com.coursemanagement.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnrollmentDto {
     private Long id;
     private Long studentId;
     private String studentName;
     private Long courseId;
     private String courseTitle;
     private LocalDateTime enrolledAt;
}
