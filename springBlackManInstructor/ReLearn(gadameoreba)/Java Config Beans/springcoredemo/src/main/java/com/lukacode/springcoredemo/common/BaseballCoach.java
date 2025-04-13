package com.lukacode.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("Object created in "+this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Baseball coach daily workout";
    }
}
