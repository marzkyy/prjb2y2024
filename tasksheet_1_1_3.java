/**
 * Student: Junmar P.
 * Trainer: Sir Marco
 * School: SLTCFI
 * Course: Java NCIII - Batch 2 
 *
 * 
 * Title: Writing Control flow statements using Loops
 * 
 * Performance Objective: Given a function of " (i%2==0) ? 'even' : 'odd' ; ", 
 * you should be able to write a program that will check each number if the 
 * given numbers are odd or even numbers, print them, and compile it to run 
 * in a java virtual machine without errors following Java Standard Edition specification.
 */


 public class tasksheet_1_1_3 {
    public static void main(String[] args) {
        //Create an int variable and name it check_number with an initial value of 10
        int check_number = 10;

        //Create a String variable and name it message
        String message;

        //Use check_number as a condition on how many loops the program can print
        for (int i = 1; i <= check_number; i++) {
            //Check and print each number if odd or even using the given syntax
            message = (i % 2 == 0) ? i + " is an even number" : i + " is an odd number";
            //Print the message value
            System.out.println(message);
        }
    }
}
