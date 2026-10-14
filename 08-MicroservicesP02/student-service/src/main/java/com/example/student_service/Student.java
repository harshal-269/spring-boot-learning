package com.example.student_service;

public class Student {

    private Long id;
    private String name;
    private String email;
    private Long courseId;

    public Student(){

    }

    public Student(Long id, String name, String email, Long courseId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.courseId = courseId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }
}
