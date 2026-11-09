package com.joysistvi.day20.encapsulation;

import java.util.Scanner;

public class Activity13_Gomez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserAcc user = new UserAcc();

        System.out.println("------------------------------------");
        System.out.println("  *  Account Registration  *");
        System.out.println("------------------------------------");

        // First Name
        System.out.print("Enter First Name: ");
        user.setFirstName(input.nextLine());

        // Middle Name
        System.out.print("Enter Middle Name: ");
        user.setMiddleName(input.nextLine());

        // Last Name
        System.out.print("Enter Last Name: ");
        user.setLastName(input.nextLine());

        // Address
        System.out.print("Enter Address: ");
        user.setAddress(input.nextLine());

        // Email Validation
        while (true) {
            try {
                System.out.print("Enter Email: ");
                user.setEmail(input.nextLine());
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Password Validation
        while (true) {
            try {
                System.out.print("Enter Password: ");
                user.setPassword(input.nextLine());
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Display Account Information
        System.out.println();
        System.out.println("--- User Account Created ---");

        System.out.println("Full Name: "
                + user.getFirstName() + " "
                + user.getMiddleName() + " "
                + user.getLastName());

        System.out.println("Address: " + user.getAddress());

        System.out.println("Email: " + user.getEmail());

        input.close();
    }
}
