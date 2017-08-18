package com.sib.springdemo;

import org.springframework.stereotype.Component;

// Default bean it - tennisCoach
@Component
public class TennisCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
