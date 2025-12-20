package Functional.intermediate;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class intermediateDemo {
    public static void main(String[] args) {

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

        // 1. Filtering Books cheaper than $300

        Stream<Book> stream1 = books.stream();
        Stream<Book> stream2 = stream1.filter(book -> book.price < 700);
        stream2.forEach(System.out::println);

        // 2. Mapping : Convert Book titles to uppercase
        Stream<String> upperCaseTitle = books.stream()
                .map(book -> book.title.toUpperCase());
        upperCaseTitle.forEach(System.out::println);

        //. Sorting: Books by publication date
        Stream<Book> sortedBook = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationYear));
        sortedBook.forEach(System.out::println);

        // 4. Distinct: Remove duplicate titles
        Stream<Book> uniqBooks = books.stream()
                .distinct();
        uniqBooks.forEach(System.out::println);

        // 5. Limit: Display only the first 3 books
        System.out.println("Display first three publiseBook ");
        Stream<Book> firstThreeBooks = books.stream()
                .sorted(Comparator.comparingInt(book -> book.publicationYear))
                .limit(3);
        firstThreeBooks.forEach(System.out::println);

        // 6. Skip: Skip the first 2 books
        System.out.println("DISPLAY AFTER SKIPPING TOW BOOK");
        Stream<Book> afterskipingTwo = books.stream()
                .skip(2);
        afterskipingTwo.forEach(System.out::println);

    }
}
