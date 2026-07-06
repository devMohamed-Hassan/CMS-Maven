package com.coursemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDto {
     private Long id;
     private String title;
     private String description;
     private Integer credits;
     private boolean active;
     private Long instructorId;
     private String instructorName;
}
