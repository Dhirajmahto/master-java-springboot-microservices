package Optionals;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args) {
        String name = null;
        if(name != null){
            System.out.println(name.length());
        }else
        System.out.println("Name is null");

        // Creating Optional

        Optional<String> optional = Optional.of("Java");
        System.out.println(optional);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> empty2 = Optional.ofNullable(null);
        System.out.println(empty2);

         // Checking values
        System.out.println(optional.isPresent());
        System.out.println(empty2.isPresent());

        System.out.println(optional.isEmpty());
        System.out.println(empty.isEmpty());

        // get()
        System.out.println(optional.get());
       // System.out.println(empty.get());
    }
}
