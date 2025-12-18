package Functional;

import java.awt.print.Book;

@FunctionalInterface
interface BookAction{
    void perform();
}

// Functional Interface with parameters
@FunctionalInterface
interface Operation{
    int add(int a, int b);
}

// parameter -> expression body
// () -> {}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        // Step 1
        BookAction action1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action Performed");
            }
        };

        // Step 2
        BookAction action2 = () -> {
            System.out.println("Action Performed");
        };

        // Step 3
        BookAction action3 = () -> System.out.println("Action Performed");
        action3.perform();

        // parameters
//        Operation ope = new  Operation() {
//            @Override
//            public int add(int a, int b) {
//                return a + b;
//            }
//        };
//        System.out.println(ope.add(10, 20));
//    }
        // With the lambdas Use in Parameters
        Operation ope1 = (int a, int b) -> {
            return a + b;
        };
        System.out.println( ope1.add(100, 20));

        // THREAD INTERFACE
        new Thread(()-> System.out.println("New Thread Started")).start();
    }
}
