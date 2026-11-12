package com.joysistvi.day24.interface_;
/*
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bantay", 2, "Aspin");
        Cat cat = new Cat("Muning", 1, "White");

        System.out.println("=== Dog ===");
        System.out.println(dog);
        dog.makeSound();
        dog.eat();
        dog.play();
        dog.showAffection();
        dog.swim();

        System.out.println("\n=== Cat ===");
        System.out.println(cat);
        cat.makeSound();
        cat.eat();
        cat.play();
        cat.showAffection();
        //cat.swim();

        // interface reference, just like parent reference in polymorphism
        System.out.println("\n=== Interface references ===");
        testPet(dog);
        testPet(cat);

        System.out.println("=== Swimmer reference ===");
        Swimmer swimmer = dog;
        swimmer.swim();
        // Swimmer swimmer2 = cat; // compile error: Cat is not a Swimmer
        // swimmer.eat();          // compile error: Swimmer only knows swim()
    }

    // accepts any Pet, so it accepts both Dog and Cat
    public static void testPet(Pet pet) {
        System.out.println("Testing a pet:");
        pet.play();
        pet.showAffection();
        System.out.println();



    }
}

/*
 * TAKEAWAY
 * Interface: a contract. Every class that implements it MUST write the methods.
 * A class can extend only ONE class, but can implement MANY interfaces.
 * Abstract class = what the object IS. Interface = what the object CAN DO.
 */
