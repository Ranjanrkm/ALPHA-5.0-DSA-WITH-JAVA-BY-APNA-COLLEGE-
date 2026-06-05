/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to determine whether a person
 * has a fever based on their body temperature.
 *
 * Condition:
 * - If temperature is greater than or equal to 100°F,
 *   print "i have a fever".
 * - Otherwise, print "i don't have fever".
 *
 * This program demonstrates:
 * - if-else statement
 * - Relational operators
 * - Decision making in Java
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * Hardcoded Value:
 * temp = 103.5
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print:
 *
 * i have a fever
 *
 * OR
 *
 * i don't have fever
 *
 * depending on the temperature.
 *
 * ==========================================
 * Dry Run Example 1:
 * ==========================================
 * temp = 103.5
 *
 * Step 1:
 * Check condition:
 *
 * temp >= 100
 *
 * Step 2:
 *
 * 103.5 >= 100
 *
 * TRUE
 *
 * Step 3:
 * Enter if block.
 *
 * Step 4:
 * Print:
 *
 * i have a fever
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * temp = 98.6
 *
 * Step 1:
 * Check condition:
 *
 * temp >= 100
 *
 * Step 2:
 *
 * 98.6 >= 100
 *
 * FALSE
 *
 * Step 3:
 * Enter else block.
 *
 * Step 4:
 * Print:
 *
 * i don't have fever
 */

public class fever {

    public static void main(String args[]) {

        // Store body temperature in a variable.
        // double is used because temperature values
        // may contain decimal numbers such as:
        // 98.6, 99.5, 101.2 etc.
        double temp = 103.5;

        // Check whether the temperature is
        // greater than or equal to 100°F.
        // If yes, the person is assumed to have a fever.
        if (temp >= 100) {

            // This block executes only when
            // the condition evaluates to TRUE.
            System.out.println("i have a fever");

        } else {

            // This block executes when
            // the condition evaluates to FALSE.
            System.out.println("i don't have fever");
        }
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. if statement executes when the condition
 *    evaluates to TRUE.
 *
 * 2. else statement executes when the condition
 *    evaluates to FALSE.
 *
 * 3. Relational Operators:
 *
 *    >   Greater Than
 *    <   Less Than
 *    >=  Greater Than or Equal To
 *    <=  Less Than or Equal To
 *    ==  Equal To
 *    !=  Not Equal To
 *
 * 4. double is preferred when decimal values
 *    are involved.
 *
 * 5. if-else is one of the most important
 *    decision-making statements in Java.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Using assignment operator (=)
 *    instead of comparison logic.
 *
 * Wrong:
 * temp = 100;
 *
 * 2. Writing incorrect condition.
 *
 * Wrong:
 * temp > 100
 *
 * This excludes exactly 100.
 *
 * Correct:
 * temp >= 100
 *
 * 3. Using int instead of double when
 *    decimal temperatures are required.
 *
 * 4. Forgetting braces in larger if-else blocks.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates conditional
 * decision-making using an if-else statement.
 * A temperature value is stored in a double
 * variable. The program checks whether the
 * temperature is greater than or equal to 100°F.
 * If the condition is true, it prints that the
 * person has a fever; otherwise, it prints that
 * the person does not have a fever."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 * O(1)
 *
 * Only one comparison operation is performed.
 *
 * SPACE COMPLEXITY:
 * O(1)
 *
 * Only one variable is used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: Why is if-else used?
 *
 * Answer:
 * if-else is used when a program needs to choose
 * between two possible execution paths based on
 * a condition.
 *
 * ------------------------------------------
 *
 * Q: Why is double used here?
 *
 * Answer:
 * Temperature values often contain decimal
 * numbers such as 98.6 or 101.5, so double
 * is more suitable than int.
 *
 * ------------------------------------------
 *
 * Q: What does >= mean?
 *
 * Answer:
 * It means "greater than or equal to".
 * The condition becomes true for both
 * 100 and values greater than 100.
 */