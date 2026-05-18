/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to print an inverted right-angled triangle star pattern. 
 * While a beginner might hardcode the output using multiple `System.out.println()` 
 * statements, strict coding assessments (like TCS NQT) require dynamic solutions 
 * that can handle any number of rows (N) using nested loops.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer 'N' representing the number of rows for the pattern.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - An inverted star pattern consisting of 'N' rows.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 4
 *
 * Step-by-step working:
 * 1. Read N = 4.
 * 2. Outer loop 'i' runs from 4 down to 1.
 * - i = 4: Inner loop 'j' runs 4 times -> Prints "****", then newline.
 * - i = 3: Inner loop 'j' runs 3 times -> Prints "***", then newline.
 * - i = 2: Inner loop 'j' runs 2 times -> Prints "**", then newline.
 * - i = 1: Inner loop 'j' runs 1 time  -> Prints "*", then newline.
 * 3. Loop terminates.
 *
 * Output:
 * ****
 * ***
 * **
 * *
 */

import java.util.Scanner;

public class printpattern { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to read dynamic input from the user
        Scanner sc = new Scanner(System.in);
        
        // Safety check to ensure valid integer input
        if (!sc.hasNextInt()) return;
        
        // 2. Read the number of rows (N)
        int n = sc.nextInt();
        
        // 3. Outer Loop: Controls the number of rows.
        // It starts at 'N' and decreases by 1 until it reaches 1.
        for (int i = n; i >= 1; i--) {
            
            // 4. Inner Loop: Controls the number of columns (stars) per row.
            // It prints exactly 'i' stars on the current line.
            for (int j = 1; j <= i; j++) {
                // Use print() instead of println() to keep stars on the same line
                System.out.print("*");
            }
            
            // 5. After printing all stars for the current row, move to the next line
            System.out.println();
        }
        
        // 6. Close the scanner to prevent resource leaks
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Hardcoding vs. Dynamic Logic: The original code used hardcoded sequential 
 * `println` statements. While excellent for understanding basic execution flow, 
 * it fails immediately in competitive programming if the hidden test case passes 
 * N = 50. Always upgrade patterns to use nested loops.
 * 2. Nested Loops Rule: In pattern programming, the OUTER loop generally handles 
 * the rows (newlines), and the INNER loop handles the columns (the characters 
 * printed on that specific row).
 * 3. print() vs println(): `System.out.print("*")` is critical inside the inner 
 * loop to build the string horizontally. `System.out.println()` is placed exactly 
 * outside the inner loop to drop down to the next row.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "To solve this pattern problem, I transitioned from hardcoded print statements 
 * to a dynamic nested-loop architecture, which is mandatory for passing variable 
 * test cases in technical assessments. I utilized a Scanner to take the row count 'N' 
 * as input. The outer loop dictates the number of rows, decrementing from N down to 1. 
 * The inner loop is responsible for printing the asterisks horizontally on the same 
 * line using `System.out.print()`. Once the inner loop completes its iterations for a 
 * given row, an empty `System.out.println()` executes to move the cursor to the next 
 * line, perfectly forming the inverted triangle structure."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(N^2)
 * For N rows, the inner loop runs N times, then N-1, then N-2... down to 1. 
 * The sum of the first N integers is N(N+1)/2, which simplifies to an O(N^2) time complexity.
 *
 * SPACE COMPLEXITY: O(1)
 * The algorithm only uses a few integer variables (n, i, j) for looping, requiring 
 * constant auxiliary space regardless of how large N is.
 */