package Functional.inbuild;

import java.util.function.Function;

public class FunctionInterface {


  public  static Function<Integer,Integer> addfunction = (a) -> a + 3;

  public  static Function<Integer,Integer> subfunction = (a) -> a - 3;

  // chaening
    public static Function<Integer,Integer> combinefunction =
          addfunction.andThen(subfunction);

    public static void main(String[] args) {
        System.out.println(addfunction.apply(100));
        System.out.println(subfunction.apply(100));
        System.out.println(combinefunction.apply(100));
    }
}
