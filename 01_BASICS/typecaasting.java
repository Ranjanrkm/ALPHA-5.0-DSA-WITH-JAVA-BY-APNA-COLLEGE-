/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate
 * type casting in Java.
 *
 * The program demonstrates:
 * - Implicit Type Casting (Widening)
 * - Explicit Type Casting (Narrowing)
 * - Character to Integer conversion using ASCII values
 *
 * In this example:
 * - A character 'a' is stored in a char variable.
 * - The character is automatically converted into
 *   its ASCII integer value and printed.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print the ASCII value of character 'a'.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Step 1:
 * Store character:
 * ch = 'a'
 *
 * Step 2:
 * Assign character to integer variable:
 * number = ch
 *
 * Step 3:
 * Java automatically converts 'a'
 * into its ASCII value.
 *
 * ASCII value of 'a' = 97
 *
 * Step 4:
 * Print the integer value.
 *
 * Final Output:
 * 97
 */

public class typecaasting {

    public static void main(String ags[]) {

        /*
         * Example of Explicit Type Casting (Narrowing)
         * --------------------------------------------
         * float a = 25.12f;
         * int b = (int) a;
         *
         * Output:
         * 25
         *
         * Here decimal part gets removed because
         * float is converted into int manually.
         */

        // Store character 'a' inside char variable
        char ch = 'a';

        // Implicit Type Casting:
        // char automatically converts into int
        // because int has larger storage capacity
        int number = ch;

        // Print ASCII value of character 'a'
        System.out.println(number);
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Type Casting means converting one data type
 *    into another data type.
 *
 * 2. There are two types of type casting in Java:
 *
 *    A) Implicit Type Casting (Widening)
 *       Smaller datatype automatically converts
 *       into larger datatype.
 *
 *       Example:
 *       char -> int
 *       int -> long
 *       float -> double
 *
 *    B) Explicit Type Casting (Narrowing)
 *       Larger datatype manually converts
 *       into smaller datatype.
 *
 *       Example:
 *       double -> int
 *       float -> int
 *
 * 3. ASCII Value:
 *    Every character has a unique numeric value.
 *
 *    Example:
 *    'a' -> 97
 *    'A' -> 65
 *    '0' -> 48
 *
 * 4. When char converts into int,
 *    Java prints its ASCII value automatically.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates type casting in Java.
 * Here I stored the character 'a' inside a char variable.
 * Then I assigned it to an integer variable.
 * Java automatically converted the character into
 * its ASCII integer value using implicit type casting.
 * Finally, the ASCII value 97 gets printed."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Only one assignment and one print operation occur.
 *
 * SPACE COMPLEXITY: O(1)
 * Only primitive variables are used.
 */