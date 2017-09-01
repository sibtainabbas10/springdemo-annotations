package com.sib.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by HP on 8/23/2017.
 */
@Configuration
@PropertySource("classpath:sport.properties")
// If I comment out @ComponentScan it will only use
// the beans I defined below using @Bean
//@ComponentScan("com.sib.springdemo")
public class SportConfig {

    // Do this for Spring 4.2 and lower verisons
    // add support to resolve ${...} properties
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer
//    propertySourcesPlaceHolderConfigurer() {
//
//        return new PropertySourcesPlaceholderConfigurer();
//    }

    // define bean for SadFortuneService
    @Bean
    public IFortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for SwimCoach and inject dependency
    @Bean
    public ICoach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
