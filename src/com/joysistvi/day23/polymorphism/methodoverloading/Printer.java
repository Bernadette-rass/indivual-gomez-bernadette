package com.joysistvi.day23.polymorphism.methodoverloading;

public class Printer {
    public static void main(String[] args) {


        User user = new User("Xie", "xie@gmail.com", "xie123");
        User user2 = new User("Xie", "Hua", "Go", "xie@gmail.com", "xie123");
        User user3 = new User("Xie", "Hua", "Go", "xie@gmail.com", "xie123", "Quezon City");
        User user4 = new User("Xie", "Hua", "Go", "xie@gmail.com", "xie123",  1234566);
        User user5 = new User();
    }
}
