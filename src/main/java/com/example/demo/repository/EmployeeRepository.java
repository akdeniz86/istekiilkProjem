package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	void deleteEmployeeById(Long id);
	Optional<Employee> findEmployeeById(Long id);


}
