/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * Task: Create a a program where user inputs two numbers and perform 4 basic arithmetic operations using 4 methods with return types and print the results.
 */

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers separated by a space
        System.out.print("Enter two numbers separated by a space: ");
        String input = scanner.nextLine();

        // Split the input string, convert to double, and store in an array
        String[] parts = input.split(" ");
        double[] numbers = new double[2];
        numbers[0] = Double.parseDouble(parts[0]);
        numbers[1] = Double.parseDouble(parts[1]);

        // Perform arithmetic operations using methods and print the results
        System.out.println("Sum: " + add(numbers));
        System.out.println("Difference: " + subtract(numbers));
        System.out.println("Product: " + multiply(numbers));
        System.out.println("Quotient: " + divide(numbers));

        scanner.close();
    }

    public static double add(double[] numbers) {
        return numbers[0] + numbers[1];
    }

    public static double subtract(double[] numbers) {
        return numbers[0] - numbers[1];
    }

    public static double multiply(double[] numbers) {
        return numbers[0] * numbers[1];
    }

    public static double divide(double[] numbers) {
        if (numbers[1] != 0) {
            return numbers[0] / numbers[1];
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // Return NaN for division by zero
        }
    }
}