/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to calculate the sum of two numbers provided dynamically 
 * by the user. The program must read two integers from the standard input stream, 
 * compute their sum using the addition operator (+), and print the final result.
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
 * 15 25
 *
 * Step-by-step working:
 * 1. Initialize Scanner to read input from the console.
 * 2. Read the first integer into 'a' -> a = 15.
 * 3. Read the second integer into 'b' -> b = 25.
 * 4. Add the two integers. To prevent overflow in strict test cases, cast to long: (long) 15 + 25.
 * 5. Store the result in the variable 'sum' -> sum = 40.
 * 6. Print the value of 'sum'.
 *
 * Output:
 * 40
 */

import java.util.Scanner; 

public class sumabinput { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to capture user input from the standard input stream
        Scanner sc = new Scanner(System.in); 
        
        // Safety check to ensure there is input available to read
        if (!sc.hasNextInt()) return; 
        
        // 2. Read the first integer value dynamically
        int a = sc.nextInt(); 
        
        // 3. Read the second integer value dynamically
        int b = sc.nextInt(); 
        
        // 4. Calculate the sum using the addition operator (+).
        // PRO TIP: While 'int' is fine for basic numbers, adding two large 32-bit integers 
        // can cause an overflow. Using a 64-bit 'long' guarantees safety in competitive programming.
        long sum = (long) a + b; 
        
        // 5. Print the final calculated sum to the console
        System.out.println(sum); 

        // 6. Close the scanner to release system resources and prevent memory leaks
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Dynamic Input Processing: Unlike hardcoded variables, using `Scanner.nextInt()` 
 * makes the program pause and wait for the user (or the automated testing platform) 
 * to provide data. This is the absolute standard for platforms like TCS NQT, HackerRank, etc.
 * 2. The Integer Overflow Trap: The maximum value of an `int` in Java is ~2.14 billion. 
 * If a = 2,000,000,000 and b = 2,000,000,000, their sum exceeds this limit, resulting in 
 * a negative garbage value due to integer overflow. Promoting the operation to a `long` 
 * (as done above with `(long) a + b`) is a premium safeguard for hidden test cases.
 * 3. Resource Management: Always execute `sc.close()` at the end of your program. 
 * Leaving standard input streams open can cause resource leaks in larger enterprise applications.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This code demonstrates dynamic standard input handling to perform basic arithmetic. 
 * I utilized the `java.util.Scanner` class to read two integer tokens sequentially. 
 * To ensure the code is production-ready and immune to boundary failures (like integer overflow 
 * during large input additions), I cast the addition operation into a 64-bit `long` before 
 * storing and printing the result. Finally, I close the Scanner to adhere to standard memory 
 * management protocols."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Capturing the inputs from the buffer, performing the addition, and printing the result 
 * all execute in constant time.
 *
 * SPACE COMPLEXITY: O(1)
 * The algorithm only allocates memory for three primitive variables (`a`, `b`, `sum`) 
 * and the Scanner instance, requiring a fixed, constant amount of auxiliary space.
 */