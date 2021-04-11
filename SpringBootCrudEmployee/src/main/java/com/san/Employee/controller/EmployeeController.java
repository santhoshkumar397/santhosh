package com.san.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.san.Employee.entity.Employee;
import com.san.Employee.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return service.saveEmployee(employee);
	}
	@PostMapping("/addEmployee")
	public List<Employee> addEmployee(@RequestBody List<Employee> employees)
	{
		return service.saveEmployee(employees);
	}
	@GetMapping("/employees")
	public List<Employee> findAllEmployee()
	{
		return service.getEmployee();
	}
	@GetMapping("/employee/{id}")
	public Employee findEmployeeById(@PathVariable int id)
	{
		return service.getEmployeeById(id);
	}
	@GetMapping("/employee/{firstName}")
	public Employee findEmployeeByFirstName(@PathVariable String firstName)
	{
		return service.getEmployeeByFirstName(firstName);
	}
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return service.updateEmployee(employee);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		return service.deleteEmployee(id);
	}
}
