package com.book.simUDuck.behavior;


import com.book.simUDuck.inteface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    // 실제로 날 수 있는 오리들의 나는 행동을 구현한 클래스
    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
