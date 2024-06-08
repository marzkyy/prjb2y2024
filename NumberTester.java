/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * 
 * This class provides methods to test a number for various properties such as odd, even, positive, negative, or zero.
 */

 import java.util.Scanner;

public class NumberTester {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result;
        if (number == 0) {
            result = number + " is zero.";
        } else {
            if (number % 2 == 0) {
                result = number + " is even";
            } else {
                result = number + " is odd";
            }

            if (number > 0) {
                result += " and positive.";
            } else {
                result += " and negative.";
            }
        }

        System.out.println(result);

        scanner.close();
    }
}

