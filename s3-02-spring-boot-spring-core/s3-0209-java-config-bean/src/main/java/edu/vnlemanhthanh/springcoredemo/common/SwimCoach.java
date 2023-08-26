package edu.vnlemanhthanh.springcoredemo.common;

public class SwimCoach implements Coach {

	public SwimCoach() {
		System.out.println("in Constructor: " + this);
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}
}
