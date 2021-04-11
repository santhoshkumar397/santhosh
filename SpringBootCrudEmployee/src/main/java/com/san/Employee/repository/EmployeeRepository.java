package com.san.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.san.Employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findByFirstName(String firstName);

}
