package com.joysistvi.day17;


import com.joysistvi.day17.Scope;

public class main {

    public static void main(String[] args) {
        Scope obj = new Scope();
        obj.a();

        System.out.println(Scope.name);

        Scope.greet();
    }
}