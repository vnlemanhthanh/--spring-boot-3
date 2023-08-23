package edu.vnlemanhthanh.springboot.restapi.service;

import edu.vnlemanhthanh.springboot.restapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int theId);

	Employee save(Employee theEmployee);

	void deleteById(int theId);
}
