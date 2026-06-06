import java.util.*;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to calculate the Average
 * of three numbers entered by the user.
 *
 * The program should:
 * - Read three integer values.
 * - Calculate their average.
 * - Print the final average.
 *
 * Formula:
 *
 * Average = (A + B + C) / 3
 *
 * This program demonstrates:
 * - User Input using Scanner
 * - Arithmetic Operators
 * - Integer Division
 * - Basic Mathematical Calculations
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * Three integer values.
 *
 * Example:
 * 10
 * 20
 * 30
 *
 * OR
 *
 * 10 20 30
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * average is :20
 *
 * ==========================================
 * Dry Run Example 1:
 * ==========================================
 * Input:
 * 10 20 30
 *
 * Step 1:
 * A = 10
 *
 * Step 2:
 * B = 20
 *
 * Step 3:
 * C = 30
 *
 * Step 4:
 * Calculate sum:
 *
 * A + B + C
 *
 * 10 + 20 + 30
 *
 * = 60
 *
 * Step 5:
 * Calculate average:
 *
 * 60 / 3
 *
 * = 20
 *
 * Step 6:
 * Print:
 *
 * average is :20
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input:
 * 5 8 10
 *
 * Step 1:
 * A = 5
 * B = 8
 * C = 10
 *
 * Step 2:
 * Sum:
 *
 * 5 + 8 + 10
 *
 * = 23
 *
 * Step 3:
 *
 * Average = 23 / 3
 *
 * = 7
 *
 * Note:
 * Since average is stored in an integer,
 * decimal values are discarded.
 *
 * Output:
 *
 * average is :7
 */

public class avg {

    public static void main(String args[]) {

        // Create Scanner object to read input
        // from keyboard or online judge.
        Scanner sc = new Scanner(System.in);

        // Safety check:
        // Ensure first input is available and integer.
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        // Read first number entered by the user.
        //
        // Example:
        // Input:
        // 10
        //
        // After execution:
        // A = 10
        int A = sc.nextInt();

        // Read second number.
        //
        // Example:
        // B = 20
        int B = sc.nextInt();

        // Read third number.
        //
        // Example:
        // C = 30
        int C = sc.nextInt();

        /*
         * Calculate average of three numbers.
         *
         * Formula:
         *
         * Average = (A + B + C) / 3
         *
         * Example:
         *
         * (10 + 20 + 30) / 3
         *
         * = 60 / 3
         *
         * = 20
         */
        int average = (A + B + C) / 3;

        // Print the calculated average.
        //
        // Example Output:
        //
        // average is :20
        System.out.println("average is :" + average);

        // Close Scanner to release system resources.
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Average Formula:
 *
 *    Average = Sum of Numbers / Count of Numbers
 *
 * ------------------------------------------
 *
 * 2. Here:
 *
 *    Count = 3
 *
 * because we are averaging three numbers.
 *
 * ------------------------------------------
 *
 * 3. Integer Division:
 *
 * If average is stored in int,
 * decimal values are removed.
 *
 * Example:
 *
 * 23 / 3 = 7
 *
 * not
 *
 * 7.666...
 *
 * ------------------------------------------
 *
 * 4. If decimal precision is required,
 * use double instead of int.
 *
 * Example:
 *
 * double average = (A + B + C) / 3.0;
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting parentheses.
 *
 * Wrong:
 *
 * A + B + C / 3
 *
 * Correct:
 *
 * (A + B + C) / 3
 *
 * ------------------------------------------
 *
 * 2. Using int when decimal average
 * is required.
 *
 * ------------------------------------------
 *
 * 3. Forgetting to read all three inputs.
 *
 * ------------------------------------------
 *
 * 4. Printing unnecessary prompts like:
 *
 * Enter Numbers:
 *
 * which may fail TCS NQT test cases.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program calculates the average of
 * three user-provided numbers. I use the
 * Scanner class to read three integers,
 * compute their sum, divide the result by 3,
 * and print the average. Since the result is
 * stored in an integer variable, any decimal
 * portion is automatically truncated."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(1)
 *
 * Only a fixed number of arithmetic
 * operations are performed.
 *
 * ------------------------------------------
 *
 * SPACE COMPLEXITY:
 *
 * O(1)
 *
 * Only a few integer variables and
 * one Scanner object are used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What is the formula for average?
 *
 * Answer:
 *
 * Average = Sum of Elements / Number of Elements
 *
 * ------------------------------------------
 *
 * Q: Why is the result sometimes incorrect
 * for decimal averages?
 *
 * Answer:
 *
 * Because integer division removes
 * the decimal part.
 *
 * ------------------------------------------
 *
 * Q: How can we get accurate decimal averages?
 *
 * Answer:
 *
 * Use double datatype and divide by 3.0.
 *
 * Example:
 *
 * double average = (A + B + C) / 3.0;
 *
 * ------------------------------------------
 *
 * Q: What is the time complexity?
 *
 * Answer:
 *
 * O(1)
 *
 * because only constant-time operations
 * are performed.
 */
