package OOps.classesdemo.interfaces;

public class interfaceDemo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.applyBrakes();
        electricCar.turnLeft();

        CarControles myCar = new ElectricCar();
        myCar.applyBrakes();

        CarControles myCar2 = new SportsCar();
        myCar2.applyBrakes();
    }
}
