package com.book.templateMethodPattern;

public class BeverageTestDrive {
    public static void main(String[] args) {

        // 홍차 객체는 생략
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n 커피준비 중...");
        coffeeHook.prepareRecipe();
    }
}
