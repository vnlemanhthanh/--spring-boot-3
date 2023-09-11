package edu.vnlemanhthanh.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	public TennisCoach() {
		System.out.println("in Contructor: " + this);
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
}
