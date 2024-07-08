/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * TASKS: Number to month(1-12) and print number of days of that month
 * Write a program that prompts the user to enter a month number (1 for January, 2 for February, etc.)
 * and outputs the number of days in that month. Assume that February has 28 days.
 * In this program, we use a switch-case statement to handle different month numbers entered by the user.
 * The switch statement checks the value of the variable month, and executes the corresponding case block.
 * If none of the cases match, the default block is executed
 */

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a month number (1 for January, 2 for February, etc.): ");
        int monthNumber = scanner.nextInt();
        
        switch (monthNumber) {
            case 1:
                System.out.println("January has 31 days.");
                break;
            case 2:
                System.out.println("February has 28 days.");
                break;
            case 3:
                System.out.println("March has 31 days.");
                break;
            case 4:
                System.out.println("April has 30 days.");
                break;
            case 5:
                System.out.println("May has 31 days.");
                break;
            case 6:
                System.out.println("June has 30 days.");
                break;
            case 7:
                System.out.println("July has 31 days.");
                break;
            case 8:
                System.out.println("August has 31 days.");
                break;
            case 9:
                System.out.println("September has 30 days.");
                break;
            case 10:
                System.out.println("October has 31 days.");
                break;
            case 11:
                System.out.println("November has 30 days.");
                break;
            case 12:
                System.out.println("December has 31 days.");
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
     
        scanner.close();
    }
}
