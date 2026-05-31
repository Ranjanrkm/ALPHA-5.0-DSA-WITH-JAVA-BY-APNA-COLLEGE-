/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate the use of
 * the do-while loop.
 *
 * The program should:
 * - Initialize a counter variable with value 1.
 * - Print "Hello World" repeatedly.
 * - Continue printing until the counter becomes 10.
 *
 * This program demonstrates:
 * - do-while loop
 * - Loop control variable
 * - Post-test looping structure
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
 * (10 times)
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Value:
 *
 * counter = 1
 *
 * Step-by-step working:
 *
 * Iteration 1:
 * counter = 1
 * Print "Hello World"
 * counter becomes 2
 *
 * Iteration 2:
 * counter = 2
 * Print "Hello World"
 * counter becomes 3
 *
 * Iteration 3:
 * counter = 3
 * Print "Hello World"
 * counter becomes 4
 *
 * ...
 *
 * Iteration 10:
 * counter = 10
 * Print "Hello World"
 * counter becomes 11
 *
 * Condition Check:
 * 11 <= 10 -> FALSE
 *
 * Loop terminates.
 *
 * ==========================================
 * Important Observation:
 * ==========================================
 * In a do-while loop,
 * the loop body executes at least one time
 * even if the condition is initially false.
 *
 * Example:
 *
 * int counter = 100;
 *
 * do {
 *     System.out.println("Hello");
 * } while(counter <= 10);
 *
 * Output:
 * Hello
 *
 * Because the condition is checked AFTER execution.
 */

public class dowhileloopexample {

    public static void main(String args[]) {

        // Initialize counter variable
        int counter = 1;

        /*
         * do-while loop:
         * First executes the code block.
         * Then checks the condition.
         */
        do {

            // Print message
            System.out.println("Hello World");

            // Increment counter by 1
            counter++;

        } while (counter <= 10); // Continue until counter becomes greater than 10
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. do-while loop is called a
 *    Post-Test Loop.
 *
 * 2. Condition is checked AFTER
 *    executing the loop body.
 *
 * 3. Therefore, the loop executes
 *    at least one time.
 *
 * 4. Syntax:
 *
 *    do {
 *        // statements
 *    } while(condition);
 *
 * 5. Difference Between while and do-while:
 *
 *    while:
 *    - Condition checked first.
 *    - May execute zero times.
 *
 *    do-while:
 *    - Executes first.
 *    - Checked later.
 *    - Executes at least once.
 *
 * ==========================================
 * COMPARISON:
 * ==========================================
 *
 * while Loop:
 *
 * int i = 11;
 *
 * while(i <= 10) {
 *     System.out.println(i);
 * }
 *
 * Output:
 * Nothing
 *
 * ------------------------------------------
 *
 * do-while Loop:
 *
 * int i = 11;
 *
 * do {
 *     System.out.println(i);
 * } while(i <= 10);
 *
 * Output:
 * 11
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting semicolon after while.
 *
 * Wrong:
 * while(counter <= 10)
 *
 * Correct:
 * while(counter <= 10);
 *
 * 2. Forgetting to increment counter.
 *
 * Example:
 * counter++;
 *
 * Without increment,
 * infinite loop may occur.
 *
 * 3. Confusing while and do-while loops.
 *
 * 4. Using wrong condition.
 *
 * Example:
 * counter < 10
 * prints 9 times.
 *
 * counter <= 10
 * prints 10 times.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the do-while loop in Java.
 * I initialized a counter variable with value 1.
 * The loop prints 'Hello World' and increments the counter.
 * Since do-while checks the condition after executing
 * the loop body, the code inside the loop executes
 * at least once. The loop continues until the counter
 * becomes greater than 10."
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
 * Only one integer variable (counter)
 * is used regardless of input size.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What is the major difference between
 * while loop and do-while loop?
 *
 * Answer:
 * In a while loop, the condition is checked
 * before execution, so the loop may execute
 * zero times.
 *
 * In a do-while loop, the condition is checked
 * after execution, so the loop executes
 * at least one time.
 */
