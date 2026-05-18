/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Demonstrate how to read standard input in Java using the `Scanner` class.
 * This program acts as a reference guide for capturing various data types 
 * (words, lines, integers, decimals) from the user. The active portion of 
 * the code specifically reads a single floating-point number and prints it back.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single decimal number (float).
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - The exact decimal number printed back to the console.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 12.5
 *
 * Step-by-step working:
 * 1. Initialize the Scanner object to read from System.in.
 * 2. The program pauses and waits for user input.
 * 3. The user types "12.5" and presses Enter.
 * 4. sc.nextFloat() parses the input as a float and stores it in 'price'. (price = 12.5f)
 * 5. System.out.println(price) outputs the value to the screen.
 *
 * Output:
 * 12.5
 */

import java.util.Scanner; 

public class input { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to read input from the standard input stream (keyboard)[cite: 1322].
        Scanner sc = new Scanner(System.in); 
        
        /*
         * ---------------------------------------------------------
         * REFERENCE: Common Scanner Methods (Commented Out)
         * ---------------------------------------------------------
         * String word = sc.next();       // Reads a single word (stops at the first space).
         * String line = sc.nextLine();   // Reads an entire line of text (stops at Enter key).
         * int number = sc.nextInt();     // Reads a whole number.
         */
        
        // 2. Read one decimal number as a float.
        // Using hasNextFloat() is a good practice to prevent InputMismatchException if the user types letters.
        if (sc.hasNextFloat()) {
            float price = sc.nextFloat(); 
            
            // 3. Print the captured value back to the console.
            System.out.println(price); 
        }
        
        // 4. Always close the Scanner after use to prevent memory and resource leaks.
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Precision Formatting: In competitive programming platforms (like TCS NQT), 
 * decimal formatting must often be exact. If a question asks for exactly 2 decimal 
 * places, use `System.out.printf("%.2f\n", price);` instead of `println`[cite: 1428, 1594].
 * 2. The "Scanner Bug" Trap: A very common beginner mistake is calling `sc.nextInt()` 
 * or `sc.nextFloat()` and immediately following it with `sc.nextLine()`. The numeric 
 * methods read the number but leave the newline character ('\n' or Enter key) in the 
 * buffer[cite: 1447]. The subsequent `nextLine()` will instantly consume that newline and 
 * return an empty string[cite: 1446]. 
 * FIX: Always add a blank `sc.nextLine();` after reading numbers if you plan to read 
 * full strings next[cite: 1448, 1452].
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This is a foundational program demonstrating standard input handling in Java 
 * using the `java.util.Scanner` class. I instantiated a Scanner object wrapped around 
 * `System.in` to parse the input stream. For this specific demonstration, I used 
 * `nextFloat()` to safely capture a decimal value. I also made sure to close the Scanner at 
 * the end of the program to prevent resource leaks. If this were a strict coding assessment, 
 * I would adapt the output using `System.out.printf` to guarantee strict decimal precision."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Reading a single primitive value from the console and printing it executes in constant time.
 *
 * SPACE COMPLEXITY: O(1)
 * The program only allocates memory for a single primitive float variable (`price`) and 
 * the `Scanner` object, requiring a constant amount of auxiliary space.
 */