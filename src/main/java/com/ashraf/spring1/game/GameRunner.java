package com.ashraf.spring1.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private GamingConsole game;


    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
