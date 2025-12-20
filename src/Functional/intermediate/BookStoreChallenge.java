package Functional.intermediate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookStoreChallenge {
    public static void main(String[] args) {
           /*
        - Discounted Books: The bookstore is planning a sale.
            Identify all books that are priced over $700. Display these books.
        - Classics Collection: The bookstore is launching a classics collection.
            Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
            by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
            Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the
            collection. A rare book is one where the title has more than 20
            characters. Identify and display these books.
         */
        List<Book> books = new ArrayList<>();

        books.add(new Book("Java Basics", 2018, 450.0, "Programming"));
        books.add(new Book("Advanced Java", 2020, 650.0, "Programming"));
        books.add(new Book("Spring Boot Guide", 2021, 700.0, "Framework"));
        books.add(new Book("Data Structures", 2019, 550.0, "Computer Science"));
        books.add(new Book("Algorithms Made Easy", 2017, 500.0, "Computer Science"));
        books.add(new Book("Clean Code", 2008, 800.0, "Software Engineering"));
        books.add(new Book("Design Patterns", 2015, 900.0, "Software Engineering"));
        books.add(new Book("Database Management", 2016, 600.0, "Database"));
        books.add(new Book("Operating Systems", 2014, 650.0, "Computer Science"));
        books.add(new Book("Web Development", 2022, 750.0, "Web"));


        //   Identify all books that are priced over $200.
        System.out.println("Identify all books that are priced over 200$");
        books.stream().filter(book -> book.price > 700).forEach(System.out:: println);

        // Identify and display books that were published before the year 2000
        System.out.println("Identify and display books that were published before the year 2000");
        books.stream().filter(book -> book.publicationYear > 2000).forEach(System.out::println);

        //  adding the suffix "(Coming Soon)" to all the current titles.
        System.out.println("Generate a list of future book titles for the next year\n" +
                " by adding the suffix \"(Coming Soon)\" to all the current titles.");

        books.stream().map(book -> book.title +"(Coming Soon)").forEach(System.out::println);

       //  Display the books sorted by their prices in ascending order.
        System.out.println(" The bookstore wants to print price tags for all the books.");
        books.stream().sorted(Comparator.comparingDouble(book -> book.price))
                .forEach(System.out::println);

        //A rare book is one where the title has more than 20 characters. Identify and display these books.
        System.out.println("A rare book is one where the title has more than 20\n" +
                "            characters. Identify and display these books.");

        books.stream()
                .filter(book -> book.title.length() > 10)
                .forEach(System.out::println);
    }
}
