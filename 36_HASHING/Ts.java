import java.util.*;
public class Ts {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");


        System.out.println(ts);

        Iterator it = ts.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();
        
        for(String city : ts) {
            System.out.println(city);
        }
 
    }
}