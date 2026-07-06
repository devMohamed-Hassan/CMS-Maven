package com.coursemanagement.mapper;

import org.springframework.stereotype.Component;

import com.coursemanagement.dto.InstructorCreateDto;
import com.coursemanagement.dto.InstructorDto;
import com.coursemanagement.entity.Instructor;

@Component
public class InstructorMapper {

     public InstructorDto toDto(Instructor instructor) {
          return InstructorDto.builder()
                    .id(instructor.getId())
                    .name(instructor.getName())
                    .email(instructor.getEmail())
                    .build();
     }

     public Instructor toEntity(InstructorCreateDto dto) {
          return Instructor.builder()
                    .name(dto.getName())
                    .email(dto.getEmail())
                    .build();
     }
}
