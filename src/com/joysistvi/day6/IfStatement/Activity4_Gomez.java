package com.joysistvi.day6.IfStatement;

public class Activity4_Gomez {
    public static void main(String[] args) {
        int age = 25;
        String category;

        if ( age >= 0 && age <= 2) {
            category = "Baby";
        } else if (age >= 3 && age <= 12){
            category = "Child";
        } else if (age >= 13 && age <= 19){
            category = "Teenager";
        } else if (age >= 20 && age <= 29){
            category = "Young Adult";
        } else if (age >= 30 && age <= 59){
            category = "Adult";
        } else {
            category = "Senior";
        }

        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
    }
}
