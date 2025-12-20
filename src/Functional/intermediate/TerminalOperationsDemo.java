package Functional.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,55);
        // reduce()
        //List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        Stream<Integer> stream = numbers.stream();
        // int sum = stream.reduce(0, (a, b) -> a + b);
        int sum = stream.reduce(0,Integer::sum);
        System.out.println(sum);

        // collect()
        List<Integer> evenNumbers = numbers.stream()
                .filter(n-> n % 2 ==0 )
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // find & match

        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

       boolean has = numbers.stream()
                .anyMatch(n -> n  ==40 );
       System.out.println(has);

       // iteration
        numbers.stream()
                .forEach(System.out::println);
    }
}
