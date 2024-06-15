package TaskSheet121;
public class DateTask {
    // Make instance variables to private
    private byte day;
    private byte month;
    private short year;
// Constructors:

// The no-args constructor
public DateTask() {
    this(1, 1, 1); // Call the three-argument constructor
}
// Constructor that takes 3 arguments
public DateTask(int m, int d, int y) {
    setDate(m, d, y);
}
// Methods
public String toString() {
    return month + "/" + day + "/" + year; //display "12/12/2012" date format
}
public void setDate(int m, int d, int y) {
    if (valid(d, m, y)) {
        day = (byte) d;
        year = (short) y;
        month = (byte) m;
    }
    else{
        day = (byte) 0;
        year = (short) 0;
        month = (byte) 0;
    }
}
public static void leapYears() {
    for (int i = 1980; i <= 2023; i = i + 4) {
        if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
            System.out.println("The year " + i + " is a leap year");
    }
}
public int getDay() {
    return day; //The getDay() method set to return day
}
public void setDay(int day) {
    if (valid(day, month, year)) {
        this.day = (byte) day;
    } else {
        this.day = (byte) 0; //The setDay() method set to return 0 if condition is false.
    }
    
}
public int getMonth() {
    return month; //The getMonth() method set to return month.
}
public void setMonth(int month) {
    if (valid(day, month, year)) {
        this.month = (byte) month;
    }
    else{
        this.month = (byte) 0; //The setMonth() method set to return 0 if condition is false.
    }
}
public int getYear() {
    return year; //The getYear() method set to return year.
}
public void setYear(int year) {
    if (valid(day, month, year)) {
        this.year = (short) year;
    }
    else{
        this.year = (short) 0; //The setYear() method set to return 0 if condition is false.
    }
}
private boolean valid(int day, int month, int year) {
    if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1)  {
        System.out.println("Attempting to create a non-valid date " +month + "/" + day + "/" + year);
        return false;
    }
    switch (month) {
        case 4:
        case 6:
        case 9:
        case 11:
            return (day <= 30);
        case 2:
            return day <= 28 || (day == 29 && year % 4 == 0);
    }
    return true;
}
}