
import java.util.*;
public class sumofevenandoddintegers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sumeven = 0;
        double sumodd = 0;
        for(int i = 1; i<=n; i++){
            if(i % 2 == 0){
                sumeven+=i;
            } else {
                sumodd+=i;
            }

        }
         System.out.println("sum of even integers is:"+sumeven);
         System.out.println("sum of odd integers is:"+sumodd);
    }
    
}
