package com.ieb.designpatterns.abstractfacory;

public class GourmetPizzaFactoryTest {

    public static void main(String[] args) {

        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
        //cheesePizza.bakePizza();
        //veggiePizza.bakePizza();
    }
}
