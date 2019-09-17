package com.springbootapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootapi.entity.Employee;

@Service
public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> getAllEmployeeList();
	
	Employee getEmployee(long employeeId);
	
	void deleteEmployee(long employeeId);

}
