import java.util.*;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to check whether a given
 * number is prime or not.
 *
 * A prime number is a number that is greater than 1
 * and has exactly two factors:
 * 1 and itself.
 *
 * Examples:
 * - 2 is prime
 * - 3 is prime
 * - 4 is not prime
 * - 17 is prime
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer n.
 *
 * Example:
 * 7
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Print:
 *   "n is prime"      if the number is prime
 *   "n is not prime"  if the number is not prime
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Example 1:
 * Input: 7
 *
 * Step-by-step working:
 * 1. Read n = 7
 * 2. Check whether n <= 1
 *    - No
 * 3. Check whether n == 2
 *    - No
 * 4. Start loop from i = 2 to i * i <= n
 * 5. Check divisibility:
 *    - 7 % 2 != 0
 * 6. No divisor found
 * 7. Mark number as prime
 *
 * Output:
 * n is prime
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input: 12
 *
 * Step-by-step working:
 * 1. Read n = 12
 * 2. Check whether n <= 1
 *    - No
 * 3. Check whether n == 2
 *    - No
 * 4. Start loop from i = 2
 * 5. Check:
 *    - 12 % 2 == 0
 * 6. A divisor is found
 * 7. Mark number as not prime
 *
 * Output:
 * n is not prime
 */

public class prime {

    public static void main(String args[]) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the integer number entered by the user
        int n = sc.nextInt();

        /*
         * Step 1:
         * A prime number must be greater than 1.
         * So if n is 0, 1, or negative, it is not prime.
         */
        if (n <= 1) {
            System.out.println("n is not prime");
        }

        /*
         * Step 2:
         * 2 is the smallest prime number.
         * It has only two factors: 1 and 2.
         */
        else if (n == 2) {
            System.out.println("n is prime");
        }

        /*
         * Step 3:
         * For numbers greater than 2, check whether
         * any number from 2 to sqrt(n) divides n.
         *
         * We use i * i <= n instead of i <= n - 1
         * because it is more efficient.
         */
        else {
            // Assume the number is prime initially
            boolean isprime = true;

            /*
             * Loop from 2 to square root of n.
             * If any divisor is found, the number is not prime.
             */
            for (int i = 2; i * i <= n; i++) {

                /*
                 * If n is divisible by i,
                 * then n has another factor besides 1 and itself.
                 */
                if (n % i == 0) {

                    // Mark as not prime
                    isprime = false;

                    // No need to continue checking further
                    break;
                }
            }

            /*
             * Step 4:
             * Print the final result based on isprime value
             */
            if (isprime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }

        // Close Scanner object
        sc.close();
    }

    /*
     * ==========================================
     * IMPORTANT NOTES FOR REVISION:
     * ==========================================
     * 1. A prime number has exactly two factors:
     *    1 and itself.
     *
     * 2. 1 is not a prime number.
     *
     * 3. 2 is the smallest prime number.
     *
     * 4. If a number is divisible by any number
     *    from 2 to sqrt(n), it is not prime.
     *
     * 5. Using i * i <= n is better than checking
     *    up to n - 1 because it reduces time.
     *
     * 6. If a divisor is found, break the loop early.
     *    This improves efficiency.
     *
     * ==========================================
     * COMMON BEGINNER MISTAKES:
     * ==========================================
     * 1. Treating 1 as a prime number.
     *
     * 2. Checking divisibility up to n - 1
     *    instead of using sqrt(n) optimization.
     *
     * 3. Forgetting to stop the loop after finding
     *    the first divisor.
     *
     * 4. Not handling n <= 1 properly.
     *
     * 5. Using isprime = true without changing it
     *    when a divisor is found.
     *
     * ==========================================
     * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
     * ==========================================
     * "This program checks whether a number is prime
     * or not. First, I handle the special cases:
     * numbers less than or equal to 1 are not prime,
     * and 2 is prime. For other numbers, I check
     * divisibility from 2 up to the square root of n.
     * If any divisor is found, I mark the number as
     * not prime. Otherwise, it is prime."
     *
     * ==========================================
     * TIME COMPLEXITY & SPACE COMPLEXITY:
     * ==========================================
     * TIME COMPLEXITY:
     * O(sqrt(n))
     * because the loop runs only up to the square root.
     *
     * SPACE COMPLEXITY:
     * O(1)
     * because only a few variables are used.
     *
     * ==========================================
     * INTERVIEW QUICK ANSWER:
     * ==========================================
     * Q: What is a prime number?
     *
     * Answer:
     * A prime number is a number greater than 1
     * that has exactly two factors:
     * 1 and itself.
     *
     * ------------------------------------------
     *
     * Q: Why do we check only up to sqrt(n)?
     *
     * Answer:
     * If a number has a factor greater than
     * its square root, it must also have a factor
     * smaller than its square root. So checking
     * up to sqrt(n) is enough.
     *
     * ------------------------------------------
     *
     * Q: Why is 1 not prime?
     *
     * Answer:
     * Because prime numbers must have exactly two
     * factors, and 1 has only one factor: itself.
     */
}