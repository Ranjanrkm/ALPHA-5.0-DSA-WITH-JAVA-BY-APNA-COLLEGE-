import java.util.*;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to print the day of the week
 * based on an integer entered by the user.
 *
 * Day Mapping:
 * 1 -> monday
 * 2 -> tuesday
 * 3 -> wednesday
 * 4 -> thursday
 * 5 -> friday
 * 6 -> saturday
 * 7 -> sunday
 *
 * If the entered number is not between 1 and 7,
 * print:
 * invalid input! please enter week number between (1 to 7)
 *
 * This program demonstrates:
 * - User Input
 * - switch-case statement
 * - break statement
 * - default case
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * A single integer representing the week number.
 *
 * Example:
 * 5
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print the corresponding day name.
 *
 * Example:
 * friday
 *
 * ==========================================
 * Dry Run Example 1:
 * ==========================================
 * Input:
 * 1
 *
 * Step 1:
 * week = 1
 *
 * Step 2:
 * switch(week) executes
 *
 * Step 3:
 * case 1 matches
 *
 * Step 4:
 * Print:
 * monday
 *
 * Step 5:
 * break executes and exits switch
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
 * Step 1:
 * week = 5
 *
 * Step 2:
 * switch(week) executes
 *
 * Step 3:
 * case 5 matches
 *
 * Step 4:
 * Print:
 * friday
 *
 * Output:
 * friday
 *
 * ==========================================
 * Dry Run Example 3:
 * ==========================================
 * Input:
 * 10
 *
 * Step 1:
 * week = 10
 *
 * Step 2:
 * switch(week) executes
 *
 * Step 3:
 * No case matches
 *
 * Step 4:
 * default block executes
 *
 * Output:
 * invalid input! please enter week number between (1 to 7)
 */

public class dayofweek {

    public static void main(String args[]) {

        // Create Scanner object to take input from keyboard
        Scanner sc = new Scanner(System.in);

        // Safety check:
        // If input is not an integer, terminate safely
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        // Read week number entered by the user
        // Example:
        // Input: 5
        // week = 5
        int week = sc.nextInt();

        /*
         * switch statement compares the value
         * of variable 'week' with different cases.
         */
        switch (week) {

            // If week number is 1
            case 1:

                // Print Monday
                System.out.println("monday");

                // Exit switch block
                break;

            // If week number is 2
            case 2:

                // Print Tuesday
                System.out.println("tuesday");

                // Exit switch block
                break;

            // If week number is 3
            case 3:

                // Print Wednesday
                System.out.println("wednesday");

                // Exit switch block
                break;

            // If week number is 4
            case 4:

                // Print Thursday
                System.out.println("thursday");

                // Exit switch block
                break;

            // If week number is 5
            case 5:

                // Print Friday
                System.out.println("friday");

                // Exit switch block
                break;

            // If week number is 6
            case 6:

                // Print Saturday
                System.out.println("saturday");

                // Exit switch block
                break;

            // If week number is 7
            case 7:

                // Print Sunday
                System.out.println("sunday");

                // Exit switch block
                break;

            // Executes when no case matches
            default:

                // Print error message
                System.out.println(
                        "invalid input! please enter week number between (1 to 7)");
        }

        // Close Scanner to release resources
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. switch is used when one variable
 *    needs to be compared with multiple
 *    fixed values.
 *
 * 2. break is very important.
 *
 *    Without break,
 *    execution continues to the next case.
 *
 * 3. This behavior is called:
 *
 *    Fall-Through
 *
 * 4. default block executes when
 *    no case matches.
 *
 * 5. switch improves readability compared
 *    to multiple if-else statements when
 *    checking fixed values.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting break statement.
 *
 * Result:
 * Multiple cases may execute.
 *
 * 2. Missing default case.
 *
 * Invalid inputs may not produce output.
 *
 * 3. Wrong output spelling.
 *
 * Example:
 * "Friday" instead of "friday"
 *
 * Online judges may mark it wrong.
 *
 * 4. Printing unnecessary prompts:
 *
 * System.out.println("Enter week:");
 *
 * Avoid this in coding platforms like:
 * - TCS NQT
 * - HackerRank
 * - CodeChef
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program takes a week number as input
 * and uses a switch statement to print the
 * corresponding day name. Each case represents
 * a valid day number from 1 to 7. I used break
 * statements to prevent fall-through behavior.
 * A default block handles invalid inputs that
 * are outside the valid range."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 *
 * switch checks against a fixed number
 * of cases.
 *
 * SPACE COMPLEXITY: O(1)
 *
 * Only one integer variable and one
 * Scanner object are used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: What is a switch statement?
 *
 * Answer:
 * A switch statement is a selection control
 * structure used to compare one variable
 * against multiple fixed values.
 *
 * ------------------------------------------
 *
 * Q: What happens if break is removed?
 *
 * Answer:
 * Java continues executing the next cases.
 * This behavior is called Fall-Through.
 *
 * ------------------------------------------
 *
 * Q: Why use switch instead of if-else?
 *
 * Answer:
 * switch makes code cleaner and more readable
 * when checking one variable against multiple
 * fixed values.
 *
 * ------------------------------------------
 *
 * Q: What is the purpose of default?
 *
 * Answer:
 * default executes when none of the cases
 * match the input value.
 */