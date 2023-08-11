package com.example.testrest2dbh2.service;

import com.example.testrest2dbh2.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    @Transactional
    void deleteStudent(int id);
}