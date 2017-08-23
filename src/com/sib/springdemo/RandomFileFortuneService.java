package com.sib.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

/**
 * Created by HP on 8/22/2017.
 */
@Component
public class RandomFileFortuneService implements IFortuneService {

    @Value("${fortunes}")
    private String fortunesString;

    private String[] fortunesArray;

    private Random rand;

    @Override
    public String getDailyFortune() {
        int index = rand.nextInt(fortunesArray.length);
        return fortunesArray[index];
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">> RandomFileFortuneService: inside of doMyStartupStuff()");
        rand = new Random();
        fortunesArray = fortunesString.split(",");
    }
}
