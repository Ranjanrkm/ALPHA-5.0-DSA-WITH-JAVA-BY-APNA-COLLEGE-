/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to demonstrate the usage
of important methods available in the Math class.

The program performs the following operations:

1. Find the minimum of two numbers.
2. Find the maximum of two numbers.
3. Find the square root of a number.
4. Find the power of a number.

This program helps understand commonly used
Math class methods that are frequently asked
in Java interviews and coding rounds.

=========================================================
INPUT FORMAT
=========================================================

No input required.

Values are hardcoded:

x = 28
y = 4

=========================================================
OUTPUT FORMAT
=========================================================

minimum number of x and y is.4.0
maximum number of x and y is.28.0
square root of y is.2.0
power of x and y is.614656.0

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values:

x = 28
y = 4

---------------------------------------------------------

Math.min(28, 4)

Result:

4

---------------------------------------------------------

Math.max(28, 4)

Result:

28

---------------------------------------------------------

Math.sqrt(4)

Result:

2

---------------------------------------------------------

Math.pow(28, 4)

Calculation:

28 × 28 × 28 × 28

Result:

614656

---------------------------------------------------------

Final Output:

4.0
28.0
2.0
614656.0

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class mathclass {

    public static void main(String args[]) {

        /*
        =================================================
        DECLARE TWO DOUBLE VARIABLES
        =================================================

        These values will be used to demonstrate
        different Math class methods.
        */
        double x = 28;
        double y = 4;

        /*
        =================================================
        Math.min()
        =================================================

        Returns the smaller value among
        the given arguments.

        Syntax:

        Math.min(a, b)

        Return Type:

        Same as argument type.
        */
        System.out.println(
                "minimum number of x and y is."
                        + Math.min(x, y));

        /*
        =================================================
        Math.max()
        =================================================

        Returns the larger value among
        the given arguments.

        Syntax:

        Math.max(a, b)

        Return Type:

        Same as argument type.
        */
        System.out.println(
                "maximum number of x and y is."
                        + Math.max(x, y));

        /*
        =================================================
        Math.sqrt()
        =================================================

        Returns the square root of
        the given number.

        Syntax:

        Math.sqrt(number)

        Return Type:

        double

        Example:

        Math.sqrt(4) = 2.0
        */
        System.out.println(
                "square root of y is."
                        + Math.sqrt(y));

        /*
        =================================================
        Math.pow()
        =================================================

        Returns:

        base ^ exponent

        Syntax:

        Math.pow(base, exponent)

        Example:

        Math.pow(28, 4)

        = 28 × 28 × 28 × 28

        = 614656.0

        Return Type:

        double
        */
        System.out.println(
                "power of x and y is."
                        + Math.pow(x, y));
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Math Class Methods are Static

   Methods like:

   Math.min()
   Math.max()
   Math.sqrt()
   Math.pow()

   are static methods.

   They are called using the class name
   without creating an object.

---------------------------------------------------------

2. Math.sqrt() Return Type

   Math.sqrt() always returns double,
   even when the result is a whole number.

   Example:

   Math.sqrt(4) → 2.0

---------------------------------------------------------

3. Math.pow() Return Type

   Math.pow() always returns double.

   Example:

   Math.pow(2, 3) → 8.0

---------------------------------------------------------

4. java.lang Package

   Math class belongs to java.lang package.

   It is imported automatically by JVM.

   No explicit import statement is required.

---------------------------------------------------------

5. Method Overloading in Math Class

   Methods like min() and max()
   are overloaded for:

   int
   long
   float
   double

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates commonly used
methods of the Java Math class.

I use Math.min() to find the smaller value,
Math.max() to find the larger value,
Math.sqrt() to calculate the square root,
and Math.pow() to calculate exponentiation.

All these methods are static methods of the
Math class, so they can be accessed directly
using the class name without object creation.

The program is useful for understanding Java's
built-in mathematical utility functions."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

Each Math function executes a constant-time
mathematical operation.

No loops or recursion are used.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few primitive variables are used.

No additional data structures are created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why can we call Math.sqrt() without
creating a Math object?

Answer:

Because Math.sqrt() is a static method.

Static methods belong to the class itself,
not to an object instance.

---------------------------------------------------------

Q2. Which package contains the Math class?

Answer:

The Math class belongs to:

java.lang

Since java.lang is imported automatically,
no import statement is required.

---------------------------------------------------------

Q3. Why does Math.pow() return double
instead of int?

Answer:

Math.pow() is designed to handle a wide range
of numeric values, including fractional powers.

Therefore its return type is double.

---------------------------------------------------------

Q4. What Java concept is used when
Math.min() works for int, float, and double?

Answer:

Method Overloading.

The Math class contains multiple versions
of min() and max() with different parameter
types.

=========================================================
END OF FILE
=========================================================
*/