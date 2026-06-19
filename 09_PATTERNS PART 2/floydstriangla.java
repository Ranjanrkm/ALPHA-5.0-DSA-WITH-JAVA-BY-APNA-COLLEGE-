import java.util.*;

/*
=========================================================
1. Problem Statement
=========================================================

Write a Java program to print Floyd's Triangle.

Floyd's Triangle is a right-angled triangular pattern
of consecutive natural numbers.

Example for n = 5:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

The program should:

1. Take the number of rows (n) as input.
2. Print numbers sequentially starting from 1.
3. Each row should contain row-number count values.
4. Use nested loops to generate the pattern.

=========================================================
2. Input Format
=========================================================

A single integer n representing the number of rows.

Example:
5

=========================================================
3. Output Format
=========================================================

Print Floyd's Triangle.

Example Output:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

=========================================================
4. Dry Run Example(s)
=========================================================

Example 1:

Input:
3

counter = 1

Row 1:
1

Row 2:
2 3

Row 3:
4 5 6

Output:
1
2 3
4 5 6

---------------------------------------------------------

Example 2:

Input:
4

counter values printed:

1
2 3
4 5 6
7 8 9 10

Output:
1
2 3
4 5 6
7 8 9 10

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class floydstriangla {

    /*
     * Method Name:
     * floyds_triangle
     *
     * Purpose:
     * Prints Floyd's Triangle.
     *
     * Parameter:
     * n -> Number of rows.
     */
    public static void floyds_triangle(int n) {

        /*
         * counter stores the current number
         * to be printed in the pattern.
         *
         * It starts from 1 and increases
         * after every print operation.
         */
        int counter = 1;

        /*
         * Outer loop controls rows.
         *
         * Row 1
         * Row 2
         * ...
         * Row n
         */
        for (int i = 1; i <= n; i++) {

            /*
             * Inner loop controls how many
             * numbers will be printed in
             * the current row.
             *
             * Row 1 -> 1 number
             * Row 2 -> 2 numbers
             * Row 3 -> 3 numbers
             * ...
             * Row n -> n numbers
             */
            for (int j = 1; j <= i; j++) {

                /*
                 * Print current counter value
                 * followed by a space.
                 */
                System.out.print(counter + " ");

                /*
                 * Move to the next number.
                 */
                counter++;
            }

            /*
             * Move to the next line after
             * completing the current row.
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
         * Read number of rows.
         */
        int n = sc.nextInt();

        /*
         * Call Floyd's Triangle method.
         */
        floyds_triangle(n);

        /*
         * Close Scanner resource.
         */
        sc.close();
    }
}

/*
=========================================================
6. Important Notes For Revision
=========================================================

1. Floyd's Triangle is a classic nested-loop pattern
   frequently asked in Java and DSA interviews.

2. A single counter variable is shared across all
   rows to generate consecutive natural numbers.

3. The outer loop controls rows while the inner loop
   controls the number of elements in each row.

4. Time complexity grows because the total numbers
   printed are n(n+1)/2.

5. This pattern is commonly used to test loop
   execution flow and iteration tracing skills.

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program prints Floyd's Triangle using nested
loops.

I maintain a counter variable initialized to 1.

The outer loop controls the rows, while the inner
loop controls how many numbers should be printed in
each row.

For every print operation, I output the current
counter value and then increment it.

Since the counter is shared across all rows,
the numbers remain consecutive throughout the
entire pattern.

This approach efficiently generates Floyd's Triangle
using only loops and a single variable."

=========================================================
8. Time Complexity
=========================================================

O(n²)

Reason:

Total numbers printed:

1 + 2 + 3 + ... + n

= n(n + 1) / 2

Therefore complexity is O(n²).

=========================================================
9. Space Complexity
=========================================================

O(1)

Reason:

Only a few integer variables are used.

No extra array, list, or additional
data structure is required.

=========================================================
10. Interview Quick Answer
=========================================================

Q1. Why is only one counter variable sufficient for
printing Floyd's Triangle?

Answer:
Because numbers must remain consecutive across all
rows. A single counter keeps track of the next value
to print and is incremented after every output.

---------------------------------------------------------

Q2. Why is the time complexity O(n²)?

Answer:
Because the total numbers printed are
1 + 2 + 3 + ... + n = n(n + 1)/2,
which simplifies to O(n²).

---------------------------------------------------------

Q3. Which Java concept is most important in this
program?

Answer:
Nested Loops.

The outer loop manages rows, while the inner loop
manages the count of numbers printed in each row.
=========================================================
*/