package com.lukacode.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    private Game game;


    @Autowired
    public GameRunner(@Qualifier(value = "pacmanGame") Game game){
        this.game=game;
    }

    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }


}