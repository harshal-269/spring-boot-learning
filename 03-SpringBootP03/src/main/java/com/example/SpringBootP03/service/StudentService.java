package com.example.SpringBootP03.service;

import com.example.SpringBootP03.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    Student patchStudent(Long id, Student student);

    void deleteStudent(Long id);

    List<Student> getStudentsByCourse(String course);

    List<Student> searchStudents(String name);

}
