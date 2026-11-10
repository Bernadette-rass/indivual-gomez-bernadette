package com.joysistvi.day22.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animals" , 3);
        Cat cat = new Cat("Mickey", 11, " Calico");
        Dog dog = new Dog("Milo", 3, " Aspin");

        System.out.println("===Animal===");
        System.out.println(animal);
        animal.makeSound();

        System.out.println("\n===Dog===");
        System.out.println(dog);
        dog.eat(); //inherited
        dog.makeSound(); //overriden in dog
        dog.fetch(); // only Dog has this

        System.out.println("\n===Cat===");
        System.out.println(cat);
        cat.eat(); // inherited
        cat.makeSound(); //overriden in cat
        cat.scratch(); // only Cat has this
    }
}
