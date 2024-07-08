/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * TASKS: Sum of All integer Inputs
 */

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integers to sum. Type any non-integer to stop:");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum of all integer inputs is: " + sum);

        scanner.close();
    }
}