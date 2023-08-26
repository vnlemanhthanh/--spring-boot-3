package edu.vnlemanhthanh.springcoredemo.config;

import edu.vnlemanhthanh.springcoredemo.common.Coach;
import edu.vnlemanhthanh.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

	@Bean("aquatic")
	public Coach swimCoach() {
		System.out.println("in swimCoach() in " + this);
		SwimCoach swimCoach = new SwimCoach();
		System.out.println("in swimCoach() in " + swimCoach);
		return swimCoach;

	}
}
