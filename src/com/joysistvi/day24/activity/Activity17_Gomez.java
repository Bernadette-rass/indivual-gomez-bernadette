package com.joysistvi.day24.activity;

public class Activity17_Gomez {
    public static void testPen(Pen pen) {
        System.out.println(pen);
        pen.write();
        pen.store();
        System.out.println();
    }

    public static void testRefillable(Refillable refillable) {
        refillable.refill();
        System.out.println("Maximum refills: " + Refillable.MAX_REFILLS);
        System.out.println();
    }

    public static void testClickable(Clickable clickable) {
        clickable.click();
    }

    public static void main(String[] args) {

        Ballpen ballpen = new Ballpen("Ballpoint Pen", "Parker", "Gray", 26, 15);
        Marker marker = new Marker("Marker", "Pentel", "Red", 35, 5, true);

        System.out.println("=== testPen() ===");
        testPen(ballpen);
        testPen(marker);

        System.out.println("=== testRefillable() ===");
        testRefillable(ballpen);
        testRefillable(marker);

        System.out.println("=== testClickable() ===");
        testClickable(ballpen);

    }
}
