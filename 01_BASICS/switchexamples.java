/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate the use of a switch statement.
 * 
 * The program should:
 * - Read an integer choice from the user.
 * - Print a food item based on the entered number.
 *
 * Menu:
 * 1 -> samosa
 * 2 -> burger
 * 3 -> mango shake
 *
 * If the entered number does not match any case,
 * print:
 * "we wake up"
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer representing the menu choice.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Print the corresponding food item.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 2
 *
 * Step-by-step working:
 * 1. Initialize Scanner to read input from console.
 * 2. Read integer value into variable 'number'.
 * 3. switch(number) checks all cases one by one.
 * 4. case 2 matches successfully.
 * 5. Print "burger".
 * 6. break statement terminates switch execution.
 *
 * Output:
 * burger
 */

import java.util.Scanner;

public class switchexamples {

    public static void main(String[] args) {

        // 1. Create Scanner object to capture user input
        Scanner sc = new Scanner(System.in);

        // Safety check:
        // Prevents program crash if invalid input is provided
        if (!sc.hasNextInt()) return;

        // 2. Read integer input dynamically from user
        int number = sc.nextInt();

        // 3. switch statement compares the value of 'number'
        switch (number) {

            // Case executes when number = 1
            case 1:
                System.out.println("samosa");
                break;

            // Case executes when number = 2
            case 2:
                System.out.println("burger");
                break;

            // Case executes when number = 3
            case 3:
                System.out.println("mango shake");
                break;

            // Executes when no case matches
            default:
                System.out.println("we wake up");
        }

        // 4. Close scanner to release system resources
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. switch statement is used when one variable
 *    needs to be checked against multiple fixed values.
 *
 * 2. break statement is very important.
 *    Without break, Java executes the next cases also.
 *    This behavior is called "fall-through".
 *
 * 3. default block acts like the "else" condition
 *    in if-else statements.
 *
 * 4. switch supports:
 *    - int
 *    - char
 *    - String
 *    - enum
 *    - byte
 *    - short
 *
 * 5. switch does NOT support:
 *    - float
 *    - double
 *    directly in older Java versions.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the use of the switch
 * control statement in Java. I first take an integer
 * input from the user using Scanner. Then the switch
 * statement compares the entered value against multiple
 * predefined cases. Depending on the matched case,
 * the corresponding food item is printed. If no case
 * matches, the default block executes."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Since the number of cases is fixed,
 * execution happens in constant time.
 *
 * SPACE COMPLEXITY: O(1)
 * Only one integer variable and Scanner object are used.
 */