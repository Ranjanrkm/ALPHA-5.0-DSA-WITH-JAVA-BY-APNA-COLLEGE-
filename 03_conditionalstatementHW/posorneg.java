import java.util.*;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to determine whether
 * a given number is Positive or Negative.
 *
 * The program should:
 * - Read an integer from the user.
 * - Check whether the number is greater than
 *   or equal to 0.
 * - If yes, print that the number is positive.
 * - Otherwise, print that the number is negative.
 *
 * This program demonstrates:
 * - User Input using Scanner
 * - if-else statement
 * - Relational Operators
 * - Decision Making in Java
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * A single integer number.
 *
 * Example:
 * 15
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * If number >= 0:
 * the entered number is positive
 *
 * Otherwise:
 * entered number is negative
 *
 * ==========================================
 * Dry Run Example 1:
 * ==========================================
 * Input:
 * 25
 *
 * Step 1:
 * number = 25
 *
 * Step 2:
 * Check condition:
 *
 * number >= 0
 *
 * 25 >= 0
 *
 * TRUE
 *
 * Step 3:
 * Enter if block.
 *
 * Step 4:
 * Print:
 *
 * the entered number is positive
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input:
 * -8
 *
 * Step 1:
 * number = -8
 *
 * Step 2:
 * Check condition:
 *
 * number >= 0
 *
 * -8 >= 0
 *
 * FALSE
 *
 * Step 3:
 * Enter else block.
 *
 * Step 4:
 * Print:
 *
 * entered number is negative
 *
 * ==========================================
 * Dry Run Example 3:
 * ==========================================
 * Input:
 * 0
 *
 * Step 1:
 * number = 0
 *
 * Step 2:
 * Check:
 *
 * 0 >= 0
 *
 * TRUE
 *
 * Step 3:
 * Print:
 *
 * the entered number is positive
 *
 * Note:
 * In this program, 0 is treated as positive
 * because of the condition:
 *
 * number >= 0
 */

public class posorneg {

    public static void main(String args[]) {

        // Create Scanner object to read input
        // from keyboard or online judge.
        Scanner sc = new Scanner(System.in);

        // Safety check:
        // If input is not an integer,
        // terminate the program safely.
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        // Read the integer entered by the user.
        //
        // Example:
        // Input:
        // 25
        //
        // After execution:
        // number = 25
        int number = sc.nextInt();

        /*
         * Check whether the entered number
         * is greater than or equal to zero.
         *
         * If TRUE:
         * Number is positive.
         *
         * If FALSE:
         * Number is negative.
         */
        if (number >= 0) {

            // Executed when number is positive
            // or equal to zero.
            System.out.println("the entered number is positive");

        } else {

            // Executed when number is less than zero.
            System.out.println("entered number is negative");
        }

        // Close Scanner to release resources.
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. if statement executes when
 *    the condition becomes TRUE.
 *
 * ------------------------------------------
 *
 * 2. else statement executes when
 *    the condition becomes FALSE.
 *
 * ------------------------------------------
 *
 * 3. Relational Operators:
 *
 *    >   Greater Than
 *    <   Less Than
 *    >=  Greater Than or Equal To
 *    <=  Less Than or Equal To
 *    ==  Equal To
 *    !=  Not Equal To
 *
 * ------------------------------------------
 *
 * 4. In this program:
 *
 *    number >= 0
 *
 * means 0 is considered positive.
 *
 * ------------------------------------------
 *
 * 5. Avoid unnecessary prompts like:
 *
 *    Enter a number:
 *
 * in TCS NQT, HackerRank, CodeChef,
 * LeetCode, etc.
 *
 * Extra output may fail test cases.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Writing:
 *
 *    number > 0
 *
 * instead of:
 *
 *    number >= 0
 *
 * This changes the handling of 0.
 *
 * ------------------------------------------
 *
 * 2. Using assignment operator (=)
 * instead of comparison operators.
 *
 * ------------------------------------------
 *
 * 3. Forgetting braces { }
 * in larger if-else blocks.
 *
 * ------------------------------------------
 *
 * 4. Printing unnecessary prompts
 * in competitive programming.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program determines whether an integer
 * is positive or negative using an if-else
 * statement. After reading the number using
 * Scanner, the program checks whether the
 * value is greater than or equal to zero.
 * If the condition is true, it prints that
 * the number is positive; otherwise, it prints
 * that the number is negative."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(1)
 *
 * Only one comparison operation is performed.
 *
 * ------------------------------------------
 *
 * SPACE COMPLEXITY:
 *
 * O(1)
 *
 * Only one integer variable and one Scanner
 * object are used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: Which statement is used here?
 *
 * Answer:
 * if-else statement.
 *
 * ------------------------------------------
 *
 * Q: Why is if-else used?
 *
 * Answer:
 * It helps the program choose between
 * two execution paths based on a condition.
 *
 * ------------------------------------------
 *
 * Q: What happens when number = 0?
 *
 * Answer:
 * 0 is treated as positive because
 * the condition is:
 *
 * number >= 0
 *
 * ------------------------------------------
 *
 * Q: What is the time complexity?
 *
 * Answer:
 *
 * O(1)
 *
 * because only one comparison is performed.
 */
