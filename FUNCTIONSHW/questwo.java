import java.util.*;

public class questwo {
    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. :");
        int n = sc.nextInt();
        
        if(isEven(n)) {
            System.out.println("Number is even");
        } else {
            System.out.println("number is odd");
        }
        System.out.println(isEven(n));
    }
}
