package com.lukacode.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Baseball coach daily workout";
    }
}
