package com.joysistvi.day5.operator;

public class Activity3_Gomez {
    public static void main(String[] args){


            // Task 2: Event Entry Check
            int age = 21;
            boolean hasValidID = true;

            boolean allowedToEnter = age >= 18 && hasValidID;

            System.out.println("--- Task 2: Event Entry Check ---");
            System.out.println("Allowed to enter the event: " + (allowedToEnter ? "Yes" : "No"));


            // Task 3: Class Status Check
            boolean isWeekend = true;
            boolean isHoliday = false;

            boolean noClasses = isWeekend || isHoliday;

            System.out.println("\n--- Task 3: Class Status Check ---");
            System.out.println("Are there no classes today? " + (noClasses ? "Yes, no classes." : "No, there are classes."));


            // Task 4: Pass or Fail Check
            int score = 85;

            String result = score >= 75 ? "Passed" : "Failed";

            System.out.println("\n--- Task 4: Pass or Fail Check ---");
            System.out.println("Score: " + score);
            System.out.println("Result: " + result);


            // Task 5: Larger Number Check
            int num = 10;
            int num2 = 25;

            int largerNumber = num > num2 ? num : num2;

            System.out.println("\n--- Task 5: Larger Number Check ---");
            System.out.println("Number 1: " + num + ", Number 2: " + num2);
            System.out.println("The larger number is: " + largerNumber);

    }
}
