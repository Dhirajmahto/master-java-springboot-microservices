package Basic;

public class Method {
    public static void main(String[] args) {
        SayHello("Dhirja");

        SayHello("Niraj");

        SayHello("Bishal");
        System.out.println("Add"+ add(10,20));
    }

    private static void SayHello(String name) {
        System.out.println("Hi" +name);
        System.out.println("Welcome to our course");
    }
    private static  int add(int a , int b){
        return a+b;
    }
}
