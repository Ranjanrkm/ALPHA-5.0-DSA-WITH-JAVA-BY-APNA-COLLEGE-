/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to print the day of the week
 * based on an integer entered by the user.
 *
 * The program should:
 * - Read an integer from the standard input
 * - Use switch-case to match the number
 * - Print the corresponding day name
 *
 * Mapping:
 * 1 -> monday
 * 2 -> tuesday
 * 3 -> wednesday
 * 4 -> thursday
 * 5 -> friday
 * 6 -> saturday
 * 7 -> sunday
 *
 * If the input is not between 1 and 7,
 * print:
 * invalid input! please enter week number between (1 to 7)
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer representing the week number.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Print the corresponding day name in lowercase.
 * - If the number is invalid, print the default
 *   error message exactly as required.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Example 1:
 * Input:
 * 1
 *
 * Step-by-step working:
 * 1. Create Scanner object to read input.
 * 2. Read integer value into variable 'week' -> week = 1.
 * 3. switch(week) checks all cases.
 * 4. case 1 matches.
 * 5. Print "monday".
 * 6. break stops the switch block.
 *
 * Output:
 * monday
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Input:
 * 5
 *
 * Step-by-step working:
 * 1. Read integer value into variable 'week' -> week = 5.
 * 2. switch(week) checks all cases.
 * 3. case 5 matches.
 * 4. Print "friday".
 * 5. break stops the switch block.
 *
 * Output:
 * friday
 *
 * ==========================================
 * Dry Run Example 3:
 * ==========================================
 * Input:
 * 9
 *
 * Step-by-step working:
 * 1. Read integer value into variable 'week' -> week = 9.
 * 2. switch(week) checks all cases.
 * 3. No case matches.
 * 4. default block executes.
 * 5. Print invalid input message.
 *
 * Output:
 * invalid input! please enter week number between (1 to 7)
 */

import java.util.*;

public class dayofweek {

    public static void main(String args[]) {

        // 1. Create Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Safety check:
        // If input is not an integer, stop the program safely
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        // 2. Read the week number entered by the user
        int week = sc.nextInt();

        // 3. Use switch-case to match the input with the correct day
        switch (week) {

            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("invalid input! please enter week number between (1 to 7)");
        }

        // 4. Close Scanner object after use
        sc.close();
    }

    /*
     * ==========================================
     * IMPORTANT NOTES FOR REVISION:
     * ==========================================
     * 1. switch is used when one variable needs to be
     *    matched against multiple fixed values.
     *
     * 2. break is very important in each case.
     *    Without break, Java will continue executing
     *    the next cases also.
     *    This is called fall-through.
     *
     * 3. default block runs when no case matches.
     *
     * 4. In coding platforms, avoid extra prompts like:
     *    System.out.println("enter week:");
     *    because extra output can fail hidden test cases.
     *
     * 5. Keep output exactly as required.
     *    Spelling, spaces, lowercase/uppercase, and
     *    punctuation all matter in online judges.
     *
     * ==========================================
     * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
     * ==========================================
     * "This program uses a switch statement to print
     * the day of the week based on the input number.
     * I first take an integer input using Scanner.
     * Then the switch statement compares the value with
     * cases 1 to 7 and prints the corresponding day.
     * I also included a default block to handle invalid
     * inputs outside the range 1 to 7."
     *
     * ==========================================
     * TIME COMPLEXITY & SPACE COMPLEXITY:
     * ==========================================
     * TIME COMPLEXITY: O(1)
     * The switch statement checks a fixed number of cases,
     * so the execution time is constant.
     *
     * SPACE COMPLEXITY: O(1)
     * Only one integer variable and one Scanner object
     * are used, so space usage is constant.
     *
     * ==========================================
     * COMMON BEGINNER MISTAKES:
     * ==========================================
     * 1. Forgetting break statements
     *    This causes unwanted fall-through.
     *
     * 2. Printing prompts in competitive coding
     *    Extra messages may cause Wrong Answer.
     *
     * 3. Wrong spelling in output
     *    The output must match exactly.
     *
     * 4. Missing default case
     *    Then invalid input may produce no output.
     */
}
