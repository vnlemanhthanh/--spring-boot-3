package edu.vnlemanhthanh.springboot.springdatajpa.dao;

import edu.vnlemanhthanh.springboot.springdatajpa.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

	// define field for entity manager
	private EntityManager entityManager;

	// inject entity manager using constructor injection
	@Autowired
	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	// implement save method
	@Override
	@Transactional
	public void save(Student theStudent) {
		entityManager.persist(theStudent);
	}

	@Override
	public Student findById(Integer studentId) {
		return entityManager.find(Student.class, studentId);
	}

	@Override
	public List<Student> findAll() {
		TypedQuery<Student> theQuery = entityManager.createQuery(
				"From Student order by lastName", Student.class);
		return theQuery.getResultList();
	}

	@Override
	public List<Student> findByLastName(String theLastName) {
		TypedQuery<Student> theQuery = entityManager.createQuery(
				"From Student Where lastName=:theData", Student.class);
		theQuery.setParameter("theData", theLastName);
		return theQuery.getResultList();
	}

	@Override
	@Transactional
	public void update(Student theStudent) {
		entityManager.merge(theStudent);
	}

	@Override
	@Transactional
	public void delete(Integer studentId) {
		Student theStudent = entityManager.find(Student.class, studentId);
		entityManager.remove(theStudent);

	}

	@Override
	@Transactional
	public int deleteAll() {
		int numRowsDeleted =
				entityManager.createQuery("DELETE From Student")
					.executeUpdate();
		return numRowsDeleted;
	}

}










