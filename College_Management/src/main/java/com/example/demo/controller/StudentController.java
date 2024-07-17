package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.student_data;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/list")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")    
    public List<student_data> display1(){
		return studentService.getAllStudents();
	}
    
    @PostMapping("/student")
    public student_data saveStudent(@RequestBody student_data student) {
        studentService.saveStudent(student);
        return student;
    }
}


