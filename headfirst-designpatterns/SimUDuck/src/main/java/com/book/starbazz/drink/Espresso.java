package com.book.starbazz.drink;

import com.book.starbazz.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        String description = "에스프레소";
    }

    public double cost() {
        return 1.99;
    }
}
