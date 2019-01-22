package com.codeclan.example.EmployeeTracker.models;

import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeTracker.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectTest {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EmployeeRepository employeeRepository;


    @Test
    public void canSaveEmployee(){
        employeeRepository.deleteAll();
        Employee employee = new Employee("Steven", "TheAwesome", 49168);
        employeeRepository.save(employee);
        assertEquals(1, employeeRepository.count());
    }



}