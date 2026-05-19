/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate the usage of all six relational 
 * (comparison) operators: equal to (==), not equal to (!=), greater than (>), 
 * less than (<), less than or equal to (<=), and greater than or equal to (>=). 
 * The program should compare two integer variables and output the resulting 
 * boolean values (true or false).
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - No dynamic input is required for this demonstration. 
 * - Values are hardcoded as a = 10 and b = 5.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Six boolean values (`true` or `false`) printed on separate lines, 
 * corresponding to the results of each relational comparison.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial State:
 * a = 10
 * b = 5
 *
 * Step-by-step working:
 * 1. (a == b) -> (10 == 5) -> FALSE
 * 2. (a != b) -> (10 != 5) -> TRUE
 * 3. (a > b)  -> (10 > 5)  -> TRUE
 * 4. (a < b)  -> (10 < 5)  -> FALSE
 * 5. (a <= b) -> (10 <= 5) -> FALSE
 * 6. (a >= b) -> (10 >= 5) -> TRUE
 *
 * Output:
 * false
 * true
 * true
 * false
 * false
 * true
 */

public class relationaloperators { 

    public static void main(String[] args) { 
        
        // 1. Initialize two integer variables for comparison
        int a = 10; 
        int b = 5; 
        
        // 2. EQUAL TO (==)
        // Checks if 'a' and 'b' hold the exact same value.
        System.out.println(a == b); 
        
        // 3. NOT EQUAL TO (!=)
        // Checks if 'a' and 'b' hold different values.
        System.out.println(a != b); 
        
        // 4. GREATER THAN (>)
        // Checks if the left operand ('a') is strictly larger than the right operand ('b').
        System.out.println(a > b); 
        
        // 5. LESS THAN (<)
        // Checks if the left operand ('a') is strictly smaller than the right operand ('b').
        System.out.println(a < b); 
        
        // 6. LESS THAN OR EQUAL TO (<=)
        // Checks if 'a' is smaller than OR exactly equal to 'b'.
        System.out.println(a <= b); 
        
        // 7. GREATER THAN OR EQUAL TO (>=)
        // Checks if 'a' is larger than OR exactly equal to 'b'.
        System.out.println(a >= b); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Assignment (=) vs. Equality (==): A critical beginner mistake is writing 
 * `if (a = b)`. A single equals sign assigns a value, whereas double equals 
 * `==` compares two values. In Java, `a = b` evaluates to an integer, which 
 * causes a compilation error inside an `if` statement that expects a boolean.
 * 2. Boolean Results: Relational operators in Java ALWAYS evaluate to a `boolean` 
 * type (`true` or `false`). They cannot evaluate to 1 or 0 like in C/C++.
 * 3. Syntax Typos: Be careful with the two-character operators. `=>` and `=<` 
 * are invalid in Java and will cause syntax errors. Always write the angle 
 * bracket first: `>=` and `<=`.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program serves as a foundational reference for relational operators in Java. 
 * I initialized two integer variables and systematically evaluated them against all 
 * six comparison operators: equal to, not equal to, greater than, less than, less 
 * than or equal to, and greater than or equal to. By executing these checks, I 
 * demonstrated that relational expressions in Java evaluate directly to strict boolean 
 * values (true or false). Understanding these operators perfectly is crucial, as they 
 * form the backbone of all condition-based logic and loops in software engineering."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The comparisons and print statements execute in constant time regardless of the 
 * values of the variables.
 *
 * SPACE COMPLEXITY: O(1)
 * The memory used is restricted to two primitive integer variables (`a` and `b`), 
 * requiring a constant amount of auxiliary space.
 */