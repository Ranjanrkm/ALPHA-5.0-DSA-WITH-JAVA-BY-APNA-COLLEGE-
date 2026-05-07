import java.util.HashMap;
import java.util.Scanner;

public class SubK {

    // Optimized function using Prefix Sum and HashMap
    public static int getLongestSubarray(int[] arr, int k) {
        int n = arr.length;
        
        // Map to store the prefix sums and their earliest occurrence index
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        
        preSumMap.put(0, 1);
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            // Calculate prefix sum till current index
            sum += arr[i];


            if (preSumMap.containsKey(sum - k)) {
                // Calculate length of the subarray
               ans += preSumMap.get(sum - k);
            }

            preSumMap.put(sum, preSumMap.getOrDefault(sum, 0) + 1);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Reading array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Reading the target sum
        int k = sc.nextInt();
        
        // Fetching and printing the result
        int len = getLongestSubarray(arr, k);
        System.out.println(len);
        
        sc.close();
    }
}