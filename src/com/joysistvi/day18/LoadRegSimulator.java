package com.joysistvi.day18;
import java.util.Scanner;

public class LoadRegSimulator {
    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3, 4, 5};

            //System.out.println(numbers[6]);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Hello");
    }
}
/* // ArrayIndexOutOfBoundsException
    try {
            int[] numbers = {1, 2, 3, 4, 5};

            //System.out.println(numbers[6]);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Hello");
 */

/*
    // NumberFormatException

        Scanner sc = new Scanner(System.in);

        try {
            String input = sc.nextLine();
            double choice = Double.parseDouble(input);
            System.out.println(choice);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Hello");
 */