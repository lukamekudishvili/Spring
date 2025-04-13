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
    private Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("tennisCoach")Coach coach,
            @Qualifier("tennisCoach") Coach anotherCoach) {
        System.out.println("Object created in "+this.getClass().getSimpleName());
        this.coach = coach;
        this.anotherCoach=anotherCoach;

    }

    @GetMapping("/dailyworkout")
    private String getDailyWorkout(){
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    private String doBeanCheck(){
        return "Comparing beans: coach == anotherCoach, "+(coach==anotherCoach);
    }
}