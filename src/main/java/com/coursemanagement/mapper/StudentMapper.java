package com.coursemanagement.mapper;

import org.springframework.stereotype.Component;

import com.coursemanagement.dto.StudentCreateDto;
import com.coursemanagement.dto.StudentDto;
import com.coursemanagement.entity.Student;

@Component
public class StudentMapper {

     public StudentDto toDto(Student student) {
          return StudentDto.builder()
                    .id(student.getId())
                    .name(student.getName())
                    .email(student.getEmail())
                    .build();
     }

     public Student toEntity(StudentCreateDto dto) {
          return Student.builder()
                    .name(dto.getName())
                    .email(dto.getEmail())
                    .build();
     }
}
