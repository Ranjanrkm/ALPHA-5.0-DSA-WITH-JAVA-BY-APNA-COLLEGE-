/*
=========================================================
1. Problem Statement
=========================================================

Write a Java program to print a Butterfly Pattern
using nested loops.

For n = 4, the pattern is:

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

The pattern consists of two halves:

1. Upper Half
   - Stars increase from 1 to n.
   - Spaces decrease accordingly.

2. Lower Half
   - Stars decrease from n to 1.
   - Spaces increase accordingly.

This is a classic nested-loop pattern problem
commonly asked in Java and DSA interviews.

=========================================================
2. Input Format
=========================================================

No input required.

The value of n is fixed as:

4

=========================================================
3. Output Format
=========================================================

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

=========================================================
4. Dry Run Example(s)
=========================================================

Example 1:

n = 4
i = 1

Left Stars  = 1
Spaces      = 2 * (4 - 1) = 6
Right Stars = 1

Output:
*      *

---------------------------------------------------------

Example 2:

n = 4
i = 4

Left Stars  = 4
Spaces      = 2 * (4 - 4) = 0
Right Stars = 4

Output:
********

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class buterfly {

    /*
     * This method prints the butterfly pattern.
     *
     * Parameter:
     * n -> Number of rows in one half of the butterfly.
     */
    public static void butterfly(int n) {

        /*
         * ==========================
         * UPPER HALF OF BUTTERFLY
         * ==========================
         *
         * Rows increase from 1 to n.
         */
        for (int i = 1; i <= n; i++) {

            /*
             * Print left-side stars.
             *
             * Row 1 -> 1 star
             * Row 2 -> 2 stars
             * ...
             * Row n -> n stars
             */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            /*
             * Print middle spaces.
             *
             * Formula:
             * 2 * (n - i)
             *
             * As rows increase,
             * spaces decrease.
             */
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            /*
             * Print right-side stars.
             *
             * Same count as left stars.
             */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            /*
             * Move to next line after
             * completing current row.
             */
            System.out.println();
        }

        /*
         * ==========================
         * LOWER HALF OF BUTTERFLY
         * ==========================
         *
         * Rows decrease from n to 1.
         */
        for (int i = n; i >= 1; i--) {

            /*
             * Print left-side stars.
             */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            /*
             * Print middle spaces.
             *
             * As rows decrease,
             * spaces increase.
             */
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            /*
             * Print right-side stars.
             */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            /*
             * Move to the next line.
             */
            System.out.println();
        }
    }

    public static void main(String args[]) {

        /*
         * Call butterfly() method
         * with n = 4.
         */
        butterfly(4);
    }
}

/*
=========================================================
6. Important Notes For Revision
=========================================================

1. Butterfly Pattern is based on the concept of
   symmetry using nested loops.

2. The formula 2 * (n - i) is frequently used
   to calculate dynamic spaces in pattern problems.

3. Outer loop controls rows, while inner loops
   control stars and spaces.

4. Pattern problems are commonly asked to test
   loop control, visualization skills, and
   nested loop understanding.

5. The Butterfly Pattern combines two mirrored
   right-angle triangles separated by spaces.

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program prints a Butterfly Pattern using
nested loops.

The pattern is divided into two parts.

In the upper half, the number of stars increases
from 1 to n while the spaces decrease.

In the lower half, the number of stars decreases
from n to 1 while the spaces increase.

I use three inner loops in each row:
one for left stars, one for middle spaces,
and one for right stars.

The formula 2 * (n - i) dynamically controls
the spacing between both wings of the butterfly."

=========================================================
8. Time Complexity
=========================================================

O(n²)

Reason:

For each row, stars and spaces are printed
using nested loops.

Total operations are proportional to n².

=========================================================
9. Space Complexity
=========================================================

O(1)

Reason:

No extra data structures are used.
Only loop variables are required.

=========================================================
10. Interview Quick Answer
=========================================================

Q1. Why is the Butterfly Pattern considered a
symmetry-based pattern?

Answer:
Because the left and right wings contain the same
number of stars and mirror each other around the
central spaces.

---------------------------------------------------------

Q2. Why is the formula 2 * (n - i) used?

Answer:
It calculates the exact number of spaces needed
between the two wings. As i increases, spaces
decrease, creating the butterfly shape.

---------------------------------------------------------

Q3. What is the role of nested loops in this pattern?

Answer:
The outer loop controls rows, while the inner loops
separately print left stars, spaces, and right stars,
allowing precise pattern construction.
=========================================================
*/
