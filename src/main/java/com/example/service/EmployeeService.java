package com.example.service;

import java.util.List;

import com.example.entities.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
}
