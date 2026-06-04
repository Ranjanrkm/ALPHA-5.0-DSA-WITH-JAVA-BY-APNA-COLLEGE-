import java.util.*;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to calculate the sum of
 * the first N natural numbers using a while loop.
 *
 * The program should:
 * - Read a value N from the user.
 * - Add all numbers from 1 to N.
 * - Print the final sum.
 *
 * Example:
 *
 * N = 5
 *
 * Sum = 1 + 2 + 3 + 4 + 5
 *     = 15
 *
 * This program demonstrates:
 * - User Input
 * - while Loop
 * - Running Sum Technique
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer N.
 *
 * Example:
 * 5
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Sum of first N natural numbers.
 *
 * Example:
 * 15
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 5
 *
 * Initial Values:
 *
 * n = 5
 * sum = 0
 * i = 1
 *
 * ------------------------------------------
 *
 * Iteration 1:
 *
 * sum = sum + i
 * sum = 0 + 1
 * sum = 1
 *
 * i = 2
 *
 * ------------------------------------------
 *
 * Iteration 2:
 *
 * sum = 1 + 2
 * sum = 3
 *
 * i = 3
 *
 * ------------------------------------------
 *
 * Iteration 3:
 *
 * sum = 3 + 3
 * sum = 6
 *
 * i = 4
 *
 * ------------------------------------------
 *
 * Iteration 4:
 *
 * sum = 6 + 4
 * sum = 10
 *
 * i = 5
 *
 * ------------------------------------------
 *
 * Iteration 5:
 *
 * sum = 10 + 5
 * sum = 15
 *
 * i = 6
 *
 * ------------------------------------------
 *
 * Condition Check:
 *
 * 6 <= 5
 *
 * FALSE
 *
 * Loop terminates.
 *
 * Final Output:
 *
 * 15
 */

public class sumofn {

    public static void main(String args[]) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Read value of N
        int n = sc.nextInt();

        // Variable to store final sum
        int sum = 0;

        // Counter starts from 1
        int i = 1;

        /*
         * Continue loop until
         * i becomes greater than n
         */
        while (i <= n) {

            // Add current value of i to sum
            sum += i;

            // Move to next number
            i++;
        }

        // Print the final sum
        System.out.println(sum);

        // Close Scanner object
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Natural Numbers:
 *
 * 1, 2, 3, 4, 5, ...
 *
 * 2. sum += i
 *
 * is shorthand for:
 *
 * sum = sum + i;
 *
 * 3. This technique is called
 *    Running Sum Accumulation.
 *
 * 4. The loop adds every number
 *    from 1 to N exactly once.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting:
 *
 * i++;
 *
 * Result:
 * Infinite Loop
 *
 * ------------------------------------------
 *
 * 2. Initializing:
 *
 * int i = 0;
 *
 * While not wrong, the question asks
 * for natural numbers starting from 1.
 *
 * ------------------------------------------
 *
 * 3. Printing inside the loop.
 *
 * Wrong:
 *
 * System.out.println(sum);
 *
 * inside while loop.
 *
 * This prints intermediate sums.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program calculates the sum of the first
 * N natural numbers using a while loop.
 * I initialize a counter variable from 1 and
 * repeatedly add it to a running sum variable.
 * After each addition, the counter is incremented.
 * When the counter exceeds N, the loop stops and
 * the final sum is printed."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(n)
 *
 * The loop executes N times.
 *
 * ------------------------------------------
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
 * Q: What does sum += i mean?
 *
 * Answer:
 *
 * It is a shorthand operator for:
 *
 * sum = sum + i;
 *
 * ------------------------------------------
 *
 * Q: What is the time complexity?
 *
 * Answer:
 *
 * O(n)
 *
 * because the loop runs N times.
 *
 * ------------------------------------------
 *
 * Q: Can this problem be solved without a loop?
 *
 * Answer:
 *
 * Yes.
 *
 * Using the mathematical formula:
 *
 * Sum = n * (n + 1) / 2
 *
 * which works in O(1) time.
 */