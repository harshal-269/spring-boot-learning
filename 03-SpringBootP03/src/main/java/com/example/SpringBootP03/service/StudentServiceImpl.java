package com.example.SpringBootP03.service;

import com.example.SpringBootP03.entity.Student;
import com.example.SpringBootP03.exception.StudentNotFoundException;
import com.example.SpringBootP03.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(()->
                        new StudentNotFoundException(
                                "Student not found with "+ id));
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existingStudent = getStudentById(id);

        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setCourse(student.getCourse());
        existingStudent.setAge(student.getAge());
        existingStudent.setMarks(student.getMarks());

        return studentRepository.save(existingStudent);
    }

    @Override
    public Student patchStudent(Long id, Student student) {
        Student existingStudent = getStudentById(id);

        if(student.getName()!=null){
            existingStudent.setName(student.getName());
        }

        if (student.getEmail() != null) {
            existingStudent.setEmail(student.getEmail());
        }

        if (student.getCourse() != null) {
            existingStudent.setCourse(student.getCourse());
        }

        if (student.getAge() != 0) {
            existingStudent.setAge(student.getAge());
        }

        if (student.getMarks() != 0) {
            existingStudent.setMarks(student.getMarks());
        }

        return studentRepository.save(existingStudent);


    }

    @Override
    public void deleteStudent(Long id) {
        Student existingStudent = getStudentById(id);

        studentRepository.delete(existingStudent);
    }

    @Override
    public List<Student> getStudentsByCourse(String course) {
        return studentRepository.findByCourse(course);
    }

    @Override
    public List<Student> searchStudents(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }
}
