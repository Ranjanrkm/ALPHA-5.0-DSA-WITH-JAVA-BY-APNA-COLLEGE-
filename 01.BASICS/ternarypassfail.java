/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to check whether a student
 * is PASS or FAIL using the ternary operator.
 *
 * Rules:
 * - If marks are greater than or equal to 33,
 *   print "PASS".
 * - Otherwise, print "FAIL".
 *
 * The program demonstrates:
 * - Input handling using Scanner
 * - Conditional checking
 * - Usage of the ternary operator
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer representing student's marks.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Print:
 *   PASS -> if marks >= 33
 *   FAIL -> otherwise
 *
 * ==========================================
 * Dry Run Example 1:
 * ==========================================
 * Input:
 * 45
 *
 * Step-by-step working:
 * 1. Create Scanner object to take input.
 * 2. Read marks from the user.
 *    marks = 45
 * 3. Check condition:
 *    (marks >= 33)
 *    -> (45 >= 33)
 *    -> true
 * 4. Ternary operator returns "PASS".
 * 5. Store result in variable 'status'.
 * 6. Print status.
 *
 * Output:
 * PASS
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input:
 * 20
 *
 * Step-by-step working:
 * 1. marks = 20
 * 2. Check condition:
 *    (20 >= 33)
 *    -> false
 * 3. Ternary operator returns "FAIL".
 * 4. Print FAIL.
 *
 * Output:
 * FAIL
 */

import java.util.*;

public class ternarypassfail {

    public static void main(String args[]) {

        // 1. Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Safety check:
        // Prevents runtime crash if invalid input is entered
        if (!sc.hasNextInt()) return;

        // 2. Read student's marks
        int marks = sc.nextInt();

        // 3. Use ternary operator to check PASS or FAIL
        // Syntax:
        // (condition) ? value_if_true : value_if_false
        String status = (marks >= 33) ? "PASS" : "FAIL";

        // 4. Print final result
        System.out.println(status);

        // 5. Close Scanner object
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Ternary operator is the short form of if-else.
 *
 * Syntax:
 * (condition) ? true_value : false_value;
 *
 * 2. If the condition becomes true,
 *    the value before ':' executes.
 *
 * 3. If the condition becomes false,
 *    the value after ':' executes.
 *
 * 4. Ternary operator is useful for small
 *    decision-making statements.
 *
 * 5. For complex conditions,
 *    normal if-else is preferred for readability.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program checks whether a student is PASS
 * or FAIL using the ternary operator in Java.
 * I first take marks as input using Scanner.
 * Then I use the condition (marks >= 33).
 * If the condition is true, the ternary operator
 * returns 'PASS'; otherwise it returns 'FAIL'.
 * Finally, the result is printed on the console."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Only one condition check is performed.
 *
 * SPACE COMPLEXITY: O(1)
 * Only primitive variables and one String variable are used.
 */