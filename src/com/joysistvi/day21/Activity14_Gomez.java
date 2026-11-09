package com.joysistvi.day21;

import com.joysistvi.day21.UserAccount;
import java.util.Scanner;

public class Activity14_Gomez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("------------------------------------");
        System.out.println("  *  Account Registration  *");
        System.out.println("------------------------------------");

        // First Name
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        // Middle Name
        System.out.print("Enter Middle Name: ");
        String middleName = input.nextLine();

        // Last Name
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        // Address
        System.out.print("Enter Address: ");
        String address = input.nextLine();

        // Email Validation
        String email = null;
        while (true) {
            try {
                System.out.print("Enter Email: ");
                email = input.nextLine();

                // Temporary validation using setter
                UserAccount temp = new UserAccount(firstName, middleName, lastName, address, email, "Secret123!");
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Password Validation
        String password = null;
        while (true) {
            try {
                System.out.print("Enter Password: ");
                password = input.nextLine();

                // Validate password
                if (password.length() < 8) {
                    throw new IllegalArgumentException(
                            "Password must be at least 8 characters.");
                }
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Create Account Using Constructor
        UserAccount user = new UserAccount(firstName, middleName, lastName, address, email, password);

        // Display Account Information
        System.out.println();
        System.out.println("--- User Account Created ---");
        System.out.println(user);

        input.close();
    }
}