package Functional;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a + b;

    public static BiFunction<Integer, Integer, Integer> subtractFunction = (a, b) -> a - b;

    public static void main(String[] args) {
        System.out.println(addFunction.apply(1, 2));
        System.out.println(subtractFunction.apply(1, 2));
    }
}
