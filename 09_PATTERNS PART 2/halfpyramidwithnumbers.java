import java.util.*;

/*
=========================================================
1. Problem Statement
=========================================================

Write a Java program to print an Inverted Half Pyramid
with Numbers.

The program should:

1. Take the number of rows (n) as input.
2. Print numbers starting from 1 in each row.
3. Reduce the number of elements by one in every
   subsequent row.
4. Use nested loops to generate the pattern.

Example for n = 5:

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

This pattern is commonly asked in Java pattern
programming interviews to test nested loops,
loop boundaries, and logical thinking.

=========================================================
2. Input Format
=========================================================

A single integer n representing the number of rows.

Example:
5

=========================================================
3. Output Format
=========================================================

Print the Inverted Half Pyramid with Numbers.

Example Output:

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

=========================================================
4. Dry Run Example(s)
=========================================================

Example 1:

Input:
3

Row 1:
1 2 3

Row 2:
1 2

Row 3:
1

Output:
1 2 3
1 2
1

---------------------------------------------------------

Example 2:

Input:
5

Row 1:
1 2 3 4 5

Row 2:
1 2 3 4

Row 3:
1 2 3

Row 4:
1 2

Row 5:
1

Output:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class halfpyramidwithnumbers {

    /*
     * Method Name:
     * inverted_half_pyramid_withnumbers
     *
     * Purpose:
     * Prints an inverted half pyramid using numbers.
     *
     * Parameter:
     * n -> Total number of rows.
     */
    public static void inverted_half_pyramid_withnumbers(int n) {

        /************************************************
         * for      -> loop keyword
         * int      -> integer data type
         * i        -> row counter variable
         * = 1      -> start from row number 1
         * i <= n   -> continue until last row
         * i++      -> move to next row
         ************************************************/
        for (int i = 1; i <= n; i++) {

            /********************************************
             * Inner loop prints numbers.
             *
             * Formula:
             * n - i + 1
             *
             * When n = 5:
             *
             * i = 1 -> 5 numbers
             * i = 2 -> 4 numbers
             * i = 3 -> 3 numbers
             * i = 4 -> 2 numbers
             * i = 5 -> 1 number
             ********************************************/
            for (int j = 1; j <= n - i + 1; j++) {

                /****************************************
                 * System -> predefined Java class
                 * out    -> standard output stream
                 * print  -> prints on same line
                 * j      -> current number
                 * " "    -> space after number
                 ****************************************/
                System.out.print(j + " ");
            }

            /********************************************
             * System.out.println()
             *
             * Moves cursor to next line after
             * printing all numbers of current row.
             ********************************************/
            System.out.println();
        }
    }

    public static void main(String args[]) {

        /********************************************
         * Scanner -> predefined Java class
         * sc      -> Scanner object name
         * System.in -> keyboard input stream
         ********************************************/
        Scanner sc = new Scanner(System.in);

        /********************************************
         * int       -> integer data type
         * n         -> stores number of rows
         * sc        -> Scanner object
         * nextInt() -> reads integer input
         ********************************************/
        int n = sc.nextInt();

        /********************************************
         * Calling the pattern method
         *
         * n is passed as argument.
         ********************************************/
        inverted_half_pyramid_withnumbers(n);

        /********************************************
         * Close Scanner object
         * Prevents resource leakage.
         ********************************************/
        sc.close();
    }
}

/*
=========================================================
6. Important Notes For Revision
=========================================================

1. Nested loops are the most important concept in
   pattern programming and are frequently asked in
   technical interviews.

2. The formula (n - i + 1) dynamically decreases
   the number of elements printed in each row.

3. The outer loop controls rows, while the inner
   loop controls columns/elements.

4. Loop boundary conditions are critical in pattern
   questions and are commonly tested in interviews.

5. This pattern demonstrates decreasing sequence
   generation using loop arithmetic.

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program prints an inverted half pyramid using
numbers.

I use two nested loops.

The outer loop controls the rows.

The inner loop prints numbers from 1 up to
(n - i + 1).

As the row number increases, the number of printed
elements decreases by one.

For example, if n is 5, the first row prints
five numbers, the second row prints four numbers,
and so on until the last row prints only one number.

This approach demonstrates nested loop control and
pattern generation logic."

=========================================================
8. Time Complexity
=========================================================

O(n²)

Reason:

Total numbers printed are:

n + (n-1) + (n-2) + ... + 1

= n(n + 1) / 2

Therefore overall complexity is O(n²).

=========================================================
9. Space Complexity
=========================================================

O(1)

Reason:

No extra arrays, collections, or data structures
are used.

Only loop variables are required.

=========================================================
10. Interview Quick Answer
=========================================================

Q1. Why is the condition j <= n - i + 1 used?

Answer:
It decreases the number of printed elements by one
for every new row, creating the inverted pattern.

---------------------------------------------------------

Q2. What is the role of nested loops in this program?

Answer:
The outer loop controls rows, while the inner loop
controls how many numbers are printed in each row.

---------------------------------------------------------

Q3. Why is the time complexity O(n²)?

Answer:
Because the total iterations are:

n + (n-1) + (n-2) + ... + 1

which equals n(n+1)/2 and simplifies to O(n²).
=========================================================
*/