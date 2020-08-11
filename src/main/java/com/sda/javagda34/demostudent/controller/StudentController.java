package com.sda.javagda34.demostudent.controller;

import com.sda.javagda34.demostudent.model.CreateStudentDto;
import com.sda.javagda34.demostudent.services.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("")
    public void submitStudent(@RequestBody CreateStudentDto student) {
        boolean success = studentService.createStudent(student);
    }
}
