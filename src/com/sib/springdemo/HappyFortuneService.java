package com.sib.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by HP on 8/21/2017.
 */
// Register the bean in the spring container
@Component
public class HappyFortuneService implements IFortuneService {
    @Override
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
