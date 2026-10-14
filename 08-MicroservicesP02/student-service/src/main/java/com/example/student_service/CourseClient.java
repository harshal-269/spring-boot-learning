package com.example.student_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "course-service")
public interface CourseClient {

    @GetMapping("/api/courses/{id}")
    Map<String, Object> getCourseById(@PathVariable("id") Long id);
}