package com.codeclan.example.EmployeeTracker.repositories;

import com.codeclan.example.EmployeeTracker.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
