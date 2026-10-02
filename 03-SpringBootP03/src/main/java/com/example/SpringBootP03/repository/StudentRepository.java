package com.example.SpringBootP03.repository;

import com.example.SpringBootP03.entity.Student;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
   List<Student> findByCourse(String course);

    List<Student> findByNameContainingIgnoreCase(String name);

}
