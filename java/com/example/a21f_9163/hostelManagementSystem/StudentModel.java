package com.example.a21f_9163.hostelManagementSystem;

public class StudentModel{
    private String name;
    private String registrationNumber;
    private String batch;
    private String department;
    private String phone;
    private String email;

    public StudentModel(String name, String registrationNumber, String batch, String department, String phone, String email) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.batch = batch;
        this.department = department;
        this.phone = phone;
        this.email = email;
    }
    public StudentModel() {
    }

    public String getBatch() {
        return batch;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
    public String setBatch(String batch) {
        this.batch = batch;
        return batch;
    }
    public String setDepartment(String department) {
        this.department = department;
        return department;
    }
    public String setEmail(String email) {
        this.email = email;
        return email;
    }
    public String setName(String name) {
        this.name = name;
        return name;
    }
    public String setPhone(String phone) {
        this.phone = phone;
        return phone;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public String setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return registrationNumber;
    }

}