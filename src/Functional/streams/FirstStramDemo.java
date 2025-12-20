package Functional.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStramDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // LIST : EVEN NUMBER form "numbers" list
        List<Integer> evenNumbers = new ArrayList<>();
        for(int number : numbers){
            if(number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println("Even numbers without streams: " +evenNumbers);

        // ITERATION 2
        Stream<Integer> integerStream1 = numbers.stream();
        Stream<Integer> integerStream2 = integerStream1.filter(p);
        List<Integer> evenNumbers2 = integerStream2.toList();
        System.out.println("Even numbers with streams: " +evenNumbers2);

        // ITERATION 3
        List<Integer> evenNumbers3 = numbers.stream()
                .filter(p2)
                .collect(Collectors.toList());
        System.out.println("Even numbers with streams: " +evenNumbers3);

    }
    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            int remainder = integer % 2;
            if (remainder == 0){
                return true;
            }
            return false;
        }
    };

    static Predicate<Integer> p2 = ( integer) -> integer % 2==0;

}
