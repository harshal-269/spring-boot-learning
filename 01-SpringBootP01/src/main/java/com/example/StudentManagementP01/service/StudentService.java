package com.example.StudentManagementP01.service;

import com.example.StudentManagementP01.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public StudentService(){
        students.add(
                new Student(
                        1, "Harsh", "harshal@gmail.com", "Spring Boot"
                )
        );

        students.add(
                new Student(
                        2, "Anu", "anushla@gmail.com", "Spring Boot"
                )
        );
    }

    //get all students
    public List<Student> getAllStudents(){
        return students;
    }

    //get student by id
    public Student getStudentById(int id){

        for(Student student : students){
            if(student.getId()==id){
                return student;
            }
        }

        return null;
    }

    //POST- add student
    public Student addStudent(Student student){
        students.add(student);

        return student;
    }

    //delete
    public String deleteStudent(int id){
        for(Student student : students){
            if(student.getId()==id){
                students.remove(student);

                return "Student deleted successfully!";
            }
        }
        return "Student not found";
    }
}
