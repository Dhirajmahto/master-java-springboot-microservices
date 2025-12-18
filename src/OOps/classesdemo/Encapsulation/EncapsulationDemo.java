package OOps.classesdemo.Encapsulation;

class  Car {
    private String name;
    private String color;
    private int speed;

    public Car(String name , String color, int speed) {
        this.name = name;
        this.color = color;
       // this.speed = speed;
        setSpeed(speed);
    }

    public void drive(){
        System.out.println(name + "is driving at " + speed);
    }

    public int getSpeed() {
        return speed;
    }

   public void setSpeed(int speed) {
        if(speed < 0){
           speed = 0;
        }
      this.speed = speed;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Red", 300);
        car1.setSpeed(-200);
        car1.drive();
        Car car2 = new Car("Honda", "Blue", -400);
        car2.drive();
    }
}
