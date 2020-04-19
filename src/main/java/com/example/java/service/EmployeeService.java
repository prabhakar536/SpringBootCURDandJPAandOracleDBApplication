package com.example.java.service;

import com.example.java.model.Employee;
import com.example.java.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee()
    {
        List<Employee> employeeList = employeeRepository.findAll();
        if(employeeList.size()>0)
        {
            return employeeList;
        }
        else{
            return new ArrayList<Employee>();
        }
    }
}
