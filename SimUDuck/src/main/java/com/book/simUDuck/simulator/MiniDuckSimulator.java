package com.book.simUDuck.simulator;

import com.book.simUDuck.duck.Duck;
import com.book.simUDuck.duck.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // MallardDuck에서 상속받은 performQuack() 메소드가 호출된다.
        // 이 메소드에서는 객체의 QuackBehavior 에게 할일을 위임하죠.
        // (즉, quckBehavior 레퍼런스의 quack() 메소드가 호출됩니다.)
        mallard.performQuack();

        mallard.performFly();
    }

}
