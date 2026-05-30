
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
 * This program demonstrates the use of:
 * - if-else statements
 * - Relational operators
 * - Decision-making in Java
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * The temperature is hardcoded:
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
 * depending on the temperature value.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Value:
 * temp = 103.5
 *
 * Step 1:
 * Program starts execution from main().
 *
 * Step 2:
 * Temperature value is assigned:
 * temp = 103.5
 *
 * Step 3:
 * Check condition:
 * temp >= 100
 *
 * Step 4:
 * Substitute actual value:
 * 103.5 >= 100
 *
 * Step 5:
 * Condition becomes TRUE.
 *
 * Step 6:
 * Control enters the if block.
 *
 * Step 7:
 * Print:
 * "i have a fever"
 *
 * Final Output:
 * i have a fever
 *
 * ==========================================
 * Dry Run Example 2:
 * ==========================================
 * Suppose:
 * temp = 98.6
 *
 * Step 1:
 * Check:
 * 98.6 >= 100
 *
 * Step 2:
 * Condition becomes FALSE.
 *
 * Step 3:
 * Control enters else block.
 *
 * Step 4:
 * Print:
 * "i don't have fever"
 *
 * Output:
 * i don't have fever
 */

import java.util.*;

public class fever {

    public static void main(String args[]) {

        // Store body temperature in a double variable
        double temp = 103.5;

        // Check whether temperature indicates fever
        if (temp >= 100) {

            // Executes when temperature is 100 or more
            System.out.println("i have a fever");

        } else {

            // Executes when temperature is below 100
            System.out.println("i don't have fever");
        }
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. if statement executes only when
 *    the condition evaluates to TRUE.
 *
 * 2. else statement executes when
 *    the condition evaluates to FALSE.
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
 * 4. double datatype is used because
 *    temperature values often contain decimals.
 *
 * Examples:
 * 98.6
 * 99.5
 * 101.2
 *
 * 5. Decision-making statements are one of the
 *    most important foundations of programming.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Using assignment operator (=)
 *    instead of comparison operator.
 *
 * Wrong:
 * if(temp = 100)
 *
 * Correct:
 * if(temp >= 100)
 *
 * 2. Forgetting curly braces { }
 *    in larger if-else blocks.
 *
 * 3. Using int instead of double
 *    when decimal values are involved.
 *
 * 4. Writing incorrect condition.
 *
 * Wrong:
 * if(temp > 100)
 *
 * This excludes exactly 100.
 *
 * Correct:
 * if(temp >= 100)
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates conditional decision-making
 * using an if-else statement in Java.
 * A temperature value is stored in a double variable.
 * The program checks whether the temperature is greater
 * than or equal to 100°F. If the condition is true,
 * it prints 'i have a fever'; otherwise, it prints
 * 'i don't have fever'. This is a basic example of
 * using relational operators with conditional statements."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Only one comparison operation is performed.
 *
 * SPACE COMPLEXITY: O(1)
 * Only one primitive variable is used.
 */