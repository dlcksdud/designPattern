package com.book.simUDuck.duck;

import com.book.simUDuck.inteface.FlyBehavior;
import com.book.simUDuck.inteface.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜오리도 뜨죠.");
    }


    /**
     * 4일차 56p
     * 동적으로 행동 지정하기
     *
     * 아래 두 메소드를 호출하면 언제든지 오리의 행동을 바꿀 수 있다.
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void QuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
