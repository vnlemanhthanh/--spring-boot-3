package edu.vnlemanhthanh.springboot.restapi.dao;

import edu.vnlemanhthanh.springboot.restapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
}
