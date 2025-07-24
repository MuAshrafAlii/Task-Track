package com.ashraf.spring1;

import com.ashraf.spring1.game.GameRunner;
import com.ashraf.spring1.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {

//		SpringApplication.run(Spring1Application.class, args);

		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
