package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Employee;
import com.example.service.EmployeeService;

@RestController
public class H2DataBaseController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmp")
	public List<Employee> getAllEmolyees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping(
			 value="/addApplicant",
	            produces = "application/json",
	            headers = "Accept=application/json"
	            )
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	
}
