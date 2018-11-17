package com.luv2code.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create random number generator
	Random rand = new Random();
	
	// create array of fortunes
	String[] fortunes = { 
		"Today is your lucky day!",
		"A beautiful, smart, and loving person will be coming into your life.",
		"A dubious friend may be an enemy in camouflage.", "A faithful friend is a strong defense.",
		"A feather in the hand is better than a bird in the air.", "A fresh start will put you on your way.",
		"A friend asks only for your time not your money.",
		"A gambler not only will lose what he has, but also will lose what he doesn’t have."
	};

	@Override
	public String getFortune() {
		// return random fortune
		int randIdx = rand.nextInt(fortunes.length);
		return fortunes[randIdx];
	}

}
