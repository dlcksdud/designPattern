package com.book.simUDuck.behavior.sound;

import com.book.simUDuck.inteface.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑!");
    }
}
