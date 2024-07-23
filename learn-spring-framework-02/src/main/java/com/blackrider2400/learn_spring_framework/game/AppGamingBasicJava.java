package com.blackrider2400.learn_spring_framework.game;

import com.blackrider2400.learn_spring_framework.game.GameConsoleConfiguration;
import com.blackrider2400.learn_spring_framework.game.GameRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GameConsoleConfiguration.class);
        var gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();
    }
}
