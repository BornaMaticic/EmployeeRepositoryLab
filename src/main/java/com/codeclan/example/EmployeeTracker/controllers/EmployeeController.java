package com.codeclan.example.EmployeeTracker.controllers;

import com.codeclan.example.EmployeeTracker.models.Employee;
import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")

public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

}
