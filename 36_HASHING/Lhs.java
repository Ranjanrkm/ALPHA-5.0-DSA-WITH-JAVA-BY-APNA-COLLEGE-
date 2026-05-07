import java.util.*;
public class Lhs {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");


        System.out.println(lhs);

        Iterator it = lhs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();
        
        for(String city : lhs) {
            System.out.println(city);
        }
 
    }
}