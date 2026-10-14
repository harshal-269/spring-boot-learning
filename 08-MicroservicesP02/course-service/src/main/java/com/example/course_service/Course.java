package com.example.course_service;

public class Course {
    private Long id;
    private String name;
    private String instructor;
    private int durationInWeeks;

    public Course(){

    }

    public Course(Long id, String name, String instructor, int durationInWeeks) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.durationInWeeks = durationInWeeks;
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

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }
}
