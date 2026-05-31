/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate the use of the
 * continue statement inside a for loop.
 *
 * The program should:
 * - Run a loop from 1 to 5
 * - Skip the iteration when the value becomes 3
 * - Print all other values
 *
 * This program demonstrates:
 * - for loop
 * - if condition
 * - continue statement
 * - loop control flow
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * The program prints:
 *
 * 1
 * 2
 * 4
 * 5
 *
 * because the value 3 is skipped.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Loop:
 * for i = 1 to 5
 *
 * Step-by-step working:
 *
 * 1. i = 1
 *    - i == 3 ? No
 *    - Print 1
 *
 * 2. i = 2
 *    - i == 3 ? No
 *    - Print 2
 *
 * 3. i = 3
 *    - i == 3 ? Yes
 *    - continue executes
 *    - Current iteration stops
 *    - 3 is NOT printed
 *
 * 4. i = 4
 *    - i == 3 ? No
 *    - Print 4
 *
 * 5. i = 5
 *    - i == 3 ? No
 *    - Print 5
 *
 * Final Output:
 * 1
 * 2
 * 4
 * 5
 */

public class continueexample {

    public static void main(String args[]) {

        // Loop starts from 1 and runs until 5
        for (int i = 1; i <= 5; i++) {

            // Check whether current value is 3
            if (i == 3) {

                // Skip the current iteration
                // and move to the next iteration
                continue;
            }

            // Print values except 3
            System.out.println(i);
        }
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. continue statement skips the current iteration
 *    and immediately moves to the next iteration.
 *
 * 2. Unlike break, continue does NOT terminate the loop.
 *
 * 3. In this program:
 *    - 1 is printed
 *    - 2 is printed
 *    - 3 is skipped
 *    - 4 is printed
 *    - 5 is printed
 *
 * 4. continue is useful when:
 *    - Certain values need to be ignored
 *    - Invalid data should be skipped
 *    - Some iterations should not execute completely
 *
 * 5. Loop continues normally after continue executes.
 *
 * ==========================================
 * BREAK VS CONTINUE:
 * ==========================================
 *
 * break:
 * - Terminates the entire loop immediately.
 *
 * Example:
 * if(i == 3) {
 *     break;
 * }
 *
 * Output:
 * 1
 * 2
 *
 * ------------------------------------------
 *
 * continue:
 * - Skips only the current iteration.
 *
 * Example:
 * if(i == 3) {
 *     continue;
 * }
 *
 * Output:
 * 1
 * 2
 * 4
 * 5
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the use of the
 * continue statement in Java.
 * I used a for loop that runs from 1 to 5.
 * Whenever the value of i becomes 3,
 * the continue statement executes and skips
 * the remaining code of that iteration.
 * As a result, the number 3 is not printed,
 * while all other values are displayed."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(n)
 * The loop runs 5 times.
 * In general, for n iterations:
 * O(n)
 *
 * SPACE COMPLEXITY: O(1)
 * Only one loop variable is used.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Confusing continue with break.
 *
 * break:
 * Stops the entire loop.
 *
 * continue:
 * Skips only the current iteration.
 *
 * 2. Thinking continue exits the loop.
 *    It does not.
 *
 * 3. Writing important statements after continue.
 *
 * Example:
 * if(i == 3) {
 *     continue;
 *     System.out.println(i); // Unreachable code
 * }
 *
 * 4. Forgetting that the loop still continues
 *    after continue executes.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What is the difference between break and continue?
 *
 * Answer:
 * break terminates the entire loop immediately,
 * whereas continue skips only the current iteration
 * and moves control to the next iteration.
 */
