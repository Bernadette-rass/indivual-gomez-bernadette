package com.joysistvi.day13.string;

import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
        // Login Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("--LOGIN--");
        int retries = 0;
        while(retries < 5) {
            String correctUsername = "admin";
            String correctPassword = "admin123";

            System.out.println("\nEnter your Username: ");
            String username = scanner.nextLine();

            System.out.println("Enter your Password: ");
            String password = scanner.nextLine();

            //Validation
            if (username.isEmpty() || password.isEmpty()){
                System.out.println("Username and Password cannot be empty.");
            }

            // Authentication
            else if (username.equals(correctUsername) && password.equals(correctPassword)){
                System.out.println("Login Successfully!");
                System.out.println("Welcome, " + username + "!");
                break;
            } else {
                System.out.println("Invalid Username or Password.");
                System.out.println("Access Denied.\n");
                retries++;
            }

        }

        if (retries == 5)
            System.out.println("Too many failed attempts.");
            System.out.println("Maximum Reached!");
        // 5 retries

        scanner.close();
    }
}

/*

     // Exit Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure that you want to exit the program?");
        System.out.println("[Y] yes - Exit Program");
        System.out.println("[N] no - Return to Main Menu");

        System.out.println("\n Enter your choice: ");
        String choice = String.valueOf(scanner.nextLine().charAt(0));

        if (choice.equalsIgnoreCase("Y")){
            System.out.println("Exiting....");
        } else {
            System.out.println("Returning Back to Main Menu");
        }

    charAt()

    String word = "Hello"; //String Literal

    System.out.println(word.charAt());


     String middleName = "Amlane"; //String Literal

     char middleInitial = middleName.charAt(0);
     System.out.println(middleInitial);


    Length()

    String word = "Hello"; //String Literal

    System.out.println(word.length());


    toUpperCase() toLowerCase()

    String word = "Hello"; //String Literal

    System.out.println(word.toUpperCase());



*/
