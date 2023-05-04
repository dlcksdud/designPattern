package com.book.starbazz.condement;

import com.book.starbazz.Beverage;
import com.book.starbazz.CondimentDecorator;

// 모카는 데코레이터이기 때문에 CondimentDecorator 확장
public class Mocha extends CondimentDecorator {


    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}