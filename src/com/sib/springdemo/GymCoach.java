package com.sib.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.xml.ws.soap.Addressing;

/**
 * Created by C_v on 9/1/2017.
 */
public class GymCoach implements ICoach {

    @Autowired
    @Qualifier("luckyFortuneService")
    private IFortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Do weight training for 45 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
