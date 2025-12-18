package OOps.classesdemo.interfaces;

import OOps.classesdemo.Car;

public class ElectricCar implements CarControles {
    @Override
    public void turnLeft() {
        System.out.println("turn left ElectricCar");
    }

    @Override
    public void turnRight() {
        System.out.println("turn right ElectricCar");
    }

    @Override
    public void applyBrakes() {
        System.out.println("apply brakes ElectricCar");
    }
}
