package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class TrackCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	// default constructor
	public TrackCoach() {
		System.out.println("TrackCoach: inside default constructor");
	}

//	@Autowired
//	public TrackCoach(FortuneService myFortuneService) {
//		fortuneService = myFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Run a 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
