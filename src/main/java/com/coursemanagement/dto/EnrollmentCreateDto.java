package com.coursemanagement.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnrollmentCreateDto {

     @NotNull(message = "Student id is required")
     private Long studentId;

     @NotNull(message = "Course id is required")
     private Long courseId;
}
