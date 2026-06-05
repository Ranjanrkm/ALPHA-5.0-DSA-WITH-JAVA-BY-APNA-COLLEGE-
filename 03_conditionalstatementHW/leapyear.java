import java.util.Scanner;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to determine whether a given
 * year is a Leap Year or Not.
 *
 * A year is considered a Leap Year if:
 *
 * Rule 1:
 * The year is exactly divisible by 400.
 *
 * OR
 *
 * Rule 2:
 * The year is exactly divisible by 4
 * AND not divisible by 100.
 *
 * Examples:
 * 2000 -> Leap Year
 * 2024 -> Leap Year
 * 1900 -> Not Leap Year
 * 2100 -> Not Leap Year
 *
 * The program should correctly handle
 * century year edge cases.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * A single integer representing the year.
 *
 * Example:
 * 2024
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print:
 *
 * <year> is a leap year
 *
 * OR
 *
 * <year> is not a leap year
 *
 * Example:
 * 2024 is a leap year
 *
 * ==========================================
 * Dry Run Example 1:
 * ==========================================
 * Input:
 * 1900
 *
 * Step 1:
 * year = 1900
 *
 * Step 2:
 * Check:
 *
 * year % 400 == 0
 *
 * 1900 % 400 = 300
 *
 * FALSE
 *
 * Step 3:
 * Check:
 *
 * year % 4 == 0
 *
 * TRUE
 *
 * Step 4:
 * Check:
 *
 * year % 100 != 0
 *
 * 1900 % 100 = 0
 *
 * FALSE
 *
 * Step 5:
 *
 * TRUE && FALSE
 *
 * FALSE
 *
 * Step 6:
 *
 * FALSE || FALSE
 *
 * FALSE
 *
 * Output:
 * 1900 is not a leap year
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input:
 * 2024
 *
 * Step 1:
 * year = 2024
 *
 * Step 2:
 *
 * year % 400 == 0
 *
 * FALSE
 *
 * Step 3:
 *
 * year % 4 == 0
 *
 * TRUE
 *
 * Step 4:
 *
 * year % 100 != 0
 *
 * TRUE
 *
 * Step 5:
 *
 * TRUE && TRUE
 *
 * TRUE
 *
 * Step 6:
 *
 * FALSE || TRUE
 *
 * TRUE
 *
 * Output:
 * 2024 is a leap year
 */

public class leapyear {

    public static void main(String[] args) {

        // Create Scanner object to read input
        // from standard input (keyboard/online judge)
        Scanner sc = new Scanner(System.in);

        // Safety check:
        // If input is not an integer,
        // terminate the program safely.
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        // Read the year entered by the user.
        //
        // Example:
        // Input:
        // 2024
        //
        // After execution:
        // year = 2024
        int year = sc.nextInt();

        /*
         * Leap Year Logic
         *
         * Rule 1:
         * If the year is divisible by 400,
         * it is always a leap year.
         *
         * Examples:
         * 2000
         * 2400
         *
         * Rule 2:
         * If the year is divisible by 4
         * but NOT divisible by 100,
         * it is also a leap year.
         *
         * Examples:
         * 2024
         * 2028
         *
         * This condition correctly handles
         * all leap year edge cases.
         */
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {

            // Print leap year message.
            //
            // Example:
            // 2024 is a leap year
            System.out.println(year + " is a leap year");

        } else {

            // Print non-leap year message.
            //
            // Example:
            // 1900 is not a leap year
            System.out.println(year + " is not a leap year");
        }

        // Close Scanner to release system resources
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. The most common mistake is checking only:
 *
 *    year % 4 == 0
 *
 *    This incorrectly marks 1900 as a leap year.
 *
 * ------------------------------------------
 *
 * 2. Century years must satisfy:
 *
 *    year % 400 == 0
 *
 * Examples:
 *
 * 2000 -> Leap Year
 * 2400 -> Leap Year
 * 1900 -> Not Leap Year
 * 2100 -> Not Leap Year
 *
 * ------------------------------------------
 *
 * 3. Java uses short-circuit evaluation.
 *
 * If:
 *
 * year % 400 == 0
 *
 * becomes TRUE,
 * Java does not evaluate the remaining condition.
 *
 * ------------------------------------------
 *
 * 4. Do not print prompts like:
 *
 * Enter Year:
 *
 * in TCS NQT, HackerRank, LeetCode,
 * CodeChef, Coding Ninjas etc.
 *
 * Extra output may fail test cases.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Checking only:
 *
 *    year % 4 == 0
 *
 * ------------------------------------------
 *
 * 2. Forgetting the century year rule.
 *
 * ------------------------------------------
 *
 * 3. Missing spaces while printing.
 *
 * Wrong:
 *
 * 2024is a leap year
 *
 * Correct:
 *
 * 2024 is a leap year
 *
 * ------------------------------------------
 *
 * 4. Printing extra prompts.
 *
 * Wrong:
 *
 * System.out.println("Enter Year:");
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program determines whether a year is a
 * leap year using the Gregorian calendar rules.
 * First, it checks whether the year is divisible
 * by 400. If yes, it is a leap year. Otherwise,
 * it checks whether the year is divisible by 4
 * and not divisible by 100. This approach handles
 * both normal years and century year edge cases
 * correctly. The solution runs in constant time
 * and uses constant memory."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(1)
 *
 * Only a few arithmetic and comparison
 * operations are performed.
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
 * Q: What is a Leap Year?
 *
 * Answer:
 * A Leap Year contains 366 days instead of 365.
 *
 * ------------------------------------------
 *
 * Q: Why is 1900 not a Leap Year?
 *
 * Answer:
 * Because it is divisible by 100
 * but not divisible by 400.
 *
 * ------------------------------------------
 *
 * Q: Why is 2000 a Leap Year?
 *
 * Answer:
 * Because it is divisible by 400.
 *
 * ------------------------------------------
 *
 * Q: What is the Leap Year Condition?
 *
 * Answer:
 *
 * (year % 400 == 0)
 * ||
 * (year % 4 == 0 && year % 100 != 0)
 *
 * ------------------------------------------
 *
 * Q: What is the Time Complexity?
 *
 * Answer:
 *
 * O(1)
 */