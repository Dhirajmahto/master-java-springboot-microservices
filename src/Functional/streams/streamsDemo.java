package Functional.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamsDemo {
    public static void main(String[] args) {
        // Streams --> Assembly line / pipeline
        List<String> items = Arrays.asList("Apple","Banana", "Pear", "Cherry");
        for(String fruit: items){
            System.out.println(fruit);
        }

        //Using Streams
        Stream<String> stream = items.stream();
        stream.forEach(System.out::println);

        //
        System.out.println("Filter Fruits");
//        Stream<String> stream1 = items.stream();
//        Stream<String> filteredStream = stream1.filter(name -> name.startsWith("B"));
//        filteredStream.forEach(System.out::println);

         items.stream()
                 .filter(name -> name.startsWith("B"))
                 .forEach(System.out::println);

         /* USE CASES:
          1. Filtering
          2. Mapping
          3. Aggregation
          4. Searching
          5. Iteration

          */
    }
}
