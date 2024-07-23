package com.blackrider2400.learn_spring_framework.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements Game {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Crouch");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shoot");
    }
}
