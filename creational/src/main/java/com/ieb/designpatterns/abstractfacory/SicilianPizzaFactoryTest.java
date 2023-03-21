package com.ieb.designpatterns.abstractfacory;

public class SicilianPizzaFactoryTest {
    public static void main(String[] args) {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
    }
}
