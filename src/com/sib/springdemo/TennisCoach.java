package com.sib.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// Default bean name - tennisCoach
// When spring finds this @Component annotation
// it automatically registers the bean in the
// Spring Container
@Component
// Define bean scope (singleton, prototype)
//@Scope("prototype")
public class TennisCoach implements ICoach {

    // Field Injection
    @Autowired
    @Qualifier("randomFileFortuneService")
    private IFortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }

/*
    // Constructor injection
    @Autowired
    public TennisCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
*/

/*
    @Autowired
    // Constructor injection - dependency has multiple implementations
    public TennisCoach(@Qualifier("randomFortuneService") IFortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");

        fortuneService = theFortuneService;
    }
*/

/*
    // Setter injection
    @Autowired
    public void doSomeCrazyStuff(IFortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        this.fortuneService = fortuneService;
    }
*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    // define my init method
    // Code will execute after constructor and
    // injection of dependencies
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    // Code will execute before bean is destroyed
    // NOTE: For "prototype" scoped beans, Spring does not call the @PreDestroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }

}
