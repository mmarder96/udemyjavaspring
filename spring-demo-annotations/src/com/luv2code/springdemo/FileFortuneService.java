package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class FileFortuneService implements FortuneService {
	
	// create random number generator
	Random rand = new Random();
	
	// create array of fortunes from fortune.properties file
	@Value("${fortune.array}")
	String[] fortunes;

	@Override
	public String getFortune() {
		// return random fortune
		int randIdx = rand.nextInt(fortunes.length);
		return fortunes[randIdx];
	}

}