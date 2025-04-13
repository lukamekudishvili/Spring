package com.lukacode.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Object created in " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis coach daily workout";
    }

}
