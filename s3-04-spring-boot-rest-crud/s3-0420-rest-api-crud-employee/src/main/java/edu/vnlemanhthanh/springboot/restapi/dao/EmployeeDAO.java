package edu.vnlemanhthanh.springboot.restapi.dao;

import edu.vnlemanhthanh.springboot.restapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

	List<Employee> findAll();

	Employee findById(int theId);

	Employee save(Employee theEmployee);

	void deleteById(int theId);
}
