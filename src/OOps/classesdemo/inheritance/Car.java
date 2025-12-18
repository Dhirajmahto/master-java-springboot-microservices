package OOps.classesdemo.inheritance;

public class Car extends  Vehicle{
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public static class Bike extends Vehicle {
        private boolean hasCarrier;

        public Bike(String brand, int speed , boolean hasCarrier) {
            super(brand, speed);
            this.hasCarrier = hasCarrier;
        }

        public boolean isHasCarrier() {
            return hasCarrier;
        }

        public void setHasCarrier(boolean hasCarrier) {
            this.hasCarrier = hasCarrier;
        }
    }
}
