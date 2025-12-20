package Basic;

public class ControleFlow {
     /*
==========================================================
        CONTROL FLOW IN JAVA
==========================================================

🔹 What is Control Flow?
Control flow means how your program executes statements
based on conditions or loops. Instead of running code line
by line blindly, you can tell Java:

✅ “Do this if something is true.”
🔄 “Repeat this until a condition changes.”
🔀 “Choose one path from many.”

Java gives us three main types:
1. Decision-making → if, else if, else, switch
2. Loops (Iteration) → for, while, do-while, enhanced for-each
3. Jump statements → break, continue
*/

    public static void main(String[] args) {
        // if-else
        int age = 20;
        if(age > 10){
            System.out.println("Welcome to our bank ");
        }else {
            System.out.println("Sorry you are not eligible");
        }

        // if -else ladder
        int marks =100;
        if(marks > 90){
            System.out.println("Grade A+");
        } else if(marks > 80){
            System.out.println("Grade B+");

        }else if(marks > 70){
            System.out.println("Grade C+");
        } else{
            System.out.println("Grade D+");
        }

        // switch
        String day = "Saturday";
        switch (day) {
            case "Monday" -> System.out.println("Start of the week");
            case "Friday" -> System.out.println("Last day of the week");
            default -> System.out.println("Enjoy weekend");
        }


        // LOOpS
        // For
        for(int i=0; i < 100; i++){
            System.out.println("Countdow"+i);
        }

        // While
         int num =3;
        while(num > 0){
            System.out.println("Countdow"+num);
            num--;
        }

        // do while
        int n =3;
        do{
            System.out.println("Countdow"+n);
            n--;
        } while(n>0);

        //Enhanced for each
        String[] furits = {"Apple", "Banana"};
        for(String furit: furits){
            System.out.println(furit);
        }

        for(int i =0; i<furits.length;i++){
            System.out.println(furits[i]);
        }

        //JUMP STATEMENT
        // break
        for(int i=0; i<10; i++){
            if(i == 3) continue;
            if(i == 7) break;
            System.out.println("Count :"+i);
        }
    }
}
