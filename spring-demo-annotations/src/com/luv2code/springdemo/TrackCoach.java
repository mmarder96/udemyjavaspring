package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;


@Component
public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	@Autowired
//	@Qualifier("randomFortuneService")
	public TrackCoach(FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
