package Functional;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class RealExample {
    public static void main(String[] args) {
        // <Title> costs $<Price>
        BiFunction<String , Double , String> formatter = (title, price)-> title +  "costs $" + price;
        System.out.println(formatter.apply("java Basic",599.49));
        System.out.println(formatter.apply("Python",399.49));
        System.out.println(formatter.apply("C++",499.49));

        BiConsumer<String , Double> formatterConsumer = (title, price)-> System.out.println(title +  " costs $ " + price);
        formatterConsumer.accept("java Basic",599.49);
        formatterConsumer.accept("Python",399.49);
        formatterConsumer.accept("C++",499.49);
    }
}
