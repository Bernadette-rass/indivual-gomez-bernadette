package com.joysistvi.day17;

public class Scope {

    static String name = "Xie"; // static variable // class variable
    int age = 60;  // instance variable

    public static void main(String[] args) {
        int num = 0; // local variable

        Scope obj = new Scope();
        System.out.println(obj.age);
        System.out.println(name);
    }

    public static void greet() {
        System.out.println(name);

        Scope obj = new Scope();
        System.out.println(obj.age);
    }

    public static void scope() {
        // block scope

        while (true) {
            int count = 0;
        }
    }

    // static method
    public static int sum(int a, int b) {
        return a + b;
    }

    // instance method
    public int product(int a, int b) {
        return a + b;

    }

    int num = 0;

    public void a() {

    }

    public void b() {
        System.out.println(num);
        a();
    }




    // Easy Memory Trick
    /*
        static to static - direct
        static to instance - direct
        instance to static - instantiate
        instance to instance - direct
     */

    // static -> belongs to the class
    // instance -> belongs to the instance/object
}