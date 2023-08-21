package edu.vnlemanhthanh.springboot.springdatajpa.dao;

import edu.vnlemanhthanh.springboot.springdatajpa.entity.Student;

public interface StudentDAO  {

	void save(Student theStudent);

	Student findById(Integer id);
}
