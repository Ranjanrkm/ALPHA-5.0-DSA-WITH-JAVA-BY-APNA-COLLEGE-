/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program that continuously accepts
 * integer input from the user.
 *
 * Rules:
 * - If the entered number is divisible by 10,
 *   skip printing that number.
 * - Otherwise, print the number.
 * - The program continues forever because
 *   there is no break statement.
 *
 * This program demonstrates:
 * - Infinite Loop using do-while(true)
 * - continue statement
 * - User Input using Scanner
 * - Modulus Operator (%)
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - Multiple integer inputs entered by the user.
 *
 * Example:
 * 23
 * 50
 * 77
 * 90
 * 45
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Print only numbers that are NOT divisible by 10.
 *
 * Example Output:
 * number was :23
 * number was :77
 * number was :45
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 23
 * 50
 * 77
 * 90
 * 45
 *
 * Step-by-step working:
 *
 * Step 1:
 * User enters 23
 *
 * Check:
 * 23 % 10 = 3
 *
 * Condition:
 * 3 == 0 -> FALSE
 *
 * Print:
 * number was :23
 *
 * ------------------------------------------
 *
 * Step 2:
 * User enters 50
 *
 * Check:
 * 50 % 10 = 0
 *
 * Condition:
 * 0 == 0 -> TRUE
 *
 * continue executes
 *
 * Current iteration is skipped.
 *
 * Nothing gets printed.
 *
 * ------------------------------------------
 *
 * Step 3:
 * User enters 77
 *
 * Check:
 * 77 % 10 = 7
 *
 * Condition:
 * FALSE
 *
 * Print:
 * number was :77
 *
 * ------------------------------------------
 *
 * Step 4:
 * User enters 90
 *
 * Check:
 * 90 % 10 = 0
 *
 * continue executes.
 *
 * Nothing gets printed.
 *
 * ------------------------------------------
 *
 * Step 5:
 * User enters 45
 *
 * Check:
 * 45 % 10 = 5
 *
 * Print:
 * number was :45
 *
 * ==========================================
 * Important Observation:
 * ==========================================
 * The program NEVER stops by itself because
 * there is no break statement.
 *
 * User must terminate the program manually.
 *
 * VS Code Terminal:
 * Ctrl + C
 */

import java.util.*;

public class enteringnum1 {

    public static void main(String args[]) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        /*
         * Infinite loop
         * The loop will continue forever
         * until the user manually stops the program.
         */
        do {

            // Ask user to enter a number
            System.out.print("Enter your number : ");

            // Safety check:
            // Prevents runtime crash for invalid input
            if (!sc.hasNextInt()) {
                break;
            }

            // Read integer input
            int n = sc.nextInt();

            /*
             * Check whether number is divisible by 10
             */
            if (n % 10 == 0) {

                /*
                 * continue skips the remaining code
                 * of the current iteration and moves
                 * directly to the next iteration.
                 */
                continue;
            }

            // Print numbers that are NOT divisible by 10
            System.out.println("number was :" + n);

        } while (true);

        // Close Scanner object
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. continue statement skips the current iteration
 *    and immediately moves to the next iteration.
 *
 * 2. continue DOES NOT terminate the loop.
 *
 * 3. break terminates the loop.
 *
 * Example:
 *
 * break  -> Exit loop completely.
 * continue -> Skip current iteration only.
 *
 * 4. A number is divisible by 10 if:
 *
 *    number % 10 == 0
 *
 * Examples:
 *
 * 10 % 10 = 0
 * 20 % 10 = 0
 * 50 % 10 = 0
 *
 * 5. This program contains an infinite loop.
 *
 * Because:
 *
 * do {
 *     ...
 * } while(true);
 *
 * There is no explicit break condition.
 *
 * ==========================================
 * BREAK VS CONTINUE:
 * ==========================================
 *
 * break:
 *
 * if(n % 10 == 0) {
 *     break;
 * }
 *
 * Result:
 * Loop terminates immediately.
 *
 * ------------------------------------------
 *
 * continue:
 *
 * if(n % 10 == 0) {
 *     continue;
 * }
 *
 * Result:
 * Current iteration is skipped.
 * Loop continues normally.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Confusing break and continue.
 *
 * break:
 * Stops the loop completely.
 *
 * continue:
 * Skips only one iteration.
 *
 * 2. Forgetting that continue
 *    does NOT terminate the loop.
 *
 * 3. Writing code after continue
 *    expecting it to execute.
 *
 * Example:
 *
 * continue;
 * System.out.println("Hello");
 *
 * This becomes unreachable code.
 *
 * 4. Forgetting that this program
 *    runs forever until manually stopped.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the use of the
 * continue statement in Java.
 * The program continuously accepts integer input
 * using an infinite do-while loop.
 * Whenever a number divisible by 10 is entered,
 * the continue statement skips the current iteration
 * and moves directly to the next iteration.
 * Numbers not divisible by 10 are printed.
 * This is a common example used to understand
 * the difference between break and continue."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(n)
 *
 * Where n is the number of inputs entered.
 *
 * Since the loop may continue indefinitely,
 * execution depends on user input.
 *
 * ==========================================
 *
 * SPACE COMPLEXITY: O(1)
 *
 * Only one integer variable and Scanner object
 * are used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What does continue do?
 *
 * Answer:
 * continue skips the remaining statements
 * of the current iteration and transfers
 * control directly to the next iteration
 * of the loop.
 */
