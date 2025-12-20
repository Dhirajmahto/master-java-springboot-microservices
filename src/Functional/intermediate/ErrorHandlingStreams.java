package Functional.intermediate;

import java.util.List;

public class ErrorHandlingStreams {
    public static void main(String[] args) {
        List<String> books = List.of("Dhiraj","Niraj","Bishal");
        books.stream()
                .forEach(b ->{
                    try{
                        if(b.equals("Bishal"))
                            throw new RuntimeException("Invalid name");
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                });
    }
}
