/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to categorize a person based on their age.
 * The program should read an integer input representing age and print:
 * - "adult : drive, vote" if age is 18 or above.
 * - "teenager" if age is between 13 and 17 (inclusive).
 * - "child" if age is below 13.
 * This demonstrates the fundamental use of the if - else if - else ladder.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer representing the age.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single string categorizing the age group based on the conditions.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 16
 *
 * Step-by-step working:
 * 1. Initialize Scanner.
 * 2. Read integer into 'age'. (age = 16)
 * 3. Evaluate first condition: if (age >= 18) -> 16 >= 18 is FALSE.
 * 4. Move to next condition: else if (age >= 13 && age < 18)
 * -> (16 >= 13) is TRUE AND (16 < 18) is TRUE.
 * -> TRUE && TRUE = TRUE.
 * 5. Execute block for the true condition: Print "teenager".
 * 6. Skip the remaining 'else' block.
 *
 * Output:
 * teenager
 */

import java.util.Scanner; 

public class elseifexamples { 

    public static void main(String[] args) { 
        
        // 1. Initialize Scanner to read input from the console
        Scanner sc = new Scanner(System.in); 
        
        // 2. Read the integer input representing age
        if (!sc.hasNextInt()) return; // Safety check
        int age = sc.nextInt(); 
        
        // 3. Conditional Ladder begins
        // Check if the person is an adult (18 or older)
        if (age >= 18) { 
            System.out.println("adult : drive, vote"); 
        } 
        // 4. If the first condition was false, check if the person is a teenager
        // The && (Logical AND) ensures BOTH conditions must be met.
        else if (age >= 13 && age < 18) { 
            System.out.println("teenager"); 
        } 
        // 5. If all previous conditions were false, this block acts as the default fallback
        else { 
            System.out.println("child"); 
        }

        // 6. Close scanner to release system resources
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. The If-Else Ladder: Java evaluates `if - else if - else` conditions top-to-bottom. 
 * As soon as one condition evaluates to `true`, its corresponding block executes, and 
 * the rest of the ladder is completely skipped.
 * 2. Logical Operators: The `&&` (Logical AND) operator is crucial here. `age >= 13 && age < 18` 
 * ensures the age falls strictly within that range. (Note: Because of the top-to-bottom 
 * evaluation, simply writing `else if (age >= 13)` would also work here because the >= 18 
 * case was already caught, but explicitly defining the bounds is safer and more readable).
 * 3. The Fallback: The final `else` statement does not take a condition. It catches 
 * everything that falls through the cracks of the previous checks.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates standard control flow using an if-else if-else ladder. 
 * I utilize a Scanner to capture the user's age as an integer. The logic flows sequentially: 
 * it first checks if the age is 18 or greater to classify as an adult. If that fails, it 
 * evaluates if the age sits within the 13-to-17 bound using a logical AND operator to classify 
 * as a teenager. Finally, an unconditioned 'else' block acts as a catch-all for any remaining 
 * inputs, classifying them as children. This structure guarantees that only one specific 
 * block of code will execute per input."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The condition checks and print statements execute in constant time regardless of the input size.
 *
 * SPACE COMPLEXITY: O(1)
 * The memory used is restricted to a single primitive variable (`age`) and the Scanner object.
 */