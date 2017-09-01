package com.sib.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 8/18/2017.
 */
public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // read the spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // retreive the bean from the spring container
        ICoach theCoach = context.getBean("tennisCoach", ICoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}

