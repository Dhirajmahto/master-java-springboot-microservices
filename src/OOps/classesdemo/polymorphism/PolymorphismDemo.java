package OOps.classesdemo.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 200, 5);
        c1.displayInfo();

        Bike b1 = new Bike("Yamaha", 120, true);
        b1.displayInfo();

        c1.start();
        b1.start();

        Vehicle v1 = new Vehicle("VehicleBrand" , 200);
        v1.start();

        Vehicle v2 = new Vehicle("VehicleBrand" , 200);
        v1.start();
    }
}
