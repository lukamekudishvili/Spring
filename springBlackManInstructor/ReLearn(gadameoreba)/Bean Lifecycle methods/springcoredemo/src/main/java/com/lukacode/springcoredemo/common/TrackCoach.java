package com.lukacode.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("Object created in "+this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Track coach daily workout!";
    }
}
