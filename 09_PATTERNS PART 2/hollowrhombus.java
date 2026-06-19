import java.util.*;

/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to print a Hollow Rhombus
 * Pattern using stars (*).
 *
 * A Hollow Rhombus is formed by:
 *
 * 1. Printing leading spaces in every row.
 * 2. Printing stars only on the boundary.
 * 3. Printing spaces inside the boundary.
 *
 * Example:
 *
 * Input:
 * 5
 *
 * Output:
 *
 *     *****
 *    *   *
 *   *   *
 *  *   *
 * *****
 *
 * This problem helps in understanding:
 * - Nested Loops
 * - Boundary Conditions
 * - Pattern Printing Logic
 * - Loop Tracing
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * A single integer n.
 *
 * Example:
 * 5
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * Print the Hollow Rhombus Pattern.
 *
 * Example:
 *
 *     *****
 *    *   *
 *   *   *
 *  *   *
 * *****
 *
 * ==========================================
 * Dry Run Example 1 (Complete Execution)
 * ==========================================
 *
 * Input:
 * 5
 *
 * ------------------------------------------
 * Row 1
 * ------------------------------------------
 *
 * i = 1
 *
 * Space Loop:
 *
 * j=1 -> print space
 * j=2 -> print space
 * j=3 -> print space
 * j=4 -> print space
 *
 * Current Output:
 *
 * "    "
 *
 * Star Loop:
 *
 * j=1 -> i==1 -> print *
 * j=2 -> i==1 -> print *
 * j=3 -> i==1 -> print *
 * j=4 -> i==1 -> print *
 * j=5 -> i==1 -> print *
 *
 * Row Generated:
 *
 *     *****
 *
 * ------------------------------------------
 * Row 2
 * ------------------------------------------
 *
 * i = 2
 *
 * Space Loop:
 *
 * j=1 -> print space
 * j=2 -> print space
 * j=3 -> print space
 *
 * Current Output:
 *
 * "   "
 *
 * Star Loop:
 *
 * j=1 -> first column -> *
 * j=2 -> inside area -> space
 * j=3 -> inside area -> space
 * j=4 -> inside area -> space
 * j=5 -> last column -> *
 *
 * Row Generated:
 *
 *    *   *
 *
 * ------------------------------------------
 * Row 3
 * ------------------------------------------
 *
 * i = 3
 *
 * Space Loop:
 *
 * j=1 -> print space
 * j=2 -> print space
 *
 * Current Output:
 *
 * "  "
 *
 * Star Loop:
 *
 * j=1 -> first column -> *
 * j=2 -> inside area -> space
 * j=3 -> inside area -> space
 * j=4 -> inside area -> space
 * j=5 -> last column -> *
 *
 * Row Generated:
 *
 *   *   *
 *
 * ------------------------------------------
 * Row 4
 * ------------------------------------------
 *
 * i = 4
 *
 * Space Loop:
 *
 * j=1 -> print space
 *
 * Current Output:
 *
 * " "
 *
 * Star Loop:
 *
 * j=1 -> first column -> *
 * j=2 -> inside area -> space
 * j=3 -> inside area -> space
 * j=4 -> inside area -> space
 * j=5 -> last column -> *
 *
 * Row Generated:
 *
 *  *   *
 *
 * ------------------------------------------
 * Row 5
 * ------------------------------------------
 *
 * i = 5
 *
 * Space Loop:
 *
 * No spaces printed
 *
 * Star Loop:
 *
 * j=1 -> i==n -> *
 * j=2 -> i==n -> *
 * j=3 -> i==n -> *
 * j=4 -> i==n -> *
 * j=5 -> i==n -> *
 *
 * Row Generated:
 *
 * *****
 *
 * ------------------------------------------
 * Final Output
 * ------------------------------------------
 *
 *     *****
 *    *   *
 *   *   *
 *  *   *
 * *****
 *
 * ==========================================
 * Dry Run Example 2
 * ==========================================
 *
 * Input:
 * 4
 *
 * Row 1:
 *    ****
 *
 * Row 2:
 *   *  *
 *
 * Row 3:
 *  *  *
 *
 * Row 4:
 * ****
 *
 * Final Output:
 *
 *    ****
 *   *  *
 *  *  *
 * ****
 *
 * ==========================================
 * Fully Commented Java Code
 * ==========================================
 */

public class hollowrhombus {

