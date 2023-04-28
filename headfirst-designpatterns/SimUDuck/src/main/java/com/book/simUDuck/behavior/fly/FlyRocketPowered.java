package com.book.simUDuck.behavior.fly;

import com.book.simUDuck.inteface.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    // 로켓추진으로 나는 행동을 나타내는 클래스.
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다~");
    }
}
