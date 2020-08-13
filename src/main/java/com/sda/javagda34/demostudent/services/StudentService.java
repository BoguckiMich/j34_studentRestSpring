package com.sda.javagda34.demostudent.services;

import com.sda.javagda34.demostudent.model.CreateStudentDto;
import com.sda.javagda34.demostudent.model.Student;
import com.sda.javagda34.demostudent.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.orElse(null);
    }

    public boolean deleteStudent(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            studentRepository.deleteById(id);
        }
        return false;
    }
}
