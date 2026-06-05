/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to compare two numbers and determine which one is larger 
 * using a standard if-else control flow statement. 
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - Two space-separated integers representing A and B.
 * (Note: Upgraded from hardcoded variables to Scanner input for TCS NQT readiness).
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single string indicating which number is the largest.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 10 5
 *
 * Step-by-step working:
 * 1. Initialize Scanner to read from standard input.
 * 2. Read first integer into 'A' -> A = 10.
 * 3. Read second integer into 'B' -> B = 5.
 * 4. Evaluate the condition (A > B) -> (10 > 5) is TRUE.
 * 5. The program enters the 'if' block.
 * 6. Prints "10 is largest of 2".
 * 7. The 'else' block is completely skipped.
 *
 * Output:
 * 10 is largest of 2
 */

import java.util.Scanner;

public class largestof2 { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to capture user input from the console
        Scanner sc = new Scanner(System.in);
        
        // Safety check to ensure there is input to read
        if (!sc.hasNextInt()) return; 
        
        // 2. Dynamically read values for A and B
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        
        // 3. Decision Making: Compare the two variables
        // The '>' operator checks if the left side is strictly greater than the right side.
        if (A > B) { 
            // 4. This block executes ONLY if the condition (A > B) evaluates to true.
            System.out.println(A + " is largest of 2"); 
        } 
        else { 
            // 5. This block executes if the condition is false (meaning B is greater than OR equal to A).
            System.out.println(B + " is largest of 2"); 
        }
        
        // 6. Close the scanner to prevent memory leaks
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. The Equality Edge Case: A common logical trap in this basic `if-else` setup is 
 * what happens if A and B are exactly the same (e.g., A = 5, B = 5). The condition `5 > 5` 
 * evaluates to FALSE, so the code jumps to the `else` block and prints "5 is largest of 2". 
 * While technically correct in value, in a strict coding round, you might need to handle 
 * equality explicitly using an `else if (A == B)` block.
 * 2. Assignment (=) vs. Comparison (== / >): Beginners often accidentally write `if (A = B)`. 
 * A single equals sign assigns a value, which will cause a compilation error in Java because 
 * `if` statements strictly require boolean (true/false) results.
 * 3. Scanner Upgrade: Hardcoded values (int A = 10) are great for learning, but competitive 
 * programming platforms always pass hidden test cases via standard input. Using `Scanner` 
 * makes this code platform-ready.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "To solve this, I implemented a standard control flow structure using an if-else statement. 
 * I utilized a Scanner to dynamically accept two integers, A and B. The core logic relies on 
 * the relational operator 'greater than'. If A is strictly greater than B, the execution 
 * routes into the 'if' block to print A. Otherwise, control falls through to the 'else' block 
 * to print B. When preparing for technical rounds like the TCS NQT, I always make sure to 
 * structure even basic conditionals cleanly to avoid fall-through errors, and I am aware that 
 * for production code, we would also add an explicit check to handle the edge case where both 
 * numbers are completely equal."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The comparison operation (A > B) and the print statements take constant time, 
 * regardless of how large the numbers are.
 *
 * SPACE COMPLEXITY: O(1)
 * The memory used is restricted to two primitive integer variables (A and B) and 
 * the Scanner object, requiring a constant amount of auxiliary space on the stack.
 */