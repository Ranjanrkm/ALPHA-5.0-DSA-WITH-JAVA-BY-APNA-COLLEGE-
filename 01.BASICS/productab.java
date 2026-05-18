/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to calculate the product of two numbers. The program 
 * must read two integers from the standard input, multiply them using the 
 * arithmetic '*' operator, and print the resulting product. To ensure robustness 
 * for strict coding assessments, handle potential integer overflow by storing 
 * the result in a larger data type.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - Two space-separated or newline-separated integers representing 'a' and 'b'.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single number representing the product of the two inputs.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 5 4
 *
 * Step-by-step working:
 * 1. Initialize Scanner to read input.
 * 2. Read the first integer into 'a' -> a = 5.
 * 3. Read the second integer into 'b' -> b = 4.
 * 4. Multiply 'a' and 'b'. To prevent overflow, explicitly cast to long: (long) 5 * 4.
 * 5. Store the result in 'product' -> product = 20.
 * 6. Print the product.
 *
 * Output:
 * 20
 */

import java.util.Scanner; 

public class productab { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to capture user input from the console
        Scanner sc = new Scanner(System.in); 
        
        // Safety check to ensure there are integers to read
        if (!sc.hasNextInt()) return; 
        
        // 2. Read the two integer values dynamically
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        
        // 3. Calculate the product. 
        // PRO TIP: Multiplying two large 32-bit integers can exceed the maximum limit 
        // of an 'int' (approx 2.14 billion). By casting 'a' to a 'long' (64-bit) 
        // before multiplying, we safely prevent integer overflow in hidden test cases.
        long product = (long) a * b; 
        
        // 4. Print the final calculated product
        System.out.println(product); 

        // 5. Close the scanner to release system resources
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. The Integer Overflow Trap: In competitive programming, inputs for basic multiplication 
 * can be as large as 10^5. If a = 100,000 and b = 100,000, their product is 10,000,000,000. 
 * This completely blows past the standard `int` limit of 2,147,483,647 and will output a 
 * completely wrong negative number due to overflow. Always store products in a `long`.
 * 2. Explicit Casting Order: Note the syntax `(long) a * b`. This casts 'a' to a long FIRST, 
 * forcing the multiplication to happen in 64-bit space. If you wrote `(long) (a * b)`, the 
 * multiplication would happen in 32-bit space (overflowing), and THEN cast the already-corrupted 
 * result to a long, defeating the purpose entirely.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "As a final-year IT student preparing for technical rounds like the TCS NQT, I approach 
 * even basic arithmetic problems with edge cases in mind. To calculate the product of two 
 * numbers, I capture the inputs using a Scanner. However, instead of storing the result 
 * directly into a standard integer, I explicitly cast the first operand to a 64-bit `long` 
 * before multiplying. This guarantees that if the platform passes large hidden test cases 
 * that would normally cause a 32-bit integer overflow, the code will seamlessly handle the 
 * math and print the accurate product."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The multiplication operation executes in constant time regardless of the input values.
 *
 * SPACE COMPLEXITY: O(1)
 * Memory usage is strictly limited to three primitive variables (`a`, `b`, `product`) 
 * and the Scanner object, requiring O(1) auxiliary space on the execution stack.
 */