package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.student_data;

@Repository
public interface StudentRepository extends JpaRepository<student_data, Integer> {
}
