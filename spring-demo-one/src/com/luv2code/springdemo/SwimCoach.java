package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency injection
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 20 laps";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "Swim today because " + fortuneService.getFortune();
	}

	// add an init method
	public void startupStuff() {
		System.out.println(this.getClass().getSimpleName() + ": inside method startupStuff");
	}

	// add a destroy method
	public void cleanupStuff() {
		System.out.println(this.getClass().getSimpleName() + ": inside method cleanupStuff");
	}
}
