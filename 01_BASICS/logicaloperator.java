/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate the functionality of Logical Operators: 
 * AND (&&), OR (||), and NOT (!). The program should evaluate various 
 * relational expressions combining true and false conditions, and print the 
 * resulting boolean values to the console.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - No dynamic input is required for this demonstration. Values are hardcoded.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A series of boolean values (`true` or `false`) representing the results 
 * of the evaluated logical expressions.
 *
 * ==========================================
 * Dry Run Examples:
 * ==========================================
 * Example 1 (Logical AND):
 * Expression: (3 > 2) && (5 < 0)
 * Step 1: Evaluate (3 > 2) -> TRUE
 * Step 2: Evaluate (5 < 0) -> FALSE
 * Step 3: TRUE && FALSE
 * Result: false (AND requires BOTH to be true)
 *
 * Example 2 (Logical OR):
 * Expression: (3 < 2) || (5 > 0)
 * Step 1: Evaluate (3 < 2) -> FALSE
 * Step 2: Evaluate (5 > 0) -> TRUE
 * Step 3: FALSE || TRUE
 * Result: true (OR requires AT LEAST ONE to be true)
 */

public class logicaloperator { 

    public static void main(String[] args) { 
        
        System.out.println("--- LOGICAL AND (&&) ---");
        // AND returns true ONLY when BOTH conditions are true.
        
        System.out.println((3 > 2) && (5 > 0)); // true && true   -> Output: true
        System.out.println((3 < 2) && (5 > 0)); // false && true  -> Output: false
        System.out.println((3 < 2) && (5 < 0)); // false && false -> Output: false
        System.out.println((3 > 2) && (5 < 0)); // true && false  -> Output: false


        System.out.println("\n--- LOGICAL OR (||) ---");
        // OR returns true if AT LEAST ONE condition is true.
        
        System.out.println((3 > 2) || (5 > 0)); // true || true   -> Output: true
        System.out.println((3 < 2) || (5 > 0)); // false || true  -> Output: true
        System.out.println((3 < 2) || (5 < 0)); // false || false -> Output: false
        System.out.println((3 > 2) || (5 < 0)); // true || false  -> Output: true


        System.out.println("\n--- LOGICAL NOT (!) ---");
        // NOT reverses the boolean result (true becomes false, false becomes true).
        
        System.out.println(!(3 > 2)); // !(true)  -> Output: false
        System.out.println(!(3 < 2)); // !(false) -> Output: true
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Short-Circuit Evaluation: 
 * - In an AND (&&) operation, if the first condition is FALSE, Java skips checking 
 * the second condition entirely because the overall result will always be false.
 * - In an OR (||) operation, if the first condition is TRUE, Java skips checking 
 * the second condition because the overall result will always be true.
 * This makes your code run faster and prevents potential errors (like dividing by zero).
 * 2. Don't confuse logical operators with bitwise operators: 
 * - && (Logical AND) vs & (Bitwise AND)
 * - || (Logical OR) vs | (Bitwise OR)
 * 3. Operator Precedence: The NOT (!) operator has very high precedence. Always use 
 * parentheses carefully. For example, `!true && false` evaluates `!true` first.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program serves as a foundational reference for boolean logic in Java using 
 * logical operators. I structured the code to test all possible truth-table combinations 
 * (true/true, true/false, false/true, false/false) for both the logical AND (&&) and 
 * logical OR (||) operators. Finally, I demonstrated the unary NOT (!) operator which 
 * inverts boolean values. A key concept I keep in mind here for performance and safety 
 * in real-world applications is 'short-circuit evaluation', where Java optimizes execution 
 * by skipping unnecessary right-hand evaluations."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * All relational checks and logical evaluations take constant time, independent of 
 * any variable size.
 *
 * SPACE COMPLEXITY: O(1)
 * The program executes in-place without dynamically allocating any extra memory.
 */