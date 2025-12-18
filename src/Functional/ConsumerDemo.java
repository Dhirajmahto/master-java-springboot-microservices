package Functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer = (str) -> System.out.println(str);
        Consumer<String> consumer = System.out::println;

        Consumer<String> consumer1 = str -> System.out.println("Length:"+str.length());
        consumer.accept("hello");
        consumer.accept("world");
        consumer.accept("hello");
        consumer.accept("world");

        consumer1.accept("hello");
        consumer1.accept("hi");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Consumer<Integer> multiplyByTwo = n -> System.out.println(n * 2);
        numbers.forEach(multiplyByTwo);
    }
}
