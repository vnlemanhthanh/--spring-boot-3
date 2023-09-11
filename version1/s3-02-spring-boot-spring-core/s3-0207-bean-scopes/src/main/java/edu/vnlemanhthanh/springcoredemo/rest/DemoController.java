package edu.vnlemanhthanh.springcoredemo.rest;

import edu.vnlemanhthanh.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	// define a private field for the dependency
	private Coach myCoach;
	private Coach anotherCoach;

	// define a constructor for dependency injection

	@Autowired
	public DemoController(@Qualifier("cricketCoach") Coach theCoach,
	                      @Qualifier("cricketCoach") Coach theAnotherCoach) {
		System.out.println("in Contructor: " + this);
		myCoach = theCoach;
		anotherCoach = theAnotherCoach;
		System.out.println("  myCoach " + myCoach);
		System.out.println("  anotherCoach " + anotherCoach);
		System.out.println(myCoach == anotherCoach);
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}

	@GetMapping("/check")
	public String check() {
		return "comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
	}
}






