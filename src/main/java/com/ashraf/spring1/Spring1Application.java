package com.ashraf.spring1;

import com.ashraf.spring1.game.GameRunner;
import com.ashraf.spring1.game.GamingConsole;
import com.ashraf.spring1.game.MarioGame;
import com.ashraf.spring1.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {

		// Application context is an implementation of Spring Container
		ConfigurableApplicationContext appContext
				= SpringApplication.run(Spring1Application.class, args);

//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();

//		GamingConsole game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);
		GameRunner runner = appContext.getBean(GameRunner.class);
		runner.run();
	}

}
