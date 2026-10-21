package com.joysistvi.day6.IfStatement;

public class IfElseLadder {
    public static void main(String[] args) {
        // This program evaluates a student's grade
        /*
            F: 1-60
            C: 70-80
            B: 81-90
            A: 91-100
         */
        
        int grade = 92;
        String result;
        
        if ( grade >= 1 && grade <= 70) {
            result = "F";
        } else if (grade >= 71 && grade <= 80){
            result = "C";
        } else if (grade >= 81 && grade <= 90){
            result = "B";
        } else {
            result = "A";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Classification: " + result);

    }
}
/* int day = -1;
        String result;

        if (day == 1){
            result = "Sunday";
        } else if (day == 2) {
            result = "Monday";
        } else if (day == 3) {
            result = "Tuesday";
        } else if (day == 4) {
            result = "Wednesday";
        } else if (day == 5) {
            result = "Thursday";
        } else if (day == 6) {
            result = "Friday";
        } else if (day == 7) {
            result = "Saturday";
        } else {
           result = "Invalid Day";
        }

        System.out.println(result);
*/
