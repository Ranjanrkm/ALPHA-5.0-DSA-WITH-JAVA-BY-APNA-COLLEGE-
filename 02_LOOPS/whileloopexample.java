/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to print "Hello World"
 * 10 times using a while loop.
 *
 * The program should:
 * - Initialize a counter variable.
 * - Print "Hello World" repeatedly.
 * - Stop after printing it 10 times.
 * - Display a final confirmation message.
 *
 * This program demonstrates:
 * - while loop
 * - Counter variable
 * - Loop control
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
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
 * printed HW 10x
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Values:
 *
 * counter = 0
 *
 * ------------------------------------------
 *
 * Iteration 1:
 *
 * counter = 0
 *
 * Condition:
 * 0 < 10 -> TRUE
 *
 * Print:
 * Hello World
 *
 * counter becomes 1
 *
 * ------------------------------------------
 *
 * Iteration 2:
 *
 * counter = 1
 *
 * Condition:
 * 1 < 10 -> TRUE
 *
 * Print:
 * Hello World
 *
 * counter becomes 2
 *
 * ------------------------------------------
 *
 * ...
 *
 * ------------------------------------------
 *
 * Iteration 10:
 *
 * counter = 9
 *
 * Condition:
 * 9 < 10 -> TRUE
 *
 * Print:
 * Hello World
 *
 * counter becomes 10
 *
 * ------------------------------------------
 *
 * Condition Check:
 *
 * 10 < 10 -> FALSE
 *
 * Loop terminates.
 *
 * Print:
 * printed HW 10x
 */

public class whileloopexample {

    public static void main(String args[]) {

        // Counter variable used to control loop execution
        int counter = 0;

        /*
         * while loop continues executing
         * as long as counter is less than 10
         */
        while (counter < 10) {

            // Print Hello World
            System.out.println("Hello World");

            // Increase counter by 1
            counter++;
        }

        // Print confirmation message after loop ends
        System.out.println("printed HW 10x");
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. while loop is an Entry-Controlled Loop.
 *
 * 2. Condition is checked before
 *    executing the loop body.
 *
 * 3. If the condition becomes FALSE,
 *    the loop terminates immediately.
 *
 * 4. counter++ is necessary to move
 *    towards loop termination.
 *
 * 5. The loop runs exactly 10 times because:
 *
 *    counter starts at 0
 *    counter ends at 9
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting:
 *
 * counter++;
 *
 * Result:
 * Infinite Loop
 *
 * ------------------------------------------
 *
 * 2. Using:
 *
 * counter <= 10
 *
 * instead of:
 *
 * counter < 10
 *
 * Output:
 * Hello World printed 11 times.
 *
 * ------------------------------------------
 *
 * 3. Initializing:
 *
 * counter = 1
 *
 * with condition:
 *
 * counter < 10
 *
 * Output:
 * Hello World printed only 9 times.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the use of a while
 * loop in Java. A counter variable starts from 0.
 * The loop continues executing as long as the
 * counter remains less than 10. During each
 * iteration, 'Hello World' is printed and the
 * counter is incremented. After the loop completes,
 * a final message confirms that the text was
 * printed 10 times."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(n)
 *
 * Here:
 * n = 10
 *
 * The loop executes 10 times.
 *
 * ------------------------------------------
 *
 * SPACE COMPLEXITY:
 *
 * O(1)
 *
 * Only one integer variable is used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: Why is a while loop used here?
 *
 * Answer:
 * A while loop is used when a block of code
 * needs to execute repeatedly until a condition
 * becomes false.
 *
 * ------------------------------------------
 *
 * Q: What happens if counter++ is removed?
 *
 * Answer:
 * The condition never changes, causing an
 * infinite loop.
 *
 * ------------------------------------------
 *
 * Q: How many times does this loop execute?
 *
 * Answer:
 * 10 times, because counter starts at 0 and
 * continues while counter is less than 10.
 */
