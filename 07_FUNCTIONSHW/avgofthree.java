/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to calculate the
average of three numbers using a
User-Defined Function.

The program demonstrates:

1. Function Creation
2. Function Calling
3. Parameters and Arguments
4. Return Statement
5. Type Casting
6. Integer Division vs Floating Point Division

=========================================================
INPUT FORMAT
=========================================================

Three integers.

Example:

10
20
30

=========================================================
OUTPUT FORMAT
=========================================================

20.0

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:

10
20
30

---------------------------------------------------------

Function Call:

avg(10, 20, 30)

---------------------------------------------------------

Sum:

10 + 20 + 30 = 60

---------------------------------------------------------

Average:

60 / 3.0 = 20.0

---------------------------------------------------------

Return:

20.0

---------------------------------------------------------

Output:

20.0

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

1
2
2

---------------------------------------------------------

Sum:

1 + 2 + 2 = 5

---------------------------------------------------------

Average:

5 / 3.0

= 1.6666666666666667

---------------------------------------------------------

Output:

1.6666666666666667

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

import java.util.*;

public class avgofthree {

    /*
    =====================================================
    FUNCTION TO CALCULATE AVERAGE
    =====================================================

    Parameters:

    a -> First Number
    b -> Second Number
    c -> Third Number

    Return Type:

    double

    Purpose:

    Returns the average of
    three numbers.
    */
    public static double avg(int a, int b, int c) {

        /*
        Calculate sum of all
        three numbers.
        */
        int sum = a + b + c;

        /*
        Use 3.0 instead of 3.

        This forces Java to perform
        floating-point division.

        Example:

        5 / 3   = 1

        5 / 3.0 = 1.6666666666666667
        */
        double average = sum / 3.0;

        return average;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        /*
        Read first integer.
        */
        int a = sc.nextInt();

        /*
        Read second integer.
        */
        int b = sc.nextInt();

        /*
        Read third integer.
        */
        int c = sc.nextInt();

        /*
        Call average function and
        store returned result.
        */
        double average = avg(a, b, c);

        /*
        Print final average.
        */
        System.out.println(average);

        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Integer Division vs Floating Point Division

   5 / 3  = 1

   5 / 3.0 = 1.6666666666666667

   Frequently asked Java interview concept.

---------------------------------------------------------

2. Type Promotion

   In expression:

   sum / 3.0

   int is automatically promoted
   to double before division.

---------------------------------------------------------

3. Return Type Compatibility

   Method return type is double,
   therefore returned value can
   contain decimal precision.

---------------------------------------------------------

4. Java Pass By Value

   Parameters a, b, and c receive
   copies of the arguments passed
   from main().

---------------------------------------------------------

5. Implicit Widening Conversion

   int → double conversion happens
   automatically without explicit casting.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I created a user-defined method named avg()
that accepts three integer parameters.

Inside the method, I first calculate the sum
of all three numbers.

Then I divide the sum by 3.0 instead of 3
to ensure floating-point division and avoid
integer truncation.

The method returns a double value which is
stored and printed in the main method.

This solution demonstrates function usage,
return values, type promotion, and floating-
point arithmetic in Java."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

Only a fixed number of arithmetic
operations are performed.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few primitive variables
are used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why should we use 3.0 instead of 3 while
calculating average?

Answer:

Using 3 performs integer division and
removes the decimal part.

Using 3.0 forces floating-point division,
which preserves precision.

---------------------------------------------------------

Q2. What is Type Promotion in this code?

Answer:

In the expression:

sum / 3.0

Java automatically promotes sum (int)
to double before performing division.

This is called Implicit Type Promotion.

---------------------------------------------------------

Q3. What would be the output for
a = 1, b = 2, c = 2 if we use:

(a + b + c) / 3

instead of

(a + b + c) / 3.0 ?

Answer:

5 / 3 = 1

The decimal part is lost because
integer division is performed first.

=========================================================
END OF FILE
=========================================================
*/