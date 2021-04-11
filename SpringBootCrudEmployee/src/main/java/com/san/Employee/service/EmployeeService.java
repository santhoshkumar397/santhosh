package com.san.Employee.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.san.Employee.entity.Employee;
import com.san.Employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee)
	{
		return repository.save(employee);
	}
	
	public List<Employee> saveEmployee(List<Employee> employee)
	{
		return repository.saveAll(employee);
	}
	
	public List<Employee> getEmployee()
	{
		return repository.findAll();
	}
	
	public Employee getEmployeeById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	public Employee getEmployeeByFirstName(String firstName)
	{
		return repository.findByFirstName(firstName);
	}
	
	public String deleteEmployee(int id)
	{
		repository.deleteById(id);
		return "product removed !! "+id;
	}
	
	

	public Employee updateEmployee(Employee employee)
	{
		Employee existingEmployee=repository.findById(employee.getId()).orElse(null);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmployeeid(employee.getEmployeeid());
		existingEmployee.setStartDt(employee.getStartDt());
		existingEmployee.setDesignation(employee.getDesignation());
		existingEmployee.setDepatment(employee.getDepatment());
		existingEmployee.setEndDt(employee.getEndDt());
		existingEmployee.setStatus(employee.getStatus());
		existingEmployee.setDob(employee.getDob());
		existingEmployee.setReportManager(employee.getReportManager());
		existingEmployee.setGender(employee.getGender());
		existingEmployee.setBloodGroup(employee.getBloodGroup());
		existingEmployee.setAddress(employee.getAddress());
		
		return repository.save(existingEmployee);
	}
}
