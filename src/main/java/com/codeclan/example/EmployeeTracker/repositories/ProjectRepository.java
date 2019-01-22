package com.codeclan.example.EmployeeTracker.repositories;

import com.codeclan.example.EmployeeTracker.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
