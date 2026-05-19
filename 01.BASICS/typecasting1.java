
/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate
 * explicit type casting in Java.
 *
 * The program demonstrates:
 * - Arithmetic operations on byte datatype
 * - Type promotion in Java
 * - Explicit narrowing type casting
 *
 * In this program:
 * - A byte variable 'b' stores value 5.
 * - The value is multiplied by 2.
 * - Since arithmetic operations on byte automatically
 *   promote the result to int,
 *   explicit casting is required to store the result
 *   back into byte datatype.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print the final byte value after multiplication.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Step 1:
 * Initialize byte variable:
 * b = 5
 *
 * Step 2:
 * Multiply b by 2:
 * b * 2
 * = 5 * 2
 * = 10
 *
 * Step 3:
 * Java automatically promotes the result
 * from byte to int during arithmetic operations.
 *
 * So internally:
 * int temp = 10
 *
 * Step 4:
 * Explicitly cast int result back to byte:
 * (byte) 10
 *
 * Step 5:
 * Store result inside variable 'a':
 * a = 10
 *
 * Step 6:
 * Print value of a.
 *
 * Final Output:
 * 10
 */

public class typecasting1 {

    public static void main(String args[]) {

        // Store value 5 inside byte variable
        byte b = 5;

        /*
         * Arithmetic operation:
         * byte * int -> automatically becomes int
         *
         * So:
         * b * 2 returns int value
         *
         * Explicit type casting is required
         * to convert int back into byte.
         */

        byte a = (byte) (b * 2);

        // Print final result
        System.out.println(a);
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. In Java, arithmetic operations on:
 *    - byte
 *    - short
 *    - char
 *
 *    automatically promote the result to int.
 *
 * 2. Because of type promotion,
 *    this code gives error:
 *
 *    byte a = b * 2;
 *
 *    Error:
 *    possible lossy conversion from int to byte
 *
 * 3. To solve this issue,
 *    explicit type casting is required:
 *
 *    byte a = (byte)(b * 2);
 *
 * 4. Explicit type casting means:
 *    manually converting larger datatype
 *    into smaller datatype.
 *
 * 5. Type casting syntax:
 *
 *    (datatype) value
 *
 *    Example:
 *    int x = (int) 5.6;
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates explicit type casting
 * and type promotion in Java.
 * I initialized a byte variable with value 5.
 * During multiplication, Java automatically promotes
 * the byte result into int datatype.
 * Since the final result needs to be stored again
 * into a byte variable, I used explicit type casting
 * using (byte). Finally, the result gets printed."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Only one multiplication operation is performed.
 *
 * SPACE COMPLEXITY: O(1)
 * Only primitive variables are used.
 */