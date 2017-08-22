package com.sib.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Default bean name - tennisCoach
// When spring finds this @Component annotation
// it automatically registers the bean in the
// Spring Container
@Component
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
}
