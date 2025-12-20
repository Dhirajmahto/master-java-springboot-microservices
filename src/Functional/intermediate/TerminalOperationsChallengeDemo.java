package Functional.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TerminalOperationsChallengeDemo {
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

        // Total cost of all books in the bookstore
        Double bookcost = books.stream()
                .mapToDouble(book -> book.price)
                .reduce(0, Double::sum);
        System.out.println(bookcost);

        // Collecting books into a list of titles
        List<String> booktitle = books.stream()
                .map(book -> book.title)
                .collect(Collectors.toList());
        System.out.println(booktitle);

        // Grouping books by category
       Map<String, List <Book>> byCategory = books.stream()
                .collect(Collectors.groupingBy(priceFunction));
       byCategory.forEach((category, bookList) ->{
          bookList.forEach(System.out::println);
       });
    }

    static Function<Book, String> priceFunction = new Function<Book, String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };
}