package com.sib.springdemo;

import com.sun.org.apache.bcel.internal.generic.ICONST;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HP on 8/22/2017.
 */
public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from the spring container
        ICoach theCoach = context.getBean("tennisCoach", ICoach.class);

        ICoach alphaCoach = context.getBean("tennisCoach", ICoach.class);

        // check if they are the same
        Boolean result = (theCoach == alphaCoach);

        // print the results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        // close the context
        context.close();
    }
}
