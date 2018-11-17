package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Scope("singleton")
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

	@PostConstruct
	private void intit() {
		System.out.println("Tennis Coach: inside init method");
	}

	@PreDestroy
	private void destroy() {
		System.out.println("Tennis Coach: inside destroy method");
	}

}
