/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * 
 * This class takes in three numbers from the user and outputs the largest number. if all numbers are equal it will print All numbers are equal
 */


import java.util.Scanner;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by commas: ");
        String input = scanner.nextLine();
        
        // Split the input by commas and convert to an ArrayList of integers
        String[] parts = input.split(",");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            numbers.add(Integer.parseInt(part.trim()));
        }

        if (numbers.size() != 3) {
            System.out.println("Please enter exactly three numbers.");
        } else if (numbers.get(0).equals(numbers.get(1)) && numbers.get(1).equals(numbers.get(2))) {
            System.out.println("All numbers are equal");
        } else {
            int largest = numbers.get(0);
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) > largest) {
                    largest = numbers.get(i);
                }
            }
            System.out.println("The largest number is: " + largest);
        }

        scanner.close();
    }
}