package com.book.factoryPattern;
//import com.book.factoryPattern.Pizza;

public abstract class PizzaStore {
    // 피자 객체 인스턴스를 만드는 일은 PizzaStore의
    // 서브 클래스에 있는 createPizza() 메소드에서 처리한다.
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type); // 팩토리 객체가 아닌 PizzaStore에 있는 craetePizza를 호출

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    // 팩토리 객체 대신 이 메소드를 사용
    // 이제 '팩토리 메소드(factory emthod)'가 PizzaStore의 추상 메소드로 바뀌었다.
    abstract Pizza createPizza(String type);
    // Pizza 인스턴스를 만드는 일은 이제 팩토리 메소드에서 알아서 처리한다.

}
