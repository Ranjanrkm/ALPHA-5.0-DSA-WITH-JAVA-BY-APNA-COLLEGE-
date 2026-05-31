/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to print numbers from
 * 1 to 10 using a while loop.
 *
 * The program should:
 * - Start from 1
 * - Continue printing numbers up to 10
 * - Print all numbers in a single line separated by spaces
 *
 * This program demonstrates:
 * - while loop
 * - Loop control variable
 * - Sequential number printing
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * 1 2 3 4 5 6 7 8 9 10
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Value:
 *
 * counter = 1
 *
 * Step 1:
 * Check condition:
 * 1 <= 10 -> TRUE
 *
 * Print:
 * 1
 *
 * counter becomes 2
 *
 * ------------------------------------------
 *
 * Step 2:
 * Check condition:
 * 2 <= 10 -> TRUE
 *
 * Print:
 * 2
 *
 * counter becomes 3
 *
 * ------------------------------------------
 *
 * Step 3:
 * Check condition:
 * 3 <= 10 -> TRUE
 *
 * Print:
 * 3
 *
 * counter becomes 4
 *
 * ------------------------------------------
 *
 * ...
 *
 * ------------------------------------------
 *
 * Step 10:
 * Check condition:
 * 10 <= 10 -> TRUE
 *
 * Print:
 * 10
 *
 * counter becomes 11
 *
 * ------------------------------------------
 *
 * Step 11:
 * Check condition:
 * 11 <= 10 -> FALSE
 *
 * Loop terminates.
 *
 * Final Output:
 * 1 2 3 4 5 6 7 8 9 10
 */

public class onetoten {

    public static void main(String args[]) {

        // Initialize counter variable
        int counter = 1;

        /*
         * while loop executes as long as
         * the condition remains true
         */
        while (counter <= 10) {

            // Print current value of counter
            System.out.print(counter + " ");

            // Increment counter by 1
            counter++;
        }

        // Move cursor to next line
        System.out.println();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. while loop is an Entry-Controlled Loop.
 *
 * 2. Condition is checked before every iteration.
 *
 * 3. If the condition is false initially,
 *    the loop will not execute even once.
 *
 * 4. counter++ is necessary.
 *
 * Without counter++:
 *
 * while(counter <= 10) {
 *     System.out.print(counter);
 * }
 *
 * Infinite Loop occurs.
 *
 * 5. Use while loop when the number of iterations
 *    depends on a condition.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting counter++.
 *
 * Result:
 * Infinite Loop
 *
 * 2. Writing:
 *
 * counter < 10
 *
 * instead of:
 *
 * counter <= 10
 *
 * Output becomes:
 * 1 2 3 4 5 6 7 8 9
 *
 * Number 10 is skipped.
 *
 * 3. Using println() instead of print()
 *    when output should be in one line.
 *
 * Wrong:
 * 1
 * 2
 * 3
 *
 * Correct:
 * 1 2 3
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program prints numbers from 1 to 10
 * using a while loop. A counter variable is
 * initialized with 1. The loop continues as
 * long as the counter is less than or equal to 10.
 * During each iteration, the current value is printed
 * and then incremented. The loop stops automatically
 * when the counter becomes 11."
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
 * SPACE COMPLEXITY: O(1)
 *
 * Only one integer variable is used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: Why is a while loop used here?
 *
 * Answer:
 * A while loop is used to repeatedly execute
 * a block of code until a specified condition
 * becomes false.
 */


