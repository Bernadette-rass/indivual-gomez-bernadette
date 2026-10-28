package com.joysistvi.day12.multidarray;

import java.util.Scanner;

public class Activity12_Gomez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("          Average Calculator");
        System.out.println("======================================");

        // Ask for number of students and subjects
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();

        input.nextLine(); // clear newline

        // Store subject names
        String[] subjectNames = new String[subjects];

        System.out.println();
        System.out.println("Enter subject names:");

        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        // Store student names and grades
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];

        // Input student information
        for (int i = 0; i < students; i++) {

            System.out.println();
            System.out.print("Name of Student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();

            System.out.println("Enter grades for each subject:");

            for (int j = 0; j < subjects; j++) {
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = input.nextDouble();
            }

            input.nextLine(); // clear newline
        }

        // Display Grades Report
        System.out.println();
        System.out.println("======================================");
        System.out.println("             Grades Report");
        System.out.println("======================================");

        // Header
        System.out.printf("%-20s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-12s", subjectNames[i]);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("----------------------------------------------");

        // Display students, grades, and average
        for (int i = 0; i < students; i++) {

            double total = 0;

            System.out.printf("%-20s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-12.0f", grades[i][j]);
                total += grades[i][j];
            }

            double average = total / subjects;

            System.out.printf("%-10.2f%n", average);
        }

        input.close();
    }
}
