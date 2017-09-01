package com.sib.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by C_v on 9/1/2017.
 */
@Configuration
public class SportConfigPractice {

    @Bean
    public IFortuneService luckyFortuneService() {
        return new LuckyFortuneService();
    }

    @Bean
    public ICoach gymCoach() {
        return new GymCoach();
    }
}
