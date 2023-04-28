package com.book.simUDuck.duck;

import com.book.simUDuck.behavior.fly.FlyWithWings;
import com.book.simUDuck.behavior.sound.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        /**
         * MallardDuck은 Duck 클래스에서 quackBehavior와 flyBehavior 인스턴스 변수를 상속받는다는 사실!
         *
         * MallardDuck이 꽥꽥 거리는 행동을 처리할 때는 Quack 클래스를 사용하므로
         * performQuack()이 호출되면 꽥꽥 거리는 행동은 Quack 객체에게 위임됩니다.
         * 결과적으로 진짜 꽥꽥 소리를 들을 수 있다.
         *
         */
        quackBehavior = new Quack();

        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
