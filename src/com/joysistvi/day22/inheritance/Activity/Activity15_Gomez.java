package com.joysistvi.day22.inheritance.Activity;

public class Activity15_Gomez {
    public static void main(String[] args) {
        Pen pen = new Pen("Fountain Pen", "Montblack", "Black", 36, 13);
        Ballpen ballpen = new Ballpen("Ballpoint Pen", "Parker", "Gray", 26, 15);

        System.out.println("===Pen===");
        System.out.println(pen);
        pen.write();

        System.out.println("\n===Ballpen===");
        System.out.println(ballpen);
        ballpen.writing();


    }
}
