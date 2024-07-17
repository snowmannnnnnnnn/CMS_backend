package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student_data {
    @Id
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private String date_of_birth;
    private double gpa;
    private String graduation_year;
    private String student_status;

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMajor() {
        return major;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGraduation_year() {
        return graduation_year;
    }

    public String getStudent_status() {
        return student_status;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setGraduation_year(String graduation_year) {
        this.graduation_year = graduation_year;
    }

    public void setStudent_status(String student_status) {
        this.student_status = student_status;
    }
}

