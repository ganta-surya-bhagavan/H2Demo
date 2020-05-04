package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
