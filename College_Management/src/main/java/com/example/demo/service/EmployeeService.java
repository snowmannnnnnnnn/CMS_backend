package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepository;
import com.example.demo.entity.employee_data;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepository employeeRepository;

    public List<employee_data> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public void saveEmployee(employee_data employee) {
		employeeRepository.save(employee);
    }
}
