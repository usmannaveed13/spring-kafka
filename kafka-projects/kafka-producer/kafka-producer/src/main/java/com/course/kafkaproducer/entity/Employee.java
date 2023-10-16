package com.course.kafkaproducer.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    public Employee(String employeeId, String name, String birthDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getEmployeeId() {
        return employeeId;
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
