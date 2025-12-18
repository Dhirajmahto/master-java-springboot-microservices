package OOps.classesdemo.polymorphism;

import OOps.classesdemo.inheritance.Vehicle;

public class Car extends OOps.classesdemo.inheritance.Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public void start() {
        System.out.println("Starting Car...");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public static class Bike extends Vehicle {
        private boolean hasCarrier;

        public Bike(String brand, int speed, boolean hasCarrier) {
            super(brand, speed);
            this.hasCarrier = hasCarrier;
        }

        public boolean isHasCarrier() {
            return hasCarrier;
        }
    }
}