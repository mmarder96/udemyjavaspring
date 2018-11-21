package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimCoachJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyLoggerJavaConfig.class, SportConfig.class);

        // get the bean from the spring container
        SwimCoach myCoach = context.getBean("swimCoach", SwimCoach.class);

        // call methods on the bean
        System.out.println(myCoach.getDailyWorkout());
        System.out.println(myCoach.getDailyFortune());
        System.out.println("email: " + myCoach.getEmail());
        System.out.println("team: " + myCoach.getTeam());

        // close the context
        context.close();

    }

}
