package edu.vnlemanhthanh.springboot.restapi.rest;

import edu.vnlemanhthanh.springboot.restapi.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getStudents() {
		ArrayList<Student> theStudents = new ArrayList<>();

		theStudents.add(new Student("Poornima", "Patel"));
		theStudents.add(new Student("Mario", "Rossi"));
		theStudents.add(new Student("Mary", "Smith"));

		return theStudents;
	}
}
