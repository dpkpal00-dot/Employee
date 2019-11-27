package com.employee.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.employee.management.model.Employee;

// interface extending crud repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	 public List<Employee> findAllByOrderByFirstNameAsc();
	 
	 
	
}
