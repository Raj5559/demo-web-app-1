package com.demo.in.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.in.entity.Employee;
import com.demo.in.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
		
	}
	
}
