/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to read three integers from the user and determine which 
 * of the three numbers is the largest. The program must use a standard 
 * if - else if - else conditional ladder and logical operators to evaluate 
 * the conditions efficiently.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - Three space-separated or newline-separated integers representing a, b, and c.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single string output indicating which variable holds the largest value 
 * (e.g., "largest is a").
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 10 20 15
 *
 * Step-by-step working:
 * 1. Initialize Scanner to read input.
 * 2. Read first integer: a = 10.
 * 3. Read second integer: b = 20.
 * 4. Read third integer: c = 15.
 * 5. Check 1st condition: if (a >= b && a >= c)
 * -> (10 >= 20) is FALSE. 
 * -> Due to short-circuiting, Java doesn't even check the second part. 
 * -> Entire condition is FALSE.
 * 6. Check 2nd condition: else if (b >= c)
 * -> (20 >= 15) is TRUE.
 * 7. Execute block for the true condition: Print "largest is b".
 * 8. Skip the remaining 'else' block.
 *
 * Output:
 * largest is b
 */

import java.util.Scanner; 

public class largestof3 { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to capture user input from the console
        Scanner sc = new Scanner(System.in); 
        
        // Safety check to ensure there is input to read
        if (!sc.hasNextInt()) return;
        
        // 2. Read the three integer values dynamically
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt(); 
        
        // 3. Conditional Ladder begins
        // Check if 'a' is greater than or equal to BOTH 'b' and 'c'
        // The && (Logical AND) ensures both relational checks must be true
        if (a >= b && a >= c) { 
            System.out.println("largest is a"); 
        } 
        
        // 4. If 'a' is NOT the largest, we only need to compare 'b' and 'c'.
        // If execution reaches here, we already know 'a' is out of the running.
        else if (b >= c) { 
            System.out.println("largest is b"); 
        } 
        
        // 5. If 'a' is not the largest, and 'b' is not the largest, 'c' must be it.
        else { 
            System.out.println("largest is c"); 
        }

        // 6. Close the scanner to release system resources
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Short-Circuit Evaluation: In the condition `(a >= b && a >= c)`, if `a >= b` 
 * evaluates to `false`, Java completely skips evaluating `a >= c`. This makes 
 * the `&&` operator highly efficient.
 * 2. Optimized Else-If: Notice that the second check is simply `else if (b >= c)`. 
 * You do NOT need to write `else if (b >= a && b >= c)` because if `b` were smaller 
 * than `a`, the first `if` block would have caught it (or `a` would have been caught 
 * as the largest). This prevents redundant logical checks.
 * 3. Handling Equality: By using `>=` instead of `>`, the logic perfectly handles 
 * duplicate maximums. If the input is `10 20 20`, `a >= b` is false. It moves to 
 * `b >= c` (20 >= 20), which is true, correctly identifying `b` (or `c`, they are equal) 
 * as the max value without throwing errors or missing a branch.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "As a final-year IT student preparing for strict coding environments like TCS NQT, 
 * I always prioritize writing clean, non-redundant control flows. To find the largest 
 * of three numbers, I used an if-else if-else ladder. I first check if 'a' is greater 
 * than or equal to both 'b' and 'c' using the logical AND operator. If that fails, I 
 * know 'a' is not the maximum, so my next 'else if' condition simply compares 'b' 
 * and 'c' directly—eliminating the need to check 'b' against 'a' again. Finally, if 
 * both checks fail, 'c' becomes the default maximum. This approach minimizes the total 
 * number of comparisons the CPU has to perform."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The program performs a maximum of two conditional checks and one print statement, 
 * which takes constant time regardless of the input values.
 *
 * SPACE COMPLEXITY: O(1)
 * Memory usage is strictly limited to three primitive integer variables (`a`, `b`, `c`) 
 * and the Scanner object, requiring O(1) auxiliary space.
 */