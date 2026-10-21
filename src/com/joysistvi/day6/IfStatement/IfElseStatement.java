package com.joysistvi.day6.IfStatement;

public class IfElseStatement {
    public static void main(String[] args) {
        // Program that identifies if age is Valid or Invalid
        int age = 10;

        //String result = (age >= 18) ? "Valid Age" : "Invalid Age";
        //System.out.println(result);

        String result = "";

        if (age >= 18){
            // Executes when age is 18 or older
            result = "Valid Age";
        } else{
            result = "Invalid Age";
        }
        System.out.println(result);
    }
}
