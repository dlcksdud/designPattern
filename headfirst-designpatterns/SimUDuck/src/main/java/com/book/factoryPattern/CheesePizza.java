package com.book.factoryPattern;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    /**
     * 피자 원재료를 제공하는 팩토리
     * 각피자 클래스는 생성자로부터 팩토리를 전달받고 그 팩토리를 인스턴스 변수에 저장한다.
     * @param ingredientFactory
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("준비 중 : " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

    }
}
