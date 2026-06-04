import java.util.*;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to reverse the digits
 * of a given number.
 *
 * The program should:
 * - Extract the last digit of the number.
 * - Print the digit.
 * - Remove the last digit from the number.
 * - Repeat until the number becomes 0.
 *
 * Example:
 * Number = 10899
 *
 * Reverse = 99801
 *
 * This program demonstrates:
 * - while loop
 * - Modulus Operator (%)
 * - Integer Division (/)
 * - Digit Extraction
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
 * Initial Value:
 *
 * n = 10899
 *
 * ------------------------------------------
 *
 * Iteration 1:
 *
 * lastdigit = 10899 % 10
 *           = 9
 *
 * Print:
 * 9
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
 * Print:
 * 9
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
 * Print:
 * 8
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
 * Print:
 * 0
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
 * Print:
 * 1
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

public class reverse {

    public static void main(String args[]) {

        // Store the number to be reversed
        int n = 10899;

        /*
         * Continue extracting digits
         * until the number becomes 0
         */
        while (n > 0) {

            // Extract the last digit
            int lastdigit = n % 10;

            // Print the extracted digit
            System.out.print(lastdigit);

            // Remove the last digit from the number
            n = n / 10;
        }

        // Move cursor to next line
        System.out.println();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Modulus Operator (%)
 *    gives the last digit of a number.
 *
 * Example:
 *
 * 123 % 10 = 3
 *
 * 456 % 10 = 6
 *
 * ------------------------------------------
 *
 * 2. Integer Division (/)
 *    removes the last digit.
 *
 * Example:
 *
 * 123 / 10 = 12
 *
 * 456 / 10 = 45
 *
 * ------------------------------------------
 *
 * 3. This program prints digits
 *    in reverse order.
 *
 * It does NOT store the reversed number.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting:
 *
 * n = n / 10;
 *
 * Result:
 * Infinite Loop
 *
 * ------------------------------------------
 *
 * 2. Using:
 *
 * n % 2
 *
 * instead of:
 *
 * n % 10
 *
 * ------------------------------------------
 *
 * 3. Assuming this code creates a
 *    reversed number variable.
 *
 * Actually:
 * It only prints the reverse.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program prints the digits of a number
 * in reverse order. I repeatedly extract the
 * last digit using the modulus operator (%)
 * and print it. Then I remove the last digit
 * using integer division by 10. This process
 * continues until the number becomes zero.
 * As a result, the digits are displayed in
 * reverse order."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(d)
 *
 * where d = number of digits.
 *
 * For 10899:
 * d = 5
 *
 * ==========================================
 *
 * SPACE COMPLEXITY:
 *
 * O(1)
 *
 * Only a few integer variables are used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: How do you get the last digit of a number?
 *
 * Answer:
 *
 * Using:
 *
 * number % 10
 *
 * Example:
 *
 * 789 % 10 = 9
 *
 * ------------------------------------------
 *
 * Q: How do you remove the last digit?
 *
 * Answer:
 *
 * Using:
 *
 * number / 10
 *
 * Example:
 *
 * 789 / 10 = 78
 *
 * ------------------------------------------
 *
 * Q: Does this code store the reversed number?
 *
 * Answer:
 *
 * No.
 *
 * It only prints the digits in reverse order.
 * To store the reversed number, an additional
 * variable would be required.
 */
