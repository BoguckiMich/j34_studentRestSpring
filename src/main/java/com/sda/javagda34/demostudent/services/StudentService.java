package com.sda.javagda34.demostudent.services;

import com.sda.javagda34.demostudent.model.CreateStudentDto;
import com.sda.javagda34.demostudent.model.Student;
import com.sda.javagda34.demostudent.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public boolean createStudent(CreateStudentDto studentDto) {
        Student student = Student.builder()
                .firstName(studentDto.getName())
                .lastName(studentDto.getSurName())
                .gender(studentDto.getSex())
                .build();

        studentRepository.save(student);

        return false;
    }
}
