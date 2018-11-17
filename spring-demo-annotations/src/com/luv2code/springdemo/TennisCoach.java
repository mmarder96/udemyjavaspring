package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

//	@Autowired
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// create default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	@Autowired
	public TennisCoach(@Qualifier("fileFortuneService") FortuneService myFortuneService) {
		System.out.println("TennisCoach: inside constructor using @autowired and @qualifier");
		fortuneService = myFortuneService;
	}

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
