package com.joysistvi.day13.string;

public class Activity13_Gomez {
    public static void main(String[] args) {

                String country = "Philippines";

                // Display first and last character
                char first = country.charAt(0);
                char last = country.charAt(10);

                System.out.println("\nCountry: " + country);
                System.out.println("\nFirst character: " + first);
                System.out.println("Last character: " + last);

                // Count P/p
                int pCount = 0;
                int vowelCount = 0;

                for (int i = 0; i < country.length(); i++) {
                    char letter = Character.toLowerCase(country.charAt(i));

                    if (letter == 'p') {
                        pCount++;
                    }

                    // Count vowels
                    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                        vowelCount++;
                    }
                }

                System.out.println("Number of P/p: " + pCount);
                System.out.println("Total vowels: " + vowelCount);

    }
}
