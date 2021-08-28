package interface_demo.model;

import interface_demo.Animal;
import interface_demo.Edible;

public class tiger extends Animal implements Edible {
    @Override
    public void sound() {
        System.out.println("Tiger: RROOAARR");
    }

    @Override
    public void howToEat() {

    }
}
