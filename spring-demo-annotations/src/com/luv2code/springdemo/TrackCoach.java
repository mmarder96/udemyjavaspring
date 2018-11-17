package com.luv2code.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@Component
public class TrackCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

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
	
	// email and team getters and setters
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}


}
