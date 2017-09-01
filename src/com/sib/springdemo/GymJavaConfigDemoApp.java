package com.sib.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by HP on 8/18/2017.
 */
public class GymJavaConfigDemoApp {
    public static void main(String[] args) {
        // read the spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfigPractice.class);

        // retreive the bean from the spring container
        ICoach theCoach = context.getBean("gymCoach", ICoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}

