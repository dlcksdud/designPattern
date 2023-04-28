package com.book.simUDuck.behavior;

import com.book.simUDuck.inteface.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥!");
    }
}
