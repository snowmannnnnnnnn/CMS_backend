package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.employee_data;

@Repository
public interface EmployeeRepository extends JpaRepository<employee_data, Integer> {
}
