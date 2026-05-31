import java.util.*;
public class palindrome_triangle {
    //Function to demonstrate pattern
    public static void Palindrome_pattern(int n) {
        //outer loop to handle number of rows
        for(int i = 1; i<=n; i++) {
            //inner loop to print the spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //inner loop to print the 1st part
            for(int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }
            //inner loop to print the 2nd part
            for(int j=2; j<=i; j++) {
                System.out.print(j+" ");
            }
            //printing new line for each row
            System.out.println();
        }
    }
    //Driver Function
    public static void main(String args[]) {
        Palindrome_pattern(5);

    }
    
}
