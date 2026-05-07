import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        list.add(1); //o(1)
        list.add(2); //o(1)
        list.add(3); //o(1)
        list.add(4); //o(1)
        list.add(5);

        System.out.println(list);

        //get operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        //remove ,  delete
        list.remove(2);
        System.out.println(list);

        //set
        list.set(2, 10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        list.add(1,9);
        System.out.println(list);
    }
}