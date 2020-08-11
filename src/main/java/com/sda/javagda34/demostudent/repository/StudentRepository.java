package com.sda.javagda34.demostudent.repository;

import com.sda.javagda34.demostudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
