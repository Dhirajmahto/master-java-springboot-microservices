package OOps.classesdemo.interfaces;

public class SportsCar implements CarControles {
    @Override
    public void turnLeft() {
        System.out.println("Turn Left  Sports Car");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn Right Sports Car");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Apply Brakes  Sports Car");
    }
}
