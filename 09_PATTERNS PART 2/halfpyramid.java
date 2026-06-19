import java.util.*;

/*
=========================================================
1. Problem Statement
=========================================================

Write a Java program to print an Inverted Rotated
Half Pyramid Pattern using stars (*).

For n = 4, the pattern is:

   *
  **
 ***
****

The program should:

1. Take the number of rows (n) as input.
2. Print leading spaces before stars.
3. Print stars in increasing order.
4. Use nested loops to generate the pattern.

This pattern is commonly asked in Java, TCS NQT,
and DSA interviews to test understanding of
nested loops and pattern visualization.

=========================================================
2. Input Format
=========================================================

A single integer n representing the number of rows.

Example:
4

=========================================================
3. Output Format
=========================================================

Print the Inverted Rotated Half Pyramid.

Example Output:

   *
  **
 ***
****

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
Stars  = 4

Output:
****

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class halfpyramid {

    /*
     * Method Name:
     * inverted_rotated_half_pyramid
     *
     * Purpose:
     * Prints an inverted rotated half pyramid pattern.
     *
     * Parameter:
     * n -> Total number of rows.
     */
    public static void inverted_rotated_half_pyramid(int n) {

        /*
         * Outer loop controls the rows.
         *
         * Row numbers:
         * 1, 2, 3, ..., n
         */
        for (int i = 1; i <= n; i++) {

            /*
             * First inner loop prints spaces.
             *
             * Formula:
             * n - i
             *
             * Example for n = 4:
             * Row 1 -> 3 spaces
             * Row 2 -> 2 spaces
             * Row 3 -> 1 space
             * Row 4 -> 0 spaces
             */
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            /*
             * Second inner loop prints stars.
             *
             * Number of stars equals
             * current row number.
             *
             * Row 1 -> 1 star
             * Row 2 -> 2 stars
             * Row 3 -> 3 stars
             * Row 4 -> 4 stars
             */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            /*
             * Move cursor to next line
             * after completing current row.
             */
            System.out.println();
        }
    }

    public static void main(String args[]) {

        /*
         * Scanner object for input.
         *
         * Following TCS NQT style:
         * No input prompts.
         */
        Scanner sc = new Scanner(System.in);

        /*
         * Read the number of rows.
         */
        int n = sc.nextInt();

        /*
         * Call the pattern method.
         */
        inverted_rotated_half_pyramid(n);

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

1. Nested loops are the foundation of most pattern
   programming questions in Java interviews.

2. The formula (n - i) is commonly used to control
   leading spaces in pyramid-based patterns.

3. The outer loop controls rows, while inner loops
   control spaces and stars.

4. Pattern problems test logical thinking,
   loop control, and visualization ability.

5. This pattern is a rotated version of the normal
   half pyramid and is frequently asked as a
   beginner-to-intermediate pattern question.

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program prints an Inverted Rotated Half Pyramid
using nested loops.

The outer loop controls the rows.

For each row, I first print the required number
of spaces using the formula (n - i).

Then I print stars equal to the current row number.

As the row number increases, spaces decrease and
stars increase, which creates the rotated pyramid
shape.

This pattern demonstrates nested loop control and
basic pattern-building logic."

=========================================================
8. Time Complexity
=========================================================

O(n²)

Reason:

For each row, spaces and stars are printed using
nested loops.

Total operations are proportional to n².

=========================================================
9. Space Complexity
=========================================================

O(1)

Reason:

Only loop variables are used.

No extra data structures are required.

=========================================================
10. Interview Quick Answer
=========================================================

Q1. Why do we use (n - i) for spaces?

Answer:
It ensures that the number of leading spaces
decreases as the row number increases, creating
the rotated appearance of the pyramid.

---------------------------------------------------------

Q2. What is the role of nested loops in this pattern?

Answer:
The outer loop controls rows, while the inner loops
independently print spaces and stars for each row.

---------------------------------------------------------

Q3. Why is the time complexity O(n²)?

Answer:
Because for every row, both spaces and stars are
printed using loops, resulting in approximately
n² total operations.
=========================================================
*/