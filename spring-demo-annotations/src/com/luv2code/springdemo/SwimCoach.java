package com.luv2code.springdemo;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public SwimCoach(FortuneService myFortuneService) {
        fortuneService = myFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
