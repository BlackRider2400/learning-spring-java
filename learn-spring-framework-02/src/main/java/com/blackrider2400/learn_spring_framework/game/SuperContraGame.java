package com.blackrider2400.learn_spring_framework.game;

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