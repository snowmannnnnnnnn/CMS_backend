package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.employee_data;
import com.example.demo.entity.student_data;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/list")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/employee")
    public List<employee_data> display2() {
        return employeeService.getAllEmployees();
    }
    
    @PostMapping("/employee")
    public employee_data saveEmployee(@RequestBody employee_data employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }
}
