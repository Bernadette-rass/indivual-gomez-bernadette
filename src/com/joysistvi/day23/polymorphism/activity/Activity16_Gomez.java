package com.joysistvi.day23.polymorphism.activity;

public class Activity16_Gomez {

    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.refill();
        System.out.println();
    }

    public static void main(String[] args) {
        // Part 3: all objects use a Pen reference
        Pen pen1 = new Pen("Fountain Pen", "Montblack", "Black", 36, 13);
        Pen pen2 = new Ballpen("Ballpoint Pen", "Parker", "Gray", 26, 15);
        Pen pen3 = new Marker("Marker", "Pentel", "Red", 35, 5, true);

        System.out.println("=== Calling methods on Pen references ===");

        System.out.println("--- Pen ---");
        pen1.write();
        pen1.refill();

        System.out.println("\n--- Ballpen ---");
        pen2.write();
        pen2.refill();

        System.out.println("\n--- Marker ---");
        pen3.write();
        pen3.refill();

        System.out.println("\n=== testPen() ===");
        testPen(pen1);
        testPen(pen2);
        testPen(pen3);

        // Part 4: overloading in action
        System.out.println("=== Overloading ===");
        pen3.write("Hello");
        pen3.write("Hello", 3);
    }
}
