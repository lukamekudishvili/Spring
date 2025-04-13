package com.lukacode.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Object created in "+this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Cricket coach daily workout";
    }
}
