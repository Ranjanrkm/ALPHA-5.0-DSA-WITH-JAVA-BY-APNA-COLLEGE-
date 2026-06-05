
/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate
 * type conversion in Java.
 *
 * The program demonstrates:
 * - Implicit Type Conversion (Widening)
 * - Reading integer input using Scanner
 * - Automatically storing integer data into float datatype
 *
 * In this program:
 * - User enters an integer value.
 * - Java automatically converts the integer
 *   into float datatype.
 * - The converted float value is printed.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer number.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - Print the converted float value.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 25
 *
 * Step-by-step working:
 * 1. Create Scanner object to take input.
 * 2. Read integer value using nextInt().
 * 3. Store integer value into float variable.
 * 4. Java automatically converts:
 *
 *    int -> float
 *
 * 5. number = 25.0
 * 6. Print the float value.
 *
 * Output:
 * 25.0
 */

import java.util.*;

public class typeconversions {

    public static void main(String args[]) {

        /*
         * Example of Type Conversion:
         *
         * int a = 25;
         * long b = a;
         *
         * Java automatically converts int into long
         * because long has larger storage capacity.
         */

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Safety check:
        // Prevents runtime crash if invalid input is entered
        if (!sc.hasNextInt()) return;

        /*
         * Read integer input using nextInt()
         * and store it inside float variable.
         *
         * Java automatically converts:
         * int -> float
         *
         * This process is called:
         * Implicit Type Conversion
         * or
         * Widening Conversion
         */
        float number = sc.nextInt();

        // Print the converted float value
        System.out.println(number);

        // Close Scanner object
        sc.close();
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Type Conversion means automatic conversion
 *    of one datatype into another compatible datatype.
 *
 * 2. Java performs automatic conversion when:
 *    - Datatypes are compatible
 *    - Destination datatype is larger
 *
 * 3. This is also called:
 *    - Widening Conversion
 *    - Implicit Type Conversion
 *
 * 4. Example of valid automatic conversions:
 *
 *    byte -> short
 *    short -> int
 *    int -> long
 *    int -> float
 *    float -> double
 *
 * 5. Invalid automatic conversion:
 *
 *    float -> int
 *
 *    This requires explicit casting.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates implicit type conversion
 * in Java. I used Scanner to read an integer input
 * from the user. The integer value is automatically
 * stored inside a float variable because float has
 * a larger storage capacity than int.
 * Java performs this conversion automatically,
 * which is known as widening or implicit type conversion.
 * Finally, the converted float value is printed."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Only one input operation and one print operation occur.
 *
 * SPACE COMPLEXITY: O(1)
 * Only primitive variables and Scanner object are used.
 */