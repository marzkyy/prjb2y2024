public class Main {
    public static void main(String[] args) {
        // Instantiate three Book objects with different values using the constructor
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        // Print out the details of each book
        System.out.println("Book 1:");
        book1.displayDetails();

        System.out.println("Book 2:");
        book2.displayDetails();

        System.out.println("Book 3:");
        book3.displayDetails();
    }
}
