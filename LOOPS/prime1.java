
import java.util.*;
public class prime1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isprime = true;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {//n is multiple of i (i is not equal to 1 or n)
                isprime = false;
                }
            }
            if(isprime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
    }
    
}