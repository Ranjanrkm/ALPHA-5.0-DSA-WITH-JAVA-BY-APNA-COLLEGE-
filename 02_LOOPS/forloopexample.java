/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate the use of
 * a for loop.
 *
 * The program should:
 * - Execute a loop from 1 to 10.
 * - Print "Hello World" during each iteration.
 *
 * This program demonstrates:
 * - for loop syntax
 * - Loop initialization
 * - Loop condition
 * - Loop update statement
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print:
 *
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 *
 * (Printed 10 times)
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Loop:
 *
 * for(int i = 1; i <= 10; i++)
 *
 * Step-by-step working:
 *
 * Iteration 1:
 * i = 1
 * Condition: 1 <= 10 -> TRUE
 * Print "Hello World"
 *
 * Iteration 2:
 * i = 2
 * Condition: 2 <= 10 -> TRUE
 * Print "Hello World"
 *
 * Iteration 3:
 * i = 3
 * Condition: 3 <= 10 -> TRUE
 * Print "Hello World"
 *
 * ...
 *
 * Iteration 10:
 * i = 10
 * Condition: 10 <= 10 -> TRUE
 * Print "Hello World"
 *
 * Next:
 * i becomes 11
 *
 * Condition:
 * 11 <= 10 -> FALSE
 *
 * Loop terminates.
 *
 * ==========================================
 * Final Output:
 * ==========================================
 *
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 */

public class forloopexample {

    public static void main(String args[]) {

        /*
         * for loop syntax:
         *
         * for(initialization; condition; update)
         * {
         *      // statements
         * }
         */

        // Loop runs from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Print message during each iteration
            System.out.println("Hello World");
        }
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. A for loop contains three parts:
 *
 *    Initialization:
 *    int i = 1;
 *
 *    Condition:
 *    i <= 10;
 *
 *    Update:
 *    i++;
 *
 * 2. Initialization executes only once.
 *
 * 3. Condition is checked before every iteration.
 *
 * 4. Update executes after every iteration.
 *
 * 5. Loop terminates when condition becomes FALSE.
 *
 * ==========================================
 * FOR LOOP FLOW:
 * ==========================================
 *
 * Step 1:
 * Initialization
 *
 * Step 2:
 * Condition Check
 *
 * Step 3:
 * Execute Loop Body
 *
 * Step 4:
 * Update Variable
 *
 * Step 5:
 * Repeat until condition becomes FALSE
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Using wrong condition.
 *
 * Example:
 *
 * for(int i = 1; i < 10; i++)
 *
 * Output:
 * Hello World printed only 9 times.
 *
 * 2. Forgetting update statement.
 *
 * Example:
 *
 * for(int i = 1; i <= 10;)
 *
 * This may create an infinite loop.
 *
 * 3. Using semicolon after for loop.
 *
 * Wrong:
 *
 * for(int i = 1; i <= 10; i++);
 * {
 *     System.out.println("Hello World");
 * }
 *
 * 4. Incorrect loop boundary.
 *
 * Always verify whether the problem requires:
 *
 * i < n
 *
 * OR
 *
 * i <= n
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the use of a for loop
 * in Java. The loop starts with i = 1 and continues
 * until i becomes greater than 10.
 * During each iteration, the program prints
 * 'Hello World'. Since the loop runs 10 times,
 * the message is printed exactly 10 times.
 * The for loop is commonly used when the number
 * of iterations is known beforehand."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(n)
 *
 * Here:
 * n = 10
 *
 * The loop executes 10 times.
 *
 * In general:
 * O(n)
 *
 * ==========================================
 *
 * SPACE COMPLEXITY: O(1)
 *
 * Only one loop variable (i) is used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: When should we use a for loop?
 *
 * Answer:
 * A for loop should be used when the number
 * of iterations is known in advance.
 *
 * Examples:
 * - Print numbers from 1 to 100
 * - Traverse an array
 * - Generate multiplication tables
 */