package com.book.simUDuck.behavior;

import com.book.simUDuck.inteface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용 ~ >>");
    }
}
