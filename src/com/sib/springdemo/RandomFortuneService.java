package com.sib.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by HP on 8/22/2017.
 */
@Component
public class RandomFortuneService implements IFortuneService {

    // create an array of strings
    private String[] data = {
            "Beware of the wolf",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    // create a random number generator
    private Random rand = new Random();

    @Override
    public String getDailyFortune() {
        // pick a random string from the array
        int index = rand.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
