package Collection;

import java.util.ArrayList;
import java.util.List;

class Car{
    String brand;
    Car(String brand){
        this.brand=brand;
    }
}

public class ListDemo {
    public static void main(String[] args) {
        List <String> users =new ArrayList();
        users.add("DHIRAJ");
        users.add("NIRAJ");
        users.add("BISHAL");

        System.out.println("All users in this collection");
        for(String user:users){
            System.out.println(user);
        }
        System.out.println("Elements useing index : "+users.getFirst());
        System.out.println("Elements useing index : "+users.getLast());

        Car car1=new Car("TOYOTA");
        Car Car2=new Car("BMW");

        List<Car> cars=new ArrayList();
        cars.add(car1);
        cars.add(Car2);
        for(Car car:cars){
            System.out.println(car.brand);
        }
    }
}
