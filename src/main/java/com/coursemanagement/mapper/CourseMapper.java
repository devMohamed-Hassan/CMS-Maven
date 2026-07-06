package com.coursemanagement.mapper;

import org.springframework.stereotype.Component;

import com.coursemanagement.dto.CourseDto;
import com.coursemanagement.entity.Course;

@Component
public class CourseMapper {

     public CourseDto toDto(Course course) {
          return CourseDto.builder()
                    .id(course.getId())
                    .title(course.getTitle())
                    .description(course.getDescription())
                    .credits(course.getCredits())
                    .active(course.isActive())
                    .instructorId(course.getInstructor() != null ? course.getInstructor().getId() : null)
                    .instructorName(course.getInstructor() != null ? course.getInstructor().getName() : null)
                    .build();
     }
}
