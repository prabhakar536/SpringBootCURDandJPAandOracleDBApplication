package com.example.java.model;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "EMPID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;
    @Column(name = "EMPNAME")
    private String empName;
    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name="SALARY")
    private float salary;

    public Employee() {
    }

    public Employee(long empId, String empName, String designation, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
