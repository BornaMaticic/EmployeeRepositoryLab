package com.codeclan.example.EmployeeTracker.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name")
    private String name;

    @Column(name = "durationDays")
    private int durationDays;

    public Project(String name, int durationDays) {
        this.name = name;
        this.durationDays = durationDays;
    }

    public Project() {};

    @JsonIgnore
    @ManyToMany
    @JoinTable(
          name = "employees_projects",
          joinColumns = { @JoinColumn(
                  name = "employee_id",
                  nullable = false,
                  updatable = false)
          },
            inverseJoinColumns = {@JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)}

    )
    private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

}