    /*
     * Method Name:
     * hollow_rhombus
     *
     * Parameter:
     * n -> size of rhombus
     *
     * Purpose:
     * Prints a hollow rhombus pattern.
     */
    public static void hollow_rhombus(int n) {

        /*
         * Outer Loop
         *
         * Controls rows.
         *
         * i = 1 → First row
         * i = 2 → Second row
         * ...
         * i = n → Last row
         */
        for (int i = 1; i <= n; i++) {

            /*
             * Space Loop
             *
             * Prints leading spaces.
             *
             * Formula:
             * n - i
             *
             * Example:
             *
             * n=5
             *
             * Row1 -> 4 spaces
             * Row2 -> 3 spaces
             * Row3 -> 2 spaces
             * Row4 -> 1 space
             * Row5 -> 0 space
             */
            for (int j = 1; j <= (n - i); j++) {

                /*
                 * Print one space.
                 */
                System.out.print(" ");
            }

            /*
             * Rhombus Body Loop
             *
             * Prints stars and inner spaces.
             *
             * Total columns = n
             */
            for (int j = 1; j <= n; j++) {

                /*
                 * Boundary Condition
                 *
                 * First Row
                 * Last Row
                 * First Column
                 * Last Column
                 *
                 * If any condition is true,
                 * print star.
                 */
                if (i == 1 || i == n || j == 1 || j == n) {

                    /*
                     * Print boundary star.
                     */
                    System.out.print("*");

                } else {

                    /*
                     * Print inner space.
                     *
                     * Creates hollow effect.
                     */
                    System.out.print(" ");
                }
            }

            /*
             * Move cursor to next line
             * after completing one row.
             */
            System.out.println();
        }
    }

    /*
     * Main Method
     *
     * Program execution starts here.
     */
    public static void main(String args[]) {

        /*
         * Scanner object used to take input.
         *
         * Following TCS NQT style:
         * No prompts.
         */
        Scanner sc = new Scanner(System.in);

        /*
         * Read rhombus size.
         */
        int n = sc.nextInt();

        /*
         * Call pattern method.
         */
        hollow_rhombus(n);

        /*
         * Close scanner.
         */
        sc.close();
    }
}

/*
 * ==========================================
 * Important Notes For Revision
 * ==========================================
 *
 * 1. Boundary checking is the most important
 *    concept in hollow pattern problems.
 *
 *    i==1 || i==n || j==1 || j==n
 *
 * 2. Rhombus is created by printing
 *    leading spaces before every row.
 *
 * 3. Outer loop controls rows while
 *    inner loops control spaces and columns.
 *
 * 4. Logical OR Operator (||) is frequently
 *    asked in Java interviews.
 *
 * 5. Hollow patterns are derived from
 *    solid patterns by replacing inner
 *    stars with spaces.
 *
 * ==========================================
 * How To Explain This Code In Front Of
 * Interviewer
 * ==========================================
 *
 * "This program prints a Hollow Rhombus Pattern.
 *
 * I use three levels of logic.
 *
 * First, the outer loop controls rows.
 *
 * Second, a loop prints leading spaces,
 * which shifts every row and forms the
 * rhombus structure.
 *
 * Third, another loop prints the rhombus body.
 *
 * Using the boundary condition
 * (i==1 || i==n || j==1 || j==n),
 * I print stars only on the border.
 *
 * For all inner positions, I print spaces,
 * which creates the hollow effect."
 *
 * ==========================================
 * Time Complexity
 * ==========================================
 *
 * O(n²)
 *
 * Reason:
 *
 * Outer Loop  -> n
 * Inner Loop  -> n
 *
 * Total:
 *
 * n × n
 *
 * O(n²)
 *
 * ==========================================
 * Space Complexity
 * ==========================================
 *
 * O(1)
 *
 * No extra data structures are used.
 *
 * ==========================================
 * Interview Quick Answer
 * ==========================================
 *
 * Q1. Why do we use the condition
 *     (i==1 || i==n || j==1 || j==n)?
 *
 * Answer:
 * It identifies boundary cells.
 * Boundary cells print stars,
 * while inner cells print spaces,
 * creating the hollow pattern.
 *
 * ------------------------------------------
 *
 * Q2. Why is a rhombus formed by printing
 *     leading spaces?
 *
 * Answer:
 * The rectangle logic remains the same.
 * Leading spaces shift every row to the
 * right, transforming the rectangle into
 * a rhombus shape.
 *
 * ------------------------------------------
 *
 * Q3. If we remove the else block and print
 *     stars everywhere, what will happen?
 *
 * Answer:
 * The pattern will become a solid rhombus
 * because every position inside the shape
 * will contain a star instead of spaces.
 */