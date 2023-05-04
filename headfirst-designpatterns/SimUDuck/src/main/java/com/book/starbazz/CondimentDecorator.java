package com.book.starbazz;


public abstract class CondimentDecorator extends Beverage {
    // 각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체를 여기에서 지정.
    // 음료를 지정할 때는 데코레이터에서 어떤 음료든 감쌀 수 있도록 Beverage 슈퍼클래스 유형 사용

    public Beverage beverage;
    public abstract String getDescription();
}