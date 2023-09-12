package com.vnlemanhthanh.springboot.cruddemo.dao;

import com.vnlemanhthanh.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}
