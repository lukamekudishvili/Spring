package com.lukacode.learn_spring_framework;

import com.lukacode.learn_spring_framework.game.Game;
import com.lukacode.learn_spring_framework.game.GameRunner;
import com.lukacode.learn_spring_framework.game.MarioGame;
import com.lukacode.learn_spring_framework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		var context= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner game=context.getBean("gameRunner",GameRunner.class);
		game.run();

//		MarioGame game= new MarioGame();
//		GameRunner runner= new GameRunner(game);
//		runner.run();
//
//		System.out.println("-".repeat(30));
//		Game game1= new SuperContraGame();
//		GameRunner runner1=new GameRunner(game1);
//		runner1.run();

	}

}
