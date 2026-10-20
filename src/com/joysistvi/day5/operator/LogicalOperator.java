package com.joysistvi.day5.operator;

public class LogicalOperator {
    public static void main(String[] args) {
        int age = 19;

        boolean isValidAge = age <= 18;
        //System.out.println(isValidAge);

        int num = 10;
        int num2 = 20;

        //                      F           T
        System.out.println(num < num2 && num > num2);
        //                      F           T
        System.out.println(num > num2 || num < num2);
    }
}
