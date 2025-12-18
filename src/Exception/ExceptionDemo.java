package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;

        try{
            // EXCEPTION GENERATING STATEMENTS
            int res = 10 / 3;
            System.out.println("Done");
        } catch ( Exception e){
            //EXCEPTION HANDLING STATEMENT
            System.out.println(e);
        }

        int [] a1 = {1, 2, 3};
        try{
            System.out.println(a1[6]);
        } catch (Exception e) {
            System.out.println(e);
        }  finally {
            // Always executes
            System.out.println("finally");
        }

        // Cheaced excepetion
        try {
            FileReader fileReader = new FileReader("abc.taxt");
        } catch (FileNotFoundException e) {
           // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }


    }
}
