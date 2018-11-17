package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// check if they are the same object
		boolean result = (myCoach == alphaCoach);

		// print results
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("Memory location for myCoach: " + myCoach);
		System.out.println("Memory location for myCoach: " + alphaCoach + "\n");
		
		// close the context
		context.close();
	}

}
