package com.book.factoryPattern;

/**
 * 182p 숙제 : 아래 클래스 이용해서 ChicagoPizzaIngredientFactory 완성하기
 * ThickCrustDough
 * EggPlant
 * PlumTomatoSauce
 * MozzarellaCheese
 * SlicePepperoni
 * Spinach
 * FrozenClams
 * BlackOlives
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new EggPlant(), new Spinach(), new BlackOlives()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
