package com.book.starbazz.condement;

import com.book.starbazz.Beverage;
import com.book.starbazz.CondimentDecorator;

public class Whip extends CondimentDecorator {


    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}