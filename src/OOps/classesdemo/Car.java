package OOps.classesdemo;

public class Car {
    String brand;
    String color;
    int speed;

    public void drive(){
        System.out.println(brand + " is driving at "  + speed);
    }

    public static class ClassesObjectsDemo {
        public static void main(String[] args) {
            Car car1 = new Car();
            car1.speed = 100;
            car1.brand = "BMW";
            car1.color = "Red";
            car1.drive();

            Car car2 = new Car();
            car2.speed = 200;
            car2.brand = "Farari";
            car2.color = "Blue";
            car2.drive();

        }
    }
}
