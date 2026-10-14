package com.example.student_service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final CourseClient courseClient;

    private final List<Student> students = List.of(
            new Student(1L, "Harshal", "harshal@example.com", 101L),
            new Student(2L, "Atharv", "atharv@example.com", 102L),
            new Student(3L, "Anushka", "anushka@example.com", 103L)
    );

    public StudentController(CourseClient courseClient) {
        this.courseClient = courseClient;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Student not found with id: " + id
                ));
    }

    @GetMapping("/{id}/course")
    public Map<String, Object> getStudentWithCourse(
            @PathVariable Long id) {

        Student student = getStudentById(id);

        Map<String, Object> course =
                courseClient.getCourseById(student.getCourseId());

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("student", student);
        response.put("course", course);

        return response;
    }
}