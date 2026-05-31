import java.util.*;
public class functionpara {
    public static int calculateSum(int numb1, int numb2) { //parameters or formal parameters
        int sum = numb1 + numb2;
        return sum;
        // System.out.println("sum is :"+sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = calculateSum(a, b); //arguments or actual parameters
        System.out.println("sum is :"+sum);

    }
    
}
