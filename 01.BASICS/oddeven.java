/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to check whether a given integer is even or odd. 
 * The program should read the number from the standard input, use the 
 * modulus operator to check divisibility by 2, and print the result.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer number.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single string: "even" if the number is divisible by 2, otherwise "odd".
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Example 1:
 * Input: 8
 * Working:
 * 1. number = 8
 * 2. Evaluate 8 % 2. The remainder of 8 divided by 2 is 0.
 * 3. Check condition (0 == 0) -> TRUE.
 * 4. Print "even".
 * Output: even
 *
 * Example 2:
 * Input: 7
 * Working:
 * 1. number = 7
 * 2. Evaluate 7 % 2. The remainder of 7 divided by 2 is 1.
 * 3. Check condition (1 == 0) -> FALSE.
 * 4. Move to the else block.
 * 5. Print "odd".
 * Output: odd
 */

import java.util.Scanner; 

public class oddeven { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to capture user input from the console
        Scanner sc = new Scanner(System.in); 
        
        // Safety check to ensure there is an integer to read
        if (!sc.hasNextInt()) return; 
        
        // 2. Read the integer input from the user
        int number = sc.nextInt(); 
        
        // 3. Decision Making: Check divisibility by 2 using the modulus operator (%)
        // The modulus operator gives the remainder of a division operation.
        if (number % 2 == 0) { 
            // 4. If the remainder is exactly 0, the condition is true. The number is even.
            System.out.println("even"); 
        } 
        else { 
            // 5. If the remainder is not 0 (it will be 1 or -1), the condition is false. The number is odd.
            System.out.println("odd"); 
        }

        // 6. Close the scanner to release system resources
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Modulus (%) vs Division (/): Beginners often confuse these. `7 / 2` gives the 
 * quotient (3), while `7 % 2` gives the remainder (1). For even/odd checks, you 
 * must always use the modulus operator to check the remainder.
 * 2. Equality Operator (==): Be careful not to use a single equals sign (`number % 2 = 0`). 
 * A single `=` is for assignment, while double `==` is for comparison. Java will throw 
 * a compilation error if you use assignment inside an `if` condition.
 * 3. Negative Numbers: In Java, the modulo operation on negative odd numbers (e.g., -5 % 2) 
 * results in -1, not 1. However, the logic `number % 2 == 0` still perfectly captures all 
 * even numbers (since -4 % 2 is still 0), making this approach robust.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "As a final-year IT student actively preparing for strict technical assessments like 
 * the TCS NQT, I ensure my fundamental logic is solid and error-free. To determine if a 
 * number is even or odd, I utilized the modulus operator (`%`). I take the user's input 
 * via the Scanner class and evaluate `number % 2 == 0`. If the remainder of the division 
 * by 2 is zero, it executes the 'if' block to print 'even'. Otherwise, it falls through 
 * to the 'else' block and prints 'odd'. This approach is strictly O(1) in both time and space, 
 * making it highly optimal."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The modulus calculation and conditional check execute in constant time, regardless 
 * of how large the integer is.
 *
 * SPACE COMPLEXITY: O(1)
 * Memory allocation is restricted to a single primitive variable (`number`) and the 
 * Scanner object instance, requiring a constant amount of auxiliary space.
 */