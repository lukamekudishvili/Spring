package com.lukacode.learn_spring_framework.game;

public class SuperContraGame implements  Game{

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
