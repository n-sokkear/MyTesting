package interface_demo.model;

import interface_demo.Fruit;

public class Apple extends Fruit {
    @Override
    public void howToEat() {
        System.out.println("Appl: Apple juice.");
    }
}
