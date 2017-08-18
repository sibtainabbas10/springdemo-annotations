package com.sib.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 8/18/2017.
 */
public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retreive the bean from the spring container
        ICoach theCoach = context.getBean("footballCoach", ICoach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}

