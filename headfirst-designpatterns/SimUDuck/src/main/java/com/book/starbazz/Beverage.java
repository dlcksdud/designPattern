package com.book.starbazz;

// Beverage는 추상클래스
// getDescription, cost 2개의 메소드를 가졌다.
public abstract class Beverage {
    String description = "제목없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}