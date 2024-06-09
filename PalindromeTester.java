/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * 
 * This class checks if a given string is a palindrome.
 */

 import java.util.Scanner;

 public class PalindromeTester {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         System.out.print("Enter a string: ");
         String input = scanner.nextLine();
 
         // Convert to lowercase
         String lowercased = input.toLowerCase();
         
         // Reverse the string
         String reversedStr = new StringBuilder(lowercased).reverse().toString();
 
         if (lowercased.equals(reversedStr)) {
             System.out.println("Yes, '" + input + "' is a palindrome.");
         } else {
             System.out.println("No, '" + input + "' is not a palindrome.");
         }
 
         scanner.close();
     }
 }
