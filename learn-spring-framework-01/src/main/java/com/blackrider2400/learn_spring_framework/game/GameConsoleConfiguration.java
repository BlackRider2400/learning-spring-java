package com.blackrider2400.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConsoleConfiguration {

    @Bean
    public GameRunner gameRunner(Game game) {
        return new GameRunner(game);
    }

    @Bean
    public Game game() {
        return new MarioGame();
    }
}
