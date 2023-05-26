package com.book.templateMethodPattern;

public abstract class CaffeinBeverage {

    /**
     * 커피와 차 만들 때 prepareRecipe() 메소드 사용.
     * - 서브클래스가 이 메소드를 아무렇게나 오버라이드하지 못하도록  final로 선언함.
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourIncup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
        addCondiments();
    }

    /**
     * Coffee와 Tea에서 이 두 메소드를 서로 다른 방식으로 처리함.
     * 서브클래스가 알아서 하도록 냅두자.
     */
    abstract void brew();
    abstract void addCondiments();
    
    void boilWater() {
        System.out.println("물 끓이는 중");
    }
    
    void pourIncup() {
        System.out.println("컵에 따르는 중");
    }


    /**
     *  별 내용 없는 기본 메소드 구현
     *  이 메소드는 서브클래스에서 필요할 때 오버라이드할 수 있는 메소드 -> hook!!
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
