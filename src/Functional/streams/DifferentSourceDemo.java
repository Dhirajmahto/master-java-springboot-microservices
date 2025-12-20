package Functional.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourceDemo {

    /*
    From Collections: e.g., collection.stream().
    From Arrays: e.g., Arrays.stream(array).
    From Specific Values: e.g., Stream.of("a", "b", "c").
    From Functions: e.g., Stream.iterate(0, n -> n + 2).
    From Files: e.g., Files.lines(path).
    Empty Stream: e.g., Stream.empty().
     */

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> integerStream = number.stream();
        integerStream.forEach(System.out::println);

        int[] numberArray={1,2,3,4,5,6,7,8,9,10,11};
        IntStream arryaStram = Arrays.stream(numberArray);
        arryaStram.forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12);
        stream.forEach(System.out::println);

        try {
            Stream<String> fileStream = Files.lines(Paths.get("C:\\Users\\uD83D\\"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Stream<String> emptyStream = Stream.empty();
    }
}
