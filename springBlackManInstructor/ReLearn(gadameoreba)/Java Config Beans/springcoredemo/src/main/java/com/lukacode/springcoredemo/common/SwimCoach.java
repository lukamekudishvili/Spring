package com.lukacode.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("Object created in: "+this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim coach daily workout";
    }
}
