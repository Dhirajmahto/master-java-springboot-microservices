package Functional;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(101));

        BiPredicate<Integer, Integer> isEven2 = (a,b) -> (a + b)%2 == 0;
        System.out.println(isEven2.test(10,40));
        System.out.println(isEven2.test(10,41));
    }
}
