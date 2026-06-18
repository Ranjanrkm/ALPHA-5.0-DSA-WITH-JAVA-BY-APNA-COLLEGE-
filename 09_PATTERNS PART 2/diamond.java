import java.util.*;

/*
=========================================================
1. Problem Statement
=========================================================

Write a Java program to print a Diamond Pattern
using stars (*).

The program should:

1. Take the number of rows (n) as input.
2. Print the upper half of the diamond.
3. Print the lower half of the diamond.
4. Use nested loops for spaces and stars.

Example for n = 4:

   *
  ***
 *****
*******
*******
 *****
  ***
   *

This is a classic pattern problem used to test
nested loops, symmetry, and pattern visualization.

=========================================================
2. Input Format
=========================================================

A single integer n representing the number of rows
for one half of the diamond.

Example:
4

=========================================================
3. Output Format
=========================================================

Print the diamond pattern.

Example Output for n = 4:

   *
  ***
 *****
*******
*******
 *****
  ***
   *

=========================================================
4. Dry Run Example(s)
=========================================================

Example 1:

Input:
3

Row 1:
Spaces = 2
Stars  = 1

Output:
  *

---------------------------------------------------------

Example 2:

Input:
4

Row 4:
Spaces = 0
Stars  = 7

Output:
*******

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class diamond {

    /*
     * Method Name : Diamond
     *
     * Purpose:
     * Prints a diamond pattern of stars.
     *
     * Parameter:
     * n -> Number of rows in one half of the diamond.
     */
    public static void Diamond(int n) {

        /*
         * =====================================================
         * UPPER HALF OF DIAMOND
         * =====================================================
         *
         * Row number increases from 1 to n.
         */
        for (int i = 1; i <= n; i++) {

            /*
             * Print leading spaces.
             *
             * Formula:
             * n - i
             *
             * As row number increases,
             * spaces decrease.
             */
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            /*
             * Print stars.
             *
             * Formula:
             * (2 * i) - 1
             *
             * Generates:
             * 1, 3, 5, 7, ...
             */
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            /*
             * Move cursor to next line
             * after completing current row.
             */
            System.out.println();
        }

        /*
         * =====================================================
         * LOWER HALF OF DIAMOND
         * =====================================================
         *
         * Row number decreases from n to 1.
         */
        for (int i = n; i >= 1; i--) {

            /*
             * Print leading spaces.
             *
             * As row number decreases,
             * spaces increase.
             */
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            /*
             * Print stars.
             *
             * Formula:
             * (2 * i) - 1
             */
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            /*
             * Move to next line.
             */
            System.out.println();
        }
    }

    public static void main(String args[]) {

        /*
         * Scanner object used for taking input
         * according to TCS NQT style.
         */
        Scanner sc = new Scanner(System.in);

        /*
         * Read the number of rows.
         */
        int n = sc.nextInt();

        /*
         * Call Diamond method.
         */
        Diamond(n);

        /*
         * Close scanner resource.
         */
        sc.close();
    }
}

/*
=========================================================
6. Important Notes For Revision
=========================================================

1. Diamond Pattern is based on horizontal symmetry
   and uses nested loops extensively.

2. Formula (2 * i - 1) generates odd numbers:
   1, 3, 5, 7, ... which control star count.

3. Formula (n - i) controls left padding and
   maintains proper alignment.

4. Pattern questions mainly test nested loops,
   iteration control, and visualization skills.

5. Similar logic is used in Pyramid, Hollow Pyramid,
   Diamond, and Pascal-related pattern questions.

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program prints a diamond pattern using nested
loops.

I divide the pattern into two parts:
the upper half and the lower half.

For each row, I first print the required number
of spaces using the formula (n - i).

Then I print stars using the formula
(2 * i - 1), which generates odd numbers.

The upper half increases row by row,
while the lower half decreases row by row,
creating a symmetric diamond shape.

This solution demonstrates nested loop control,
pattern visualization, and mathematical sequence
generation."

=========================================================
8. Time Complexity
=========================================================

O(n²)

Reason:

For each row, multiple spaces and stars
are printed using nested loops.

Total operations are proportional to n².

=========================================================
9. Space Complexity
=========================================================

O(1)

Reason:

No additional data structures are used.

Only loop variables are required.

=========================================================
10. Interview Quick Answer
=========================================================

Q1. Why do we use (2 * i - 1) for stars?

Answer:
It generates odd numbers:
1, 3, 5, 7, ...

which are required to maintain the
symmetric diamond structure.

---------------------------------------------------------

Q2. Why is the time complexity O(n²)?

Answer:
For every row, spaces and stars are printed
using nested loops, resulting in approximately
n² total operations.

---------------------------------------------------------

Q3. Which Java concept is most important in this
program?

Answer:
Nested Loops.

The outer loop controls rows, while inner loops
control spaces and stars, making nested loops
the core concept behind pattern programming.
=========================================================
*/