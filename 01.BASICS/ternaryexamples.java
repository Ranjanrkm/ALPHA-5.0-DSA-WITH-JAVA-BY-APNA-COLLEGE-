import java.util.*;
public class ternaryexamples {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //ternary operator

        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
    
}
