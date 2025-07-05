package com.lukacode.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class MarioGame implements Game {

    @Override
    public void up(){
        System.out.println(this.getClass().getSimpleName()+" up");
    }

    @Override
    public void down(){
        System.out.println(this.getClass().getSimpleName()+" down");
    }

    @Override
    public void left(){
        System.out.println(this.getClass().getSimpleName()+" left");
    }

    @Override
    public void right(){
        System.out.println(this.getClass().getSimpleName()+" right");
    }

}
