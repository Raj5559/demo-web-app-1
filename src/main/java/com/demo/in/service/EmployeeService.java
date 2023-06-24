package com.demo.in.service;

import java.util.List;

import com.demo.in.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();
}
