package OOps.classesdemo.Constructors;

record Bike(String brand, int speed){}

public class Recorddemo {
    public static void main(String[] args) {
        Bike bike = new Bike("BMW", 300);
        System.out.println("Barand: " +  bike.brand());
        System.out.println("Speed: " +  bike.speed());
        System.out.println(bike);
    }
}
