package com.book.simUDuck.simulator;

import com.book.simUDuck.behavior.fly.FlyRocketPowered;
import com.book.simUDuck.duck.Duck;
import com.book.simUDuck.duck.MallardDuck;
import com.book.simUDuck.duck.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // MallardDuck에서 상속받은 performQuack() 메소드가 호출된다.
        // 이 메소드에서는 객체의 QuackBehavior 에게 할일을 위임하죠.
        // (즉, quckBehavior 레퍼런스의 quack() 메소드가 호출됩니다.)
        mallard.performQuack();
        mallard.performFly();

        //////////////////////////////////////////////////////////////

        //
        /**
         * 4일차 - 동적으로 행동 지정하기
         * 실행 중에 오리의 행동을 바꾸고 싶으면 원하는 행동에 해당하는
         * Duck의 세터 메소드를 호출합니다.
         */
        Duck model = new ModelDuck();
        /**
         * performFly()를 처음 호출하면 ModelDuck 생성자에서 설정되었던 flyBehavior,
         * 즉, FlyNoWay 인스턴스의 fly() 메소드가 호출됩니다.
         */
        model.performFly();

        /**
         * 이러면 상속받은 행동 setter 메소드가 호출.
         * 이제 모형오리에 로켓 추진으로 날 수 있는 능력이 생김.
         */
        model.setFlyBehavior(new FlyRocketPowered());

        /**
         * 제대로 돌아간다면 모형 오리는 동적으로 나는 행동을 바꿀 수 있다.
         * 구현 코드가 Duck 클래스 안에 들어있었다면 그렇게 할 수 없었다.
         */
        model.performFly();


    }

}
