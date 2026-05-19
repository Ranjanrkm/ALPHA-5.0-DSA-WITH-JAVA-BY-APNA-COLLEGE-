/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a basic Java program to calculate the sum of two numbers. 
 * The program should read two integers, use the arithmetic addition 
 * operator (+) to find their sum, and print the final result.
 * * (Note: Upgraded from hardcoded variables to dynamic Scanner input 
 * to align with standard competitive coding practices like TCS NQT).
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - Two space-separated or newline-separated integers representing 'a' and 'b'.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single integer representing the sum of the two inputs.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 10 5
 *
 * Step-by-step working:
 * 1. Initialize Scanner to read input.
 * 2. Read first integer into 'a' -> a = 10.
 * 3. Read second integer into 'b' -> b = 5.
 * 4. Add the two integers: 10 + 5 = 15.
 * 5. Store the result in the variable 'sum' -> sum = 15.
 * 6. Print the value of 'sum'.
 *
 * Output:
 * 15
 */

import java.util.Scanner; 

public class sumab { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to capture user input from the console
        Scanner sc = new Scanner(System.in); 
        
        // Safety check to ensure there is input available to read
        if (!sc.hasNextInt()) return; 
        
        // 2. Read the first integer value dynamically
        int a = sc.nextInt(); 
        
        // 3. Read the second integer value dynamically
        int b = sc.nextInt(); 
        
        // 4. Calculate the sum using the addition operator (+)
        int sum = a + b; 
        
        // 5. Print the final calculated sum to the console
        System.out.println(sum); 

        // 6. Close the scanner to release system resources
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Arithmetic Operators: The `+` operator is used for addition in Java. 
 * If used with Strings, it performs concatenation instead of mathematical addition.
 * 2. Integer Overflow Warning: While `int` is sufficient for small numbers 
 * (up to ~2.14 billion), adding two very large integers can exceed this limit 
 * and cause an overflow (resulting in a negative number). If large constraints 
 * are given in an assessment, always declare `sum` as a `long` and cast the addition: 
 * `long sum = (long) a + b;`.
 * 3. Dynamic vs Hardcoded: Avoid hardcoding values (like `int a = 10;`) when 
 * preparing for technical tests. Always practice using `Scanner` or `BufferedReader` 
 * as platforms use hidden test cases with variable inputs to evaluate your code.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This code demonstrates a fundamental arithmetic operation in Java. Instead of 
 * hardcoding the variables, I instantiated a `Scanner` object to dynamically capture 
 * two integers from the standard input stream. I stored these inputs in variables 
 * 'a' and 'b', computed their sum using the addition operator, and stored the result 
 * in a separate integer variable called 'sum'. Finally, I printed the result using 
 * standard output. I also ensure to close the Scanner at the end to maintain good 
 * memory management practices."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The input reading, addition operation, and printing all execute in constant time.
 *
 * SPACE COMPLEXITY: O(1)
 * The program only allocates memory for three primitive integer variables 
 * (`a`, `b`, `sum`) and the Scanner object, requiring a constant amount of auxiliary space.
 */