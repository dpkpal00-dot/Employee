package com.employee.management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employee.management.model.Employee;
import com.employee.management.repository.EmployeeRepository;

// employee service class
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// fetching all employees
	public List<Employee> getAllEmployees(){
		List<Employee> emps = (List<Employee>)employeeRepository.findAllByOrderByFirstNameAsc(); 
		return emps;
	}
	// inserting employee
	public void addEmployee(Employee e) {
		employeeRepository.save(e);
	}
}
