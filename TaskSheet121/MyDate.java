package TaskSheet121;
import TaskSheet121.DateTask;
public class MyDate {
    public static void main(String[] args) {
        // Create instances of DateTask
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();

        // Set the dates
        date1.setDate(1, 1, 1978);
        date2.setDate(9, 21, 1984);

        // Display the dates
        System.out.println(date1.toString());
        System.out.println(date2.toString());

        // Display leap years
        DateTask.leapYears();
    }
}