package com.sda.javagda34.demostudent.controller;

import com.sda.javagda34.demostudent.model.CreateStudentDto;
import com.sda.javagda34.demostudent.model.Student;
import com.sda.javagda34.demostudent.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public void submitStudent(@RequestBody CreateStudentDto student) {
        boolean success = studentService.createStudent(student);
    }

    @GetMapping("")
    public List<Student> getStudentInfo(){
        return studentService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentInfoById(@PathVariable(name = "id") Long id){
        return studentService.findById(id);
    }

    @GetMapping("/remove/{id}")
    public void removeStudent(@PathVariable(name="id") Long id){
        boolean success = studentService.deleteStudent(id);
    }
}
