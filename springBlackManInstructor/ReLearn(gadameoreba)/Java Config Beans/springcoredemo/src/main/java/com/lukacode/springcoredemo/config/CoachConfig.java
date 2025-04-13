package com.lukacode.springcoredemo.config;

import com.lukacode.springcoredemo.common.Coach;
import com.lukacode.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {

    @Bean
    //or custom bean id
    //@Bean("specialSwimCoach")
    public SwimCoach swimCoach(){
        return new SwimCoach();
    }
}
