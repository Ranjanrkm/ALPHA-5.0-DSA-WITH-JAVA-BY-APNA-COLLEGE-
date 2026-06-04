import java.util.*;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to reverse a given number
 * and store the reversed value in a new variable.
 *
 * The program should:
 * - Extract the last digit of the number.
 * - Append that digit to the reversed number.
 * - Remove the last digit from the original number.
 * - Repeat until the original number becomes 0.
 * - Print the reversed number.
 *
 * Example:
 *
 * Original Number:
 * 10899
 *
 * Reversed Number:
 * 99801
 *
 * This program demonstrates:
 * - while loop
 * - Modulus Operator (%)
 * - Integer Division (/)
 * - Number Reversal Logic
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input required.
 *
 * Number used:
 * 10899
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * 99801
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Values:
 *
 * n = 10899
 * rev = 0
 *
 * ------------------------------------------
 *
 * Iteration 1:
 *
 * lastdigit = 10899 % 10
 *           = 9
 *
 * rev = (0 * 10) + 9
 *     = 9
 *
 * n = 10899 / 10
 *   = 1089
 *
 * ------------------------------------------
 *
 * Iteration 2:
 *
 * lastdigit = 1089 % 10
 *           = 9
 *
 * rev = (9 * 10) + 9
 *     = 99
 *
 * n = 1089 / 10
 *   = 108
 *
 * ------------------------------------------
 *
 * Iteration 3:
 *
 * lastdigit = 108 % 10
 *           = 8
 *
 * rev = (99 * 10) + 8
 *     = 998
 *
 * n = 108 / 10
 *   = 10
 *
 * ------------------------------------------
 *
 * Iteration 4:
 *
 * lastdigit = 10 % 10
 *           = 0
 *
 * rev = (998 * 10) + 0
 *     = 9980
 *
 * n = 10 / 10
 *   = 1
 *
 * ------------------------------------------
 *
 * Iteration 5:
 *
 * lastdigit = 1 % 10
 *           = 1
 *
 * rev = (9980 * 10) + 1
 *     = 99801
 *
 * n = 1 / 10
 *   = 0
 *
 * ------------------------------------------
 *
 * Condition:
 *
 * n > 0
 *
 * 0 > 0 -> FALSE
 *
 * Loop terminates.
 *
 * Final Output:
 *
 * 99801
 */

public class reversenum {

    public static void main(String args[]) {

        // Original number to be reversed
        int n = 10899;

        // Variable to store the reversed number
        int rev = 0;

        /*
         * Continue until all digits
         * of the original number are processed
         */
        while (n > 0) {

            // Extract the last digit
            int lastdigit = n % 10;

            /*
             * Shift existing digits of rev
             * one place to the left and
             * append the extracted digit
             */
            rev = (rev * 10) + lastdigit;

            // Remove the last digit from n
            n = n / 10;
        }

        // Print the reversed number
        System.out.println(rev);
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. n % 10 gives the last digit.
 *
 * Example:
 *
 * 567 % 10 = 7
 *
 * ------------------------------------------
 *
 * 2. n / 10 removes the last digit.
 *
 * Example:
 *
 * 567 / 10 = 56
 *
 * ------------------------------------------
 *
 * 3. Formula:
 *
 * rev = (rev * 10) + lastdigit
 *
 * is the most important logic.
 *
 * It shifts existing digits left
 * and appends the new digit.
 *
 * ------------------------------------------
 *
 * 4. This program actually stores
 * the reversed number.
 *
 * Unlike the previous reverse program,
 * this one creates a new integer value.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting:
 *
 * rev * 10
 *
 * Wrong:
 *
 * rev = rev + lastdigit;
 *
 * This will not create the reverse correctly.
 *
 * ------------------------------------------
 *
 * 2. Forgetting:
 *
 * n = n / 10;
 *
 * Result:
 * Infinite Loop
 *
 * ------------------------------------------
 *
 * 3. Using:
 *
 * n % 2
 *
 * instead of:
 *
 * n % 10
 *
 * ------------------------------------------
 *
 * 4. Initializing rev with a random value.
 *
 * Correct:
 *
 * int rev = 0;
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program reverses a number using mathematical
 * operations. In each iteration, I extract the last
 * digit using the modulus operator. Then I append
 * that digit to the reversed number using the formula
 * rev = (rev * 10) + lastdigit. Finally, I remove
 * the last digit from the original number using
 * integer division. The process continues until the
 * original number becomes zero."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(d)
 *
 * where d is the number of digits.
 *
 * Example:
 *
 * 10899 has 5 digits.
 *
 * Loop executes 5 times.
 *
 * ------------------------------------------
 *
 * SPACE COMPLEXITY:
 *
 * O(1)
 *
 * Only a few integer variables
 * are used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What is the logic used to reverse a number?
 *
 * Answer:
 *
 * rev = (rev * 10) + lastdigit
 *
 * This shifts the existing digits left
 * and appends the newly extracted digit.
 *
 * ------------------------------------------
 *
 * Q: How do you extract the last digit?
 *
 * Answer:
 *
 * number % 10
 *
 * Example:
 *
 * 123 % 10 = 3
 *
 * ------------------------------------------
 *
 * Q: How do you remove the last digit?
 *
 * Answer:
 *
 * number / 10
 *
 * Example:
 *
 * 123 / 10 = 12
 *
 * ------------------------------------------
 *
 * Q: What is the time complexity of reversing a number?
 *
 * Answer:
 *
 * O(d)
 *
 * where d is the number of digits
 * in the number.
 */