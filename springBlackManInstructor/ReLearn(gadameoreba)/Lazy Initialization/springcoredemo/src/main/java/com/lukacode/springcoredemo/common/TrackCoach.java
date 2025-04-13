package com.lukacode.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy /* if we want to enable lazy initialization globally, we need to make it true in application.properties
with this command: spring.main.lazy-initialization=true
*/
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("Object created in "+this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Track coach daily workout!";
    }
}
