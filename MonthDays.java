import java.util.Scanner; // Import the Scanner class to read user input

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Enter the month number (1-12): "); // Prompt the user to enter the month number
        int month = scanner.nextInt(); // Read the month number entered by the user

        int daysInMonth; // Variable to store the number of days in the given month
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: // Months with 31 days
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11: // Months with 30 days
                daysInMonth = 30;
                break;
            case 2: // February, assumed to have 28 days
                daysInMonth = 28;
                break;
            default: // Handle invalid month numbers
                System.out.println("Invalid month number.");
                return; // Exit the program if the month number is invalid
        }

        System.out.println("Number of days in the month: " + daysInMonth); // Print the number of days in the month
    }
}