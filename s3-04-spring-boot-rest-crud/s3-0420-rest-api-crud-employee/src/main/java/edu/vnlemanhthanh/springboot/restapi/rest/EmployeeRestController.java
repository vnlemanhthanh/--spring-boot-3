package edu.vnlemanhthanh.springboot.restapi.rest;

import edu.vnlemanhthanh.springboot.restapi.dao.EmployeeDAO;
import edu.vnlemanhthanh.springboot.restapi.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private EmployeeDAO employeeDAO;

	public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}

	@GetMapping("employees")
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

}
