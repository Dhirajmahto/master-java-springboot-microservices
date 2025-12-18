package OOps.classesdemo.inheritance;

public class inheritanceDemo {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", 1200,4);
        car1.displayInfo();

        Car.Bike bike = new Car.Bike("Yamaha",160, true);
        bike.displayInfo();
    }
}
