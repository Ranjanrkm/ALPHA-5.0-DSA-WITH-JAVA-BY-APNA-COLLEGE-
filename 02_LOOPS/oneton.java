import java.util.*;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to print numbers from 1 to N.
 *
 * The program should:
 * - Take a positive integer N as input from the user.
 * - Print all numbers from 1 to N using a while loop.
 * - Display the numbers in a single line separated by spaces.
 *
 * This program demonstrates:
 * - User Input using Scanner
 * - while loop
 * - Counter variable
 * - Sequential number generation
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer N representing the range.
 *
 * Example:
 * 10
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print numbers from 1 to N separated by spaces.
 *
 * Example:
 * 1 2 3 4 5 6 7 8 9 10
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 5
 *
 * Step-by-step working:
 *
 * Step 1:
 * Read input value.
 *
 * range = 5
 *
 * Step 2:
 * Initialize counter.
 *
 * counter = 1
 *
 * Step 3:
 * Check condition:
 *
 * counter <= range
 *
 * 1 <= 5 -> TRUE
 *
 * Print:
 * 1
 *
 * counter becomes 2
 *
 * ------------------------------------------
 *
 * Step 4:
 *
 * 2 <= 5 -> TRUE
 *
 * Print:
 * 2
 *
 * counter becomes 3
 *
 * ------------------------------------------
 *
 * Step 5:
 *
 * 3 <= 5 -> TRUE
 *
 * Print:
 * 3
 *
 * counter becomes 4
 *
 * ------------------------------------------
 *
 * Step 6:
 *
 * 4 <= 5 -> TRUE
 *
 * Print:
 * 4
 *
 * counter becomes 5
 *
 * ------------------------------------------
 *
 * Step 7:
 *
 * 5 <= 5 -> TRUE
 *
 * Print:
 * 5
 *
 * counter becomes 6
 *
 * ------------------------------------------
 *
 * Step 8:
 *
 * 6 <= 5 -> FALSE
 *
 * Loop terminates.
 *
 * Output:
 * 1 2 3 4 5
 */

public class oneton {

    public static void main(String args[]) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Safety check:
        // Prevents runtime error if input is invalid
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        // Read the range value from user
        int range = sc.nextInt();

        // Initialize counter variable
        int counter = 1;

        /*
         * while loop executes as long as
         * counter is less than or equal to range
         */
        while (counter <= range) {

            // Print current value of counter
            System.out.print(counter + " ");

            // Move to next number
            counter++;
        }

        // Move cursor to next line after printing
        System.out.println();

        // Close Scanner object
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. A while loop is an Entry-Controlled Loop.
 *
 * 2. The condition is checked before
 *    entering the loop body.
 *
 * 3. If the condition is false initially,
 *    the loop will not execute even once.
 *
 * 4. Syntax:
 *
 *    while(condition) {
 *        statements;
 *    }
 *
 * 5. counter++ is very important.
 *
 * Without it:
 *
 * while(counter <= range) {
 *     System.out.print(counter);
 * }
 *
 * Infinite Loop occurs.
 *
 * ==========================================
 * WHILE LOOP FLOW:
 * ==========================================
 *
 * Step 1:
 * Initialization
 *
 * Step 2:
 * Condition Check
 *
 * Step 3:
 * Execute Statements
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
 * 1. Forgetting counter++.
 *
 * Result:
 * Infinite Loop
 *
 * 2. Using:
 *
 * counter < range
 *
 * instead of:
 *
 * counter <= range
 *
 * Example:
 *
 * range = 5
 *
 * Output:
 * 1 2 3 4
 *
 * Number 5 is skipped.
 *
 * 3. Printing each number using println()
 *    when the question requires
 *    output in a single line.
 *
 * Wrong:
 *
 * 1
 * 2
 * 3
 * 4
 * 5
 *
 * Correct:
 *
 * 1 2 3 4 5
 *
 * 4. Adding unnecessary prompts like:
 *
 * System.out.println("enter range:");
 *
 * In coding platforms such as:
 * - TCS NQT
 * - HackerRank
 * - CodeChef
 * - LeetCode
 *
 * Extra output can cause Wrong Answer.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program prints numbers from 1 to N
 * using a while loop.
 * I first take the range value as input from the user.
 * Then I initialize a counter variable with 1.
 * The while loop continues as long as the counter
 * is less than or equal to the range.
 * During each iteration, the current value is printed
 * and the counter is incremented.
 * This continues until all numbers from 1 to N
 * are displayed."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(N)
 *
 * The loop executes N times.
 *
 * Example:
 * N = 10
 *
 * Loop executes 10 times.
 *
 * ==========================================
 *
 * SPACE COMPLEXITY: O(1)
 *
 * Only two integer variables and
 * one Scanner object are used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: When should we use a while loop?
 *
 * Answer:
 * A while loop is used when the number
 * of iterations is not known beforehand
 * and execution depends on a condition.
 */
