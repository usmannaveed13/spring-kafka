package com.course.kafkaconsumer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    public Employee(String employeeId, String name, String birthDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Employee() {

    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("employee_id")
    private String employeeId;
    private String name;

    @JsonProperty("birth_date")
    private String birthDate;
}
