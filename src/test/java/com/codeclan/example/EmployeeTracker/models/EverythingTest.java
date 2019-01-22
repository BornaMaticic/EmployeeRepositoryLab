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
public class EverythingTest {

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

    @Test
    public void canSaveProject() {
        projectRepository.deleteAll();
        Project proj = new Project("Skunkworks", 120);
        projectRepository.save(proj);
        assertEquals(1,projectRepository.count());
    }

		@Test
		public void canAddEmployeesToProject() {
    	projectRepository.deleteAll();
    	employeeRepository.deleteAll();
    	Project p = new Project("Secret Project", 100);
    	Employee e1 = new Employee("Joe","Bloogs",123);
    	Employee e2 = new Employee("Jin", "Yang", 1);
    	e1.addEmployeeTpProject(p);
    	e2.addEmployeeTpProject(p);
    	assertEquals(1,e1.getProjects().size());
			assertEquals(1,e2.getProjects().size());

		}

}