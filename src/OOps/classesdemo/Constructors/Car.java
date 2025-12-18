package OOps.classesdemo.Constructors;

public class Car {
    String brand;
    String color;
    private int speed;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String color, int speed) {
        System.out.println("Constructor is called");
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void drive(){
        System.out.println(brand + "  is driving at  "  + speed);
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;

    }
}
