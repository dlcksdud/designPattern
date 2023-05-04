package com.book.starbazz.drink;

import com.book.starbazz.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        String description = "디카페인";
    }

    public double cost() {
        return 1.05;
    }
}