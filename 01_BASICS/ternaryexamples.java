/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to check whether a given integer is even or odd using the 
 * Ternary Operator (? :). The program should dynamically read an integer from the user 
 * and evaluate the condition inline, demonstrating a concise and professional 
 * alternative to the traditional if-else block.
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
 * Input: 4
 * Working:
 * 1. Initialize Scanner and read input -> number = 4.
 * 2. Evaluate condition: (4 % 2 == 0) -> TRUE.
 * 3. Because it is TRUE, the ternary operator selects the first value: "even".
 * 4. Assign "even" to the 'result' string.
 * 5. Print "even".
 * Output: even
 *
 * Example 2:
 * Input: 7
 * Working:
 * 1. Read input -> number = 7.
 * 2. Evaluate condition: (7 % 2 == 0) -> FALSE.
 * 3. Because it is FALSE, the ternary operator selects the second value: "odd".
 * 4. Assign "odd" to the 'result' string.
 * 5. Print "odd".
 * Output: odd
 */

import java.util.Scanner;

public class ternaryexamples { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to capture user input from the console
        Scanner sc = new Scanner(System.in); 
        
        // Safety check to ensure there is an integer to read
        if (!sc.hasNextInt()) return; 
        
        // 2. Read the integer input dynamically from the user
        int number = sc.nextInt(); 
        
        // 3. Decision Making using the Ternary Operator (? :)
        // Syntax: condition ? valueIfTrue : valueIfFalse;
        // It evaluates if (number % 2 == 0). If true, it returns "even". If false, it returns "odd".
        String result = (number % 2 == 0) ? "even" : "odd"; 
        
        // 4. Print the dynamically assigned result to the console
        System.out.println(result); 
        
        // 5. Close the scanner to release system resources
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Ternary Syntax: `variable = (condition) ? expressionTrue : expressionFalse;`. 
 * It is called "ternary" because it takes exactly three operands: a boolean condition, 
 * a result for true, and a result for false.
 * 2. Clean Code: The ternary operator is an excellent way to replace a 4-to-5 line 
 * `if-else` statement with a single, readable line of code. It is highly preferred 
 * in enterprise codebases for simple conditional assignments.
 * 3. Same Data Type Rule: Both expressions (`expressionTrue` and `expressionFalse`) 
 * must return a value that matches or can be implicitly cast to the variable's data type 
 * (in this case, both "even" and "odd" are Strings).
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "In this program, I implemented an even/odd checker. Instead of writing a verbose 
 * traditional if-else block, I utilized Java's ternary operator to keep the code 
 * clean and concise. After reading the integer input using a Scanner, the ternary 
 * operator evaluates the modulus condition inline. If the remainder is zero, it directly 
 * assigns the string 'even' to the result variable; otherwise, it assigns 'odd'. 
 * This approach reduces boilerplate code while maintaining perfect readability."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The modulus operation and the ternary evaluation execute in constant time, regardless 
 * of the input size.
 *
 * SPACE COMPLEXITY: O(1)
 * Memory allocation is restricted to a primitive integer (`number`), a String reference 
 * (`result`), and the Scanner object, requiring a constant amount of auxiliary space.
 */