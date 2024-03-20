package com.example.demo.service;

import java.util.UUID;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.exception.UserNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
 EmployeeRepository  employeeRepository;

	public Employee addEmployee (Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return employeeRepository.save(employee);
	}

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee updateEmployee (Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee findEmployeeById(Long id) {
	    return employeeRepository.findEmployeeById(id)
	    		.orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}

	public void deleteEmployee(Long id){
		employeeRepository.deleteById(id);
	}

}