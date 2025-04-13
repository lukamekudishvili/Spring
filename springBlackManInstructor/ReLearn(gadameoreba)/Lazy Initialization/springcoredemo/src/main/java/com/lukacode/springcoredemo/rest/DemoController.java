package com.lukacode.springcoredemo.rest;

import com.lukacode.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    private Coach coach;

    @Autowired
    public DemoController(@Qualifier("tennisCoach")Coach coach) {
        System.out.println("Object created in "+this.getClass().getSimpleName());
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    private String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}