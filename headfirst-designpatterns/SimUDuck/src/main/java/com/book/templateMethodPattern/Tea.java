package com.book.templateMethodPattern;

public class Tea extends CaffeinBeverage {
//    void prepareRecipe() {
//        boilWater();
//        steepTeaBag();
//        pourInCup();
//        addLemon();
//    }

    @Override
    public void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }

    // 커피 클래스 메소드와 중복됨
    public void boilWater() {
        System.out.println("물 끓이는 중");
    }
    public void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    // 홍차 전용 메소드
    public void steepTeaBag() {
        System.out.println("찻잎을 우려내는 중");
    }

    public void addLemon() {
        System.out.println("레몬을 추가하는 중");
    }

}
