package com.joysistvi.day14.math;

import java.util.Scanner;

public class Activity11_Gomez {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            // RESEARCH PHASE
            System.out.println("=== Research Phase ===");

            // 1. Math.abs()
            System.out.println("Absolute Value: " + Math.abs(78));

            // 2. Math.max()
            System.out.println("Maximum: " + Math.max(10, 7));

            // 3. Math.min()
            System.out.println("Minimum: " + Math.min(10, 7));

            // 4. Math.pow()
            System.out.println("Power: " + Math.pow(4, 2));

            // 5. Math.sqrt()
            System.out.println("Square Root: " + Math.sqrt(50));

            // 6. Math.round()
            System.out.println("Round: " + Math.round(2.5));

            // 7. Math.ceil()
            System.out.println("Ceiling: " + Math.ceil(3.2));

            // 8. Math.floor()
            System.out.println("Floor: " + Math.floor(5.9));

            // 9. Math.random()
            System.out.println("Random: " + Math.random());

            // 10. Math.log()
            System.out.println("Natural Log: " + Math.log(5));

            // 11. Math.log10()
            System.out.println("Log Base 10: " + Math.log10(100));

            // 12. Math.exp()
            System.out.println("Exponential: " + Math.exp(2));

            // 13. Math.sin()
            System.out.println("Sine: " + Math.sin(Math.toRadians(20)));

            // 14. Math.cos()
            System.out.println("Cosine: " + Math.cos(Math.toRadians(30)));

            // 15. Math.tan()
            System.out.println("Tangent: " + Math.tan(Math.toRadians(35)));

            System.out.print("\nEnter a number: ");
            int number = input.nextInt();

            System.out.println("\nOriginal number: " + number);
            System.out.println("Absolute Value: " + Math.abs(number));

            input.close();
        }

}
