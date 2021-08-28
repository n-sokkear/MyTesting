package interface_demo.model;

import interface_demo.Animal;
import interface_demo.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public void sound() {
        System.out.println("cock-a-dooodle-doo");
    }

    @Override
    public void howToEat() {

    }
}
