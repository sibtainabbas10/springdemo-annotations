package com.sib.springdemo;

/**
 * Created by C_v on 9/1/2017.
 */
public class SadFortuneService implements IFortuneService {
    @Override
    public String getDailyFortune() {
        return "It's sad day for you :(";
    }
}
