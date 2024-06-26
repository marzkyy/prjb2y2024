/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * TASKS: Score to Grade F - A
 * Write a program that takes in the score of a student in a test and outputs their grade based on the following criteria:
 * A score of 90 or above gets an A grade
 * A score between 80 and 89 gets a B grade
 * A score between 70 and 79 gets a C grade
 * A score between 60 and 69 gets a D grade
 * A score below 60 gets an F grade
 */

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the student's score
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();
        
        char grade; // Variable to hold the grade
        
        // Determine the grade based on the score using a switch statement
        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A'; // Assign 'A' grade for scores 90-100
                break;
            case 8:
                grade = 'B'; // Assign 'B' grade for scores 80-89
                break;
            case 7:
                grade = 'C'; // Assign 'C' grade for scores 70-79
                break;
            case 6:
                grade = 'D'; // Assign 'D' grade for scores 60-69
                break;
            default:
                grade = 'F'; // Assign 'F' grade for scores below 60
                break;
        }
        
        // Output the student's grade to the console
        System.out.println("The student's grade is: " + grade);
        scanner.close();
    }
}