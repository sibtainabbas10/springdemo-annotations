package com.sib.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by HP on 8/18/2017.
 */
@Component
public class FootballCoach implements ICoach {
    @Override
    public String getDailyWorkout() {
        return "Practice dribbling for 20 minutes";
    }
}
