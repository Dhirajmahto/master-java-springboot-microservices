package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> roles = new HashSet<String>();
        roles.add("admin");
        roles.add("user");
        roles.add("manager");
        roles.add("manager");

        for(String role:roles){
            System.out.println("Role:"  + role);
        }
    }
}
