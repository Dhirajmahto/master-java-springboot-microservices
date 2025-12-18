package OOps.classesdemo.Constructors;

public class ConstructorsDemo {
    public static void main(String[] args) {
        Car car1 = new Car(" bmw","read", 100);
        //car1.brand = "maruti";
        //car1.color = "red";
       // car1.speed = 300;
        car1.drive();

        Car car2 = new Car("fortunor", "black", 300);
        //car2.brand = "Fortuner";
       // car2.color = "red";
       // car2.speed = 500;
        car2.drive();

        Car car3 = new Car("honda");
        car3.drive();

        System.out.println(car2.getSpeed());
        car2.setSpeed(500);
        System.out.println(car2.getSpeed());
    }
}
