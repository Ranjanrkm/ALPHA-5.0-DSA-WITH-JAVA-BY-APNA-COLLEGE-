/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program that continuously accepts
 * integer input from the user until the user enters
 * a number that is divisible by 10.
 *
 * Rules:
 * - Ask the user to enter a number.
 * - If the number is NOT divisible by 10,
 *   print the number.
 * - If the number IS divisible by 10,
 *   terminate the loop immediately.
 *
 * This program demonstrates:
 * - Infinite Loop using do-while(true)
 * - break statement
 * - User Input using Scanner
 * - Modulus Operator (%)
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - Multiple integer inputs entered by the user.
 * - Input continues until a number divisible by 10
 *   is entered.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Print every number that is NOT divisible by 10.
 * - Stop execution when a number divisible by 10
 *   is entered.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 23
 * 45
 * 67
 * 80
 *
 * Step-by-step working:
 *
 * Step 1:
 * User enters 23
 *
 * Check:
 * 23 % 10 = 3
 *
 * Not equal to 0
 *
 * Print:
 * 23
 *
 * ------------------------------------------
 *
 * Step 2:
 * User enters 45
 *
 * Check:
 * 45 % 10 = 5
 *
 * Not equal to 0
 *
 * Print:
 * 45
 *
 * ------------------------------------------
 *
 * Step 3:
 * User enters 67
 *
 * Check:
 * 67 % 10 = 7
 *
 * Not equal to 0
 *
 * Print:
 * 67
 *
 * ------------------------------------------
 *
 * Step 4:
 * User enters 80
 *
 * Check:
 * 80 % 10 = 0
 *
 * Condition becomes TRUE
 *
 * break executes
 *
 * Loop terminates immediately.
 *
 * Final Output:
 * 23
 * 45
 * 67
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input:
 * 10
 *
 * Step 1:
 * 10 % 10 = 0
 *
 * Step 2:
 * break executes immediately
 *
 * Step 3:
 * Loop terminates
 *
 * Output:
 * No number is printed.
 */

import java.util.*;

public class enteringnum {

    public static void main(String args[]) {

        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        /*
         * Infinite do-while loop
         * The loop continues until break executes
         */
        do {

            // Ask user to enter a number
            System.out.print("Enter your number : ");

            // Safety check:
            // Prevents program crash on invalid input
            if (!sc.hasNextInt()) {
                break;
            }

            // Read integer input
            int n = sc.nextInt();

            /*
             * Check whether the number
             * is divisible by 10
             */
            if (n % 10 == 0) {

                // Exit loop immediately
                break;
            }

            // Print the number if it is not divisible by 10
            System.out.println(n);

        } while (true);

        // Close Scanner object
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. % (Modulus Operator)
 *    Returns the remainder after division.
 *
 * Example:
 *
 * 25 % 10 = 5
 * 80 % 10 = 0
 *
 * 2. A number is divisible by 10 when:
 *
 *    number % 10 == 0
 *
 * 3. break statement immediately terminates
 *    the nearest loop.
 *
 * 4. do-while(true) creates an infinite loop.
 *
 * Example:
 *
 * do {
 *     // code
 * } while(true);
 *
 * Such loops require a break statement
 * to terminate.
 *
 * 5. Scanner is used for dynamic user input.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting break statement.
 *
 * This may create an infinite loop.
 *
 * 2. Writing:
 *
 * n / 10 == 0
 *
 * instead of:
 *
 * n % 10 == 0
 *
 * Division and modulus are different.
 *
 * 3. Forgetting to close Scanner.
 *
 * 4. Using while(true) incorrectly
 *    without an exit condition.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program continuously accepts integer input
 * from the user using a do-while loop.
 * For every number entered, I check whether it is
 * divisible by 10 using the modulus operator.
 * If the number is divisible by 10, the break
 * statement immediately terminates the loop.
 * Otherwise, the number is printed.
 * This demonstrates loop control using break,
 * infinite loops, and conditional checking."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(n)
 *
 * Where n is the number of inputs entered
 * before a number divisible by 10 appears.
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
 * Q: Why is break used here?
 *
 * Answer:
 * break is used to immediately terminate the
 * infinite do-while loop when the entered
 * number becomes divisible by 10.
 */
