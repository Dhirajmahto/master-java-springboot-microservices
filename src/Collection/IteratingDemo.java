package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
    public static void main(String[] args) {
        List<String> users =new ArrayList();
        users.add("DHIRAJ");
        users.add("NIRAJ");
        users.add("BISHAL");
        users.add("DHIRAJ");

        // For each
        System.out.println("using for each interation");
        for(String user:users){
            System.out.println("user :" +  user);
        }
        // For loop
        System.out.println(" using for loop");
        for(int i=0; i<users.size(); i++){
            System.out.println("user :" +  users.get(i));
        }

        // ITERATOR
        System.out.println("usirng interator");
        Iterator<String> it = users.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
           if(it.next().equals("DHIRAJ")){
               it.remove();
           }
       }
       for(String user:users){
           System.out.println("user :" +  user);
       }
    }
}
