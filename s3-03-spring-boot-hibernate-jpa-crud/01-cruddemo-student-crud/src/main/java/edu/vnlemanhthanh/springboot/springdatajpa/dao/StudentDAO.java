package edu.vnlemanhthanh.springboot.springdatajpa.dao;

import edu.vnlemanhthanh.springboot.springdatajpa.entity.Student;

import java.util.List;

public interface StudentDAO  {

	void save(Student theStudent);

	Student findById(Integer studentId);

	List<Student> findAll();

	List<Student> findByLastName(String theLastName);

	void update(Student theStudent);

	void delete(Integer studentId);

	int deleteAll();
}
