import java.util.*;
//O(n^2)
public class ques1 {
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i<nums.length-1; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int nums[] = {1,2,3,4};
        // Scanner Sc = new Scanner(System.in);
        // nums[0] = Sc.nextInt();
        // nums[1] = Sc.nextInt();
        // nums[2] = Sc.nextInt();
        // nums[3] = Sc.nextInt();
        // nums[4] = Sc.nextInt();
        // nums[5] = Sc.nextInt();
        System.out.println(containsDuplicate(nums));

    }
    
}
