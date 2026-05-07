import java.util.*;
public class ternarypassfail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String status = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(status);
    }
    
}
