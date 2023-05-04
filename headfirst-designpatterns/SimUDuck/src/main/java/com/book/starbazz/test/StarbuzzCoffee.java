package com.book.starbazz.test;

import com.book.starbazz.Beverage;
import com.book.starbazz.condement.Mocha;
import com.book.starbazz.condement.Soy;
import com.book.starbazz.condement.Whip;
import com.book.starbazz.drink.DarkRoast;
import com.book.starbazz.drink.Espresso;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        Beverage beverage3 = new DarkRoast();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }

}