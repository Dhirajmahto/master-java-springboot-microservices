package Collection;

import java.util.ArrayList;
import java.util.List;

class Carnew{
    String brand;
    Carnew(String brand){
        this.brand=brand;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        List <String> users =new ArrayList();
        users.add("DHIRAJ");
        users.add("NIRAJ");
        users.add("BISHAL");
        users.add("DHIRAJ");

        System.out.println("All users in this collection");
        for(String user:users){
            System.out.println(user);
        }
        System.out.println("Elements useing index : "+users.getFirst());
        System.out.println("Elements useing index : "+users.getLast());

        Carnew car1=new Carnew ("TOYOTA");
        Carnew Car2=new Carnew("BMW");

        List<Carnew> cars=new ArrayList();
        cars.add(car1);
        cars.add(Car2);
        for(Carnew car:cars){
            System.out.println(car.brand);
        }
    }
}
