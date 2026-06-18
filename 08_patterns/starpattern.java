/*
=========================================================
1. Problem Statement
=========================================================

Write a Java program to print a right-angled star pattern.

Pattern:

*
**
***
****

The program uses nested loops where:
1. The outer loop controls the number of lines.
2. The inner loop prints stars (*) for each line.
3. The number of stars printed is equal to the current line number.

=========================================================
2. Input Format
=========================================================

No input required.

=========================================================
3. Output Format
=========================================================

*
**
***
****

=========================================================
4. Dry Run Example(s)
=========================================================

Example 1:

Line = 1
Print 1 star

Output:
*

---------------------------------------------------------

Example 2:

Line = 4
Print 4 stars

Output:
****

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class starpattern {

    public static void main(String args[]) {

        /*
         * Outer loop controls the number of rows.
         *
         * line starts from 1 because the first row
         * contains one star.
         *
         * line <= 4 means total 4 rows will be printed.
         *
         * line++ moves to the next row after each iteration.
         */
        for (int line = 1; line <= 4; line++) {

            /*
             * Inner loop prints stars for the current row.
             *
             * For row 1 -> prints 1 star
             * For row 2 -> prints 2 stars
             * For row 3 -> prints 3 stars
             * For row 4 -> prints 4 stars
             *
             * star variable keeps track of the number
             * of stars printed in the current row.
             */
            for (int star = 1; star <= line; star++) {

                /*
                 * Print one star without moving
                 * to the next line.
                 */
                System.out.print("*");
            }

            /*
             * After printing all stars of the current row,
             * move the cursor to the next line.
             */
            System.out.println();
        }
    }
}

/*
=========================================================
6. Important Notes For Revision
=========================================================

1. Nested loops are the most important concept for
   pattern programming in Java interviews.

2. The outer loop controls rows, while the inner
   loop controls columns or pattern elements.

3. System.out.print() keeps output on the same line,
   whereas System.out.println() moves to the next line.

4. The condition star <= line creates the increasing
   pattern because the number of stars depends on
   the current row number.

5. Pattern problems are frequently asked to test
   loop control, iteration logic, and nested loop
   understanding.

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program prints a right-angled triangle star
pattern using nested loops.

The outer loop controls the rows and runs four times.

For each row, the inner loop prints stars equal to
the current row number.

For example, row 1 prints one star, row 2 prints
two stars, row 3 prints three stars, and row 4
prints four stars.

After printing all stars of a row, I use
System.out.println() to move to the next line.

This is a standard nested loop pattern problem."

=========================================================
8. Time Complexity
=========================================================

O(n²)

Where:
n = Number of rows

Reason:
The inner loop runs multiple times for each row.

For n rows:
1 + 2 + 3 + ... + n

= n(n + 1) / 2

Therefore overall complexity is O(n²).

=========================================================
9. Space Complexity
=========================================================

O(1)

Reason:
No extra array, list, or data structure is used.
Only loop variables are required.

=========================================================
10. Interview Quick Answer
=========================================================

Q1. Why are nested loops used in pattern problems?

Answer:
The outer loop controls rows, while the inner loop
controls the number of elements printed in each row.

---------------------------------------------------------

Q2. What will happen if star <= line is changed to
star < line?

Answer:
One less star will be printed in every row.

Example:

Current:
*
**
***

Modified:
(empty)
*
**

---------------------------------------------------------

Q3. Why is the time complexity O(n²)?

Answer:
Because for every row, the inner loop executes
multiple times, resulting in a total of
1 + 2 + 3 + ... + n operations, which is O(n²).
=========================================================
*/