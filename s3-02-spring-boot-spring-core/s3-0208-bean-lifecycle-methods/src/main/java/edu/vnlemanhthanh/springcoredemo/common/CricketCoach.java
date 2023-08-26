package edu.vnlemanhthanh.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	public CricketCoach() {
		System.out.println("in Contructor: " + this);
	}

	// define our init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("in doMyStartupStuff(): " + this);
	}

	// define our destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("in doMyCleanupStuff(): " + this);
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}
}