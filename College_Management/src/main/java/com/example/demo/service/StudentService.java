package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.StudentRepository;
import com.example.demo.entity.student_data;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<student_data> getAllStudents() {
        return studentRepository.findAll();
    }
    
    public void saveStudent(student_data student) {
    		studentRepository.save(student);
    }
}
