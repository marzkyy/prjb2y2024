/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * Task: Write a program featuring an integer variable arguments method.
 * The method should return the sum of all parameters and, for each parameter,
 * the cumulative sum up to that point. For instance, given parameters (4, 5, 10),
 * the program should compute the total for the first parameter, 
 * such as 4 = (1+2+3+4), and repeat this process for subsequent parameters.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the numbers separated by space
        System.out.print("Enter the numbers separated by space (Press Enter to finish): ");
        String input = scanner.nextLine();

        // Split the input by spaces and convert to an ArrayList of integers
        String[] inputNumbers = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number : inputNumbers) {
            numbers.add(Integer.parseInt(number));
        }

        int[] sums = calculateCumulativeSums(numbers);

        System.out.println("Total sum for each parameter:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " = " + sums[i]);
        }

        scanner.close();
    }

    public static int[] calculateCumulativeSums(ArrayList<Integer> numbers) {
        int[] sums = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            int sum = 0;
            for (int j = 1; j <= numbers.get(i); j++) {
                sum += j;
            }
            sums[i] = sum;
        }
        return sums;
    }
}
