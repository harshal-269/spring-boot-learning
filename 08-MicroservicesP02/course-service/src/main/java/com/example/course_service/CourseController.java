package com.example.course_service;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.c;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final List<Course> courses = List.of(
            new Course(101L, "Java Programming", "Rahul Sharma", 8),
            new Course(102L, "Spring Boot", "Priya Patil", 6),
            new Course(103L, "Microservices", "Amit Deshmukh", 5)
    );

    @GetMapping
    public List<Course> getAllCourses(){
        return courses;
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courses.stream()
                .filter(course -> course.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Course not found with id: " + id
                ));
    }
}
