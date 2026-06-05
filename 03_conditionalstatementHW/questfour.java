/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate the use
 * of the Ternary Operator (? :).
 *
 * The program should:
 * - Declare two integer variables.
 * - Use a ternary operator to compare them.
 * - Store a boolean result indicating whether
 *   the first number is smaller than the second.
 * - Use another ternary operator to find the
 *   larger of the two numbers.
 *
 * This program demonstrates:
 * - Ternary Operator (? :)
 * - Conditional Expressions
 * - Boolean Variables
 * - Finding Maximum of Two Numbers
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input required.
 *
 * Hardcoded Values:
 *
 * a = 63
 * b = 36
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * No output is printed in the original code.
 *
 * Values stored:
 *
 * x = false
 * y = 63
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Values:
 *
 * a = 63
 * b = 36
 *
 * ------------------------------------------
 *
 * Step 1:
 *
 * Evaluate:
 *
 * (a < b)
 *
 * (63 < 36)
 *
 * FALSE
 *
 * Therefore:
 *
 * x = false
 *
 * ------------------------------------------
 *
 * Step 2:
 *
 * Evaluate:
 *
 * (a > b)
 *
 * (63 > 36)
 *
 * TRUE
 *
 * Therefore:
 *
 * y = a
 *
 * y = 63
 *
 * ------------------------------------------
 *
 * Final Values:
 *
 * x = false
 * y = 63
 */

public class questfour {

    public static void main(String args[]) {

        // Declare and initialize two integer variables.
        int a = 63;
        int b = 36;

        /*
         * Ternary Operator Syntax:
         *
         * condition ? value_if_true : value_if_false
         *
         * Check whether a is smaller than b.
         *
         * If TRUE:
         * store true in x.
         *
         * Otherwise:
         * store false in x.
         */
        boolean x = (a < b) ? true : false;

        /*
         * Check whether a is greater than b.
         *
         * If TRUE:
         * assign a to y.
         *
         * Otherwise:
         * assign b to y.
         *
         * This effectively finds the larger number.
         */
        int y = (a > b) ? a : b;

        // Print values for understanding and verification.
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. The ternary operator is a shorthand
 *    version of if-else.
 *
 * Syntax:
 *
 * condition ? true_value : false_value
 *
 * ------------------------------------------
 *
 * 2. This statement:
 *
 * boolean x = (a < b) ? true : false;
 *
 * can be simplified to:
 *
 * boolean x = (a < b);
 *
 * because the condition itself
 * already returns true or false.
 *
 * ------------------------------------------
 *
 * 3. Ternary operators are commonly used
 *    for short decision-making statements.
 *
 * ------------------------------------------
 *
 * 4. They improve readability when the logic
 *    is simple.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting the colon (:)
 *
 * Wrong:
 *
 * condition ? value1 value2
 *
 * ------------------------------------------
 *
 * 2. Using complex nested ternary operators.
 *
 * This reduces readability.
 *
 * ------------------------------------------
 *
 * 3. Confusing:
 *
 * ? means "if true"
 *
 * :
 *
 * means "if false"
 *
 * ------------------------------------------
 *
 * 4. Forgetting that ternary operator
 * must return a value.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the use of the
 * ternary operator in Java. The first ternary
 * expression checks whether one number is less
 * than another and stores the boolean result.
 * The second ternary expression compares two
 * numbers and returns the larger value. The
 * ternary operator is a concise alternative
 * to simple if-else statements."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(1)
 *
 * Only a few comparison operations
 * are performed.
 *
 * ------------------------------------------
 *
 * SPACE COMPLEXITY:
 *
 * O(1)
 *
 * Only a fixed number of variables
 * are used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What is a ternary operator?
 *
 * Answer:
 *
 * A ternary operator is a shorthand form
 * of an if-else statement.
 *
 * Syntax:
 *
 * condition ? value_if_true : value_if_false
 *
 * ------------------------------------------
 *
 * Q: How many operands does a ternary operator use?
 *
 * Answer:
 *
 * Three operands.
 *
 * Hence the name "ternary".
 *
 * ------------------------------------------
 *
 * Q: Can ternary operator replace if-else?
 *
 * Answer:
 *
 * Yes, for simple conditions.
 * Complex logic should use if-else.
 *
 * ------------------------------------------
 *
 * Q: What will be the value of x?
 *
 * Answer:
 *
 * false
 *
 * because:
 *
 * 63 < 36
 *
 * is FALSE.
 *
 * ------------------------------------------
 *
 * Q: What will be the value of y?
 *
 * Answer:
 *
 * 63
 *
 * because it is larger than 36.
 */