import java.util.Scanner;
public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=4*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("* ");
            }
            for(int j=1; j<=4*i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(n-i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        symmetry(n);
    }
}