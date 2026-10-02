package com.example.StudentManagementP02.repository;

import com.example.StudentManagementP02.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
