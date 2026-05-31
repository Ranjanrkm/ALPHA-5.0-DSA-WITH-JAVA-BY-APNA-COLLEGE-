/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate the use of the
 * break statement inside a for loop.
 *
 * The program should:
 * - Run a loop from 1 to 5
 * - Stop the loop immediately when the value becomes 3
 * - Print all numbers before the break occurs
 * - Print a message after the loop ends
 *
 * This program demonstrates:
 * - for loop
 * - if condition
 * - break statement
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
 * 1
 * 2
 * i am out of the loop
 *
 * because the loop stops when i becomes 3.
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
 *    - i == 3? No
 *    - Print 1
 *
 * 2. i = 2
 *    - i == 3? No
 *    - Print 2
 *
 * 3. i = 3
 *    - i == 3? Yes
 *    - break statement executes
 *    - Loop stops immediately
 *
 * 4. Control comes out of the loop
 *    - Print "i am out of the loop"
 *
 * Final Output:
 * 1
 * 2
 * i am out of the loop
 */

public class breakexample {

    public static void main(String args[]) {

        // Loop starts from 1 and runs until 5
        for (int i = 1; i <= 5; i++) {

            // Check whether i has reached 3
            if (i == 3) {

                // Stop the loop immediately when i becomes 3
                break;
            }

            // Print the current value of i
            System.out.println(i);
        }

        // This statement executes after the loop ends
        System.out.println("i am out of the loop");
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. break statement is used to stop a loop
 *    or switch statement immediately.
 *
 * 2. In this program, when i becomes 3,
 *    the loop stops before printing 3.
 *
 * 3. break only exits the nearest loop.
 *
 * 4. The code after the loop still runs
 *    after break is executed.
 *
 * 5. break is useful when:
 *    - You find the required value
 *    - You want to stop unnecessary iterations
 *    - You want early exit from a loop
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the break statement in Java.
 * I used a for loop from 1 to 5.
 * Inside the loop, I checked whether i equals 3.
 * When i becomes 3, the break statement stops the loop
 * immediately.
 * So only 1 and 2 are printed from the loop, and after
 * the loop ends, the message 'i am out of the loop'
 * is printed."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The loop stops early at a fixed value, so execution is constant.
 *
 * SPACE COMPLEXITY: O(1)
 * Only one loop variable is used.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting that break stops the loop immediately.
 *
 * 2. Thinking that break only skips one line.
 *    Actually, it exits the entire loop.
 *
 * 3. Printing inside the if block after break.
 *    That code will never run after break.
 *
 * 4. Confusing break with continue.
 *    - break exits the loop
 *    - continue skips only the current iteration
 */
