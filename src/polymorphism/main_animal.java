package polymorphism;

public class main_animal {
    public static void main(String[] args) {
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();
        Animal obj3 = new Pigs();
        Animal obj4 = new Birds();

        System.out.println(obj1.animalSound());
        System.out.println(obj2.animalSound());
        System.out.println(obj3.animalSound());
        System.out.println(obj4.animalSound());
    }
}
