/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to evaluate the following
arithmetic expression:

exp = 4/3 * (x + 34)
      + 9 * (a + b * c)
      + (3 + y * (2 + a)) / (a + b * y)

Given:

x = 9
y = 12
a = 2
b = 4
c = 6

The program demonstrates:

1. Operator Precedence
2. Integer Division
3. Parentheses Evaluation
4. Expression Simplification

=========================================================
INPUT FORMAT
=========================================================
No Input Required

Values are already initialized:

x = 9
y = 12
a = 2
b = 4
c = 6

=========================================================
OUTPUT FORMAT
=========================================================
Print the final value of the expression.

Expected Output:

278

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values:

x = 9
y = 12
a = 2
b = 4
c = 6

---------------------------------------------------------
PART 1
---------------------------------------------------------

Expression:

4/3 * (x + 34)

Step 1:

4/3

Since both operands are integers,
Java performs Integer Division.

4/3 = 1

(Decimal part is discarded)

Step 2:

(x + 34)

= 9 + 34

= 43

Step 3:

1 * 43

= 43

First Part Result = 43

---------------------------------------------------------
PART 2
---------------------------------------------------------

Expression:

9 * (a + b * c)

Step 1:

b * c

= 4 * 6

= 24

Step 2:

a + 24

= 2 + 24

= 26

Step 3:

9 * 26

= 234

Second Part Result = 234

---------------------------------------------------------
PART 3
---------------------------------------------------------

Expression:

(3 + y * (2 + a))
/
(a + b * y)

Step 1:

(2 + a)

= 2 + 2

= 4

Step 2:

y * 4

= 12 * 4

= 48

Step 3:

3 + 48

= 51

Numerator = 51

---------------------

Denominator:

a + b * y

= 2 + 4 * 12

= 2 + 48

= 50

Step 4:

51 / 50

Since both operands are integers:

51 / 50 = 1

Third Part Result = 1

---------------------------------------------------------
FINAL CALCULATION
---------------------------------------------------------

exp

= 43 + 234 + 1

= 278

Output:

278

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class testfour {

    public static void main(String args[]) {

        // Store value 9 inside variable x.
        //
        // Used in the first part
        // of the expression.
        int x = 9;

        // Store value 12 inside variable y.
        //
        // Used in the third part
        // of the expression.
        int y = 12;

        // Store value 2 inside variable a.
        int a = 2;

        // Store value 4 inside variable b.
        int b = 4;

        // Store value 6 inside variable c.
        int c = 6;

        /*
        =================================================
        EXPRESSION BREAKDOWN
        =================================================

        PART 1

        4/3 * (x + 34)

        = 4/3 * (9 + 34)

        = 1 * 43

        = 43

        Note:

        4/3 becomes 1 because Java
        performs Integer Division.

        -------------------------------------------------

        PART 2

        9 * (a + b*c)

        = 9 * (2 + 4*6)

        = 9 * (2 + 24)

        = 9 * 26

        = 234

        -------------------------------------------------

        PART 3

        (3 + y*(2+a))
        /
        (a + b*y)

        Numerator:

        = 3 + 12*(2+2)

        = 3 + 12*4

        = 3 + 48

        = 51

        Denominator:

        = 2 + 4*12

        = 2 + 48

        = 50

        = 51/50

        = 1

        (Integer Division)

        -------------------------------------------------

        FINAL RESULT

        = 43 + 234 + 1

        = 278
        */
        int exp =
                4 / 3 * (x + 34)
                + 9 * (a + b * c)
                + (3 + y * (2 + a))
                / (a + b * y);

        // Print the final result
        // of the complete expression.
        System.out.println(exp);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Integer Division is one of the most
   important Java concepts.

   Example:

   4/3 = 1

   51/50 = 1

   Decimal part is discarded.

---------------------------------------------------------

2. Parentheses have the highest precedence.

---------------------------------------------------------

3. Multiplication and Division have
   higher precedence than Addition.

---------------------------------------------------------

4. Java follows:

   BODMAS / PEDMAS

---------------------------------------------------------

5. Expression evaluation questions are
   frequently asked in Java interviews
   and MCQs.

---------------------------------------------------------

6. If you want decimal results:

   use double or float.

   Example:

   4.0/3 = 1.3333

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Thinking:

   4/3 = 1.333

   Wrong

   Actual:
   1

---------------------------------------------------------

2. Ignoring operator precedence.

---------------------------------------------------------

3. Forgetting that all variables are int.

---------------------------------------------------------

4. Not evaluating brackets first.

---------------------------------------------------------

5. Assuming Java automatically keeps
   decimal values in integer division.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program evaluates a complex arithmetic
expression using integer variables.

I initialized x, y, a, b, and c with fixed values.

Then I evaluated the expression using Java's
operator precedence rules.

Parentheses are evaluated first, followed by
multiplication and division, and finally addition.

Since all variables are integers, Java performs
integer division wherever division occurs,
which removes the decimal part.

After evaluating each sub-expression separately,
the final result becomes 278."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

Only a fixed number of arithmetic
operations are performed.

No loops or recursion are used.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few integer variables are stored.

No extra arrays, collections,
or data structures are used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is Integer Division?

Answer:

Integer division removes the decimal part.

Example:

7 / 2 = 3

---------------------------------------------------------

Q2. What is the result of 4/3 in Java?

Answer:

1

Because both operands are integers.

---------------------------------------------------------

Q3. How can we get 1.3333 instead?

Answer:

Use double:

4.0 / 3

---------------------------------------------------------

Q4. Which operator has higher precedence:
* or + ?

Answer:

* (Multiplication)

---------------------------------------------------------

Q5. What is the final output of this program?

Answer:

278

=========================================================
END OF FILE
=========================================================
*/


