package edu.vnlemanhthanh.springboot.restapi.dao;

import edu.vnlemanhthanh.springboot.restapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

	List<Employee> findAll();
}
