package com.springbootapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapi.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

	

	//Employee findOne(long employeeId);

	//Employee delete(long employeeId);

}
