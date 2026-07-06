package com.coursemanagement.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseCreateDto {

     @NotBlank(message = "Title is required")
     private String title;

     private String description;

     @NotNull(message = "Credits is required")
     @Min(value = 1, message = "Credits must be at least 1")
     private Integer credits;

     @NotNull(message = "Instructor id is required")
     private Long instructorId;
}
