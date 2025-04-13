package com.lukacode.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("Object created in "+this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Tennis coach daily workout";
    }

    @PostConstruct
    public void getReadyStuff(){
        System.out.println(
                "some stuff is getting ready, after bean creation, PostConstruct "+this.getClass().getSimpleName());
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("destroy stuff, PreDestroy: "+this.getClass().getSimpleName());
    }
}
