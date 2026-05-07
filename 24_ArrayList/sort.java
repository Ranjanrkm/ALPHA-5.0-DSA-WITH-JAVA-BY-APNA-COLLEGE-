import java.util.ArrayList;
import java.util.Collections;

// import java.util.*;

public class sort {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(12);
        list.add(38);
        list.add(54);
        list.add(1);
        list.add(76);

        System.out.println(list);
        Collections.sort(list); // ascending order
        System.out.println(list);


        //descending order
        Collections.sort(list, Collections.reverseOrder());
        //Comparator - fnx logic
        System.out.println(list);
    }
}