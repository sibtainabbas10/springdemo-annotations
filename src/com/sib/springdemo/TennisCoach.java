package com.sib.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Default bean name - tennisCoach
// When spring finds this @Component annotation
// it automatically registers the bean in the
// Spring Container
@Component
public class TennisCoach implements ICoach {
    private IFortuneService fortuneService;

    @Autowired
    public TennisCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
