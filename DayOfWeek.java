/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * TASKS: Number to day of the week
 * create a program that will accept 1-7 inputs and print the day in a week that corresponds with that number
 * 1 	Monday
 * 2 	Tuesday
 * 3 	Wednesday
 * 4 	Thursday
 * 5	Friday
 * 6	Saturday
 * 7	Sunday
* Any other number or character must print invalid input
 */

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();
            
            switch (dayNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
        
        scanner.close();
    }
}
