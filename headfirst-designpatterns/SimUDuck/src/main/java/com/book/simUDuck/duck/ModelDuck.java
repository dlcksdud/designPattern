package com.book.simUDuck.duck;

import com.book.simUDuck.behavior.fly.FlyNoWay;
import com.book.simUDuck.behavior.sound.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        // 바닥에서 삶을 시작하는 날지 못하는 오리!
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
