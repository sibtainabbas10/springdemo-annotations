package com.sib.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by HP on 8/18/2017.
 */
public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // read the spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // retreive the bean from the spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call our new SwimCoach methods.. has the props values injected
        System.out.println("Email: " + theCoach.getEmail());
        System.out.println("Team: " + theCoach.getTeam());

        // close the context
        context.close();
    }
}

