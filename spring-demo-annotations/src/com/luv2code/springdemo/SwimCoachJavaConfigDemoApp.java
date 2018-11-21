package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimCoachJavaConfigDemoApp {
	
	public static void main(String[] args) {
		
		// read spring config class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		Coach myCoach = context.getBean("swimCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
