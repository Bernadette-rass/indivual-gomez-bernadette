package com.joysistvi.day17;

public class ReturnKeywordExample {
    // method that concatenates string
    public static void main(String[] args) {
        String fullName = createFullName("Bernadette", "Gomez");
        System.out.println("Full Name: " + fullName);
        System.out.println(createGreeting("Xie"));
    }

    public static String createGreeting(String name) {
        return "Hello, " + name + " Welcome to Java!";
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
