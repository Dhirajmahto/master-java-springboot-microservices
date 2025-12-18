package Collection;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"A");
        map.put(1,"B");
        map.put(2,"C");
        map.put(3,"D");

        System.out.println("User with id 2" + map.get(2));
        System.out.println("all useer");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println( entry.getKey()  + " :" + entry.getValue());
        }
    }
}
