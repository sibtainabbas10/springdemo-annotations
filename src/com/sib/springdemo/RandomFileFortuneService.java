package com.sib.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by HP on 8/22/2017.
 */
@Component
public class RandomFileFortuneService implements IFortuneService {

    @Value("${fortunes}")
    private String fortunesString;

    private String[] fortunesArray;

    private Random rand = new Random();;

    @Override
    public String getDailyFortune() {
        fortunesArray = fortunesString.split(",");
        int index = rand.nextInt(fortunesArray.length);
        return fortunesArray[index];
    }
}
