package com.sib.springdemo;

/**
 * Created by C_v on 9/1/2017.
 */
public class LuckyFortuneService implements IFortuneService {
    @Override
    public String getDailyFortune() {
        return "Today is a lucky day!";
    }
}
