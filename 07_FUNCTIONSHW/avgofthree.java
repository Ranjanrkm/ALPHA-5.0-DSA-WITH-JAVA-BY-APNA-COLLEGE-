import java.util.*;

public class avgofthree {
    public static double avg(int a , int b , int c) {
        int average = (a + b + c) / 3;
        return average;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no.:");
        int a = sc.nextInt();
        System.out.print("enter 2nd no.:");
        int b = sc.nextInt();
        System.out.print("enter 3rd no.:");
        int c = sc.nextInt();
        // int a = 1 ;
        // int b = 2;
        // int c = 3;
        double avg = avg(a,b,c);
        System.out.println("average = "+avg);
    }
    
}
