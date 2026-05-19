
/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to demonstrate
 * Type Promotion in Java.
 *
 * The program demonstrates:
 * - Automatic datatype promotion during arithmetic operations
 * - Mixed datatype calculations
 * - Final result conversion into the largest datatype
 *
 * In this program:
 * - int, float, long, and double values are added together.
 * - Java automatically promotes smaller datatypes
 *   into the largest datatype involved in the expression.
 * - The final result is stored in double datatype.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input is required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print the final calculated result after addition.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Values:
 *
 * a = 10          -> int
 * b = 20.25f      -> float
 * c = 25          -> long
 * d = 30          -> double
 *
 * Step-by-step working:
 *
 * Step 1:
 * Java starts evaluating:
 *
 * a + b + c + d
 *
 * Step 2:
 * int a converts into float
 *
 * 10 -> 10.0
 *
 * Step 3:
 * long c also converts into float temporarily.
 *
 * 25 -> 25.0
 *
 * Step 4:
 * Since double is present,
 * all values finally convert into double.
 *
 * Final calculation:
 *
 * 10.0 + 20.25 + 25.0 + 30.0
 * = 85.25
 *
 * Step 5:
 * Store result into double variable 'ans'
 *
 * Step 6:
 * Print ans
 *
 * ==========================================
 * Final Output:
 * ==========================================
 * 85.25
 */

import java.util.*;

public class typepromotion {

    public static void main(String args[]) {

        /*
         * Example 1:
         * Character Type Promotion
         *
         * char a = 'a';
         * char b = 'b';
         *
         * System.out.println((int)(b));
         * Output: 98
         *
         * System.out.println((int)(a));
         * Output: 97
         *
         * System.out.println(b - a);
         * Output: 1
         *
         * Explanation:
         * Java converts char values into integer ASCII values
         * during arithmetic operations.
         */

        // Integer datatype
        int a = 10;

        // Float datatype
        float b = 20.25f;

        // Long datatype
        long c = 25;

        // Double datatype
        double d = 30;

        /*
         * Type Promotion Rule:
         *
         * During arithmetic operations,
         * Java automatically promotes all smaller datatypes
         * into the largest datatype present in the expression.
         *
         * Here:
         * int -> float -> double
         * long -> double
         *
         * Final datatype becomes double.
         */

        double ans = a + b + c + d;

        // Print final result
        System.out.println(ans);
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Type Promotion means automatic conversion
 *    of smaller datatypes into larger datatypes
 *    during expressions or arithmetic operations.
 *
 * 2. Java follows these important promotion rules:
 *
 *    byte  -> int
 *    short -> int
 *    char  -> int
 *
 * 3. If multiple datatypes are present,
 *    Java converts everything into the largest datatype.
 *
 * Example:
 *
 * int + float -> float
 * float + double -> double
 * int + double -> double
 *
 * 4. Final answer datatype depends on
 *    the largest datatype in the expression.
 *
 * 5. ASCII values are used when characters
 *    participate in arithmetic operations.
 *
 * Example:
 * 'a' -> 97
 * 'b' -> 98
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates type promotion in Java.
 * I created variables of different datatypes such as
 * int, float, long, and double.
 * During the arithmetic addition operation,
 * Java automatically converts all smaller datatypes
 * into the largest datatype involved in the expression,
 * which is double in this case.
 * Therefore, the final result is stored safely
 * inside a double variable and then printed."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Only one arithmetic expression is evaluated.
 *
 * SPACE COMPLEXITY: O(1)
 * Only primitive variables are used.
 */