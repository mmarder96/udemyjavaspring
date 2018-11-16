package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	// create default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService myFortuneService) {
//		fortuneService = myFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("TennisCoach: inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}
	
}
