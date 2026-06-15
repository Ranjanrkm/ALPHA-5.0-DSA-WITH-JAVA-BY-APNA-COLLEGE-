/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to calculate the product
of two numbers using a User-Defined Function.

The program demonstrates:

1. Function Creation
2. Function Calling
3. Parameters and Arguments
4. Return Statement
5. Method Reusability

Example:

Input:
a = 3
b = 5

Output:
a * b = 15

=========================================================
INPUT FORMAT
=========================================================

Two integers.

Example:

3
5

=========================================================
OUTPUT FORMAT
=========================================================

a * b = 15

=========================================================
DRY RUN EXAMPLE
=========================================================

Given:

a = 3
b = 5

---------------------------------------------------------

Function Call:

multiply(3, 5)

---------------------------------------------------------

Inside Function:

product = 3 * 5

product = 15

---------------------------------------------------------

Return:

15

---------------------------------------------------------

Back to main():

prod = 15

---------------------------------------------------------

Output:

a * b = 15

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class productab {

    /*
    =====================================================
    FUNCTION TO CALCULATE PRODUCT
    =====================================================

    Parameters:

    a -> First Number
    b -> Second Number

    Return Type:

    int

    Purpose:

    Returns multiplication of two numbers.
    */
    public static int multiply(int a, int b) {

        // Store multiplication result.
        //
        // Example:
        //
        // a = 3
        // b = 5
        //
        // product = 15
        int product = a * b;

        // Return the calculated product
        // back to the calling method.
        return product;
    }

    public static void main(String args[]) {

        // First number.
        int a = 3;

        // Second number.
        int b = 5;

        /*
        =================================================
        FUNCTION CALL
        =================================================

        Actual Arguments:

        a, b

        Values are passed to:

        multiply(a, b)

        Returned value is stored in prod.
        */
        int prod = multiply(a, b);

        // Print final product.
        System.out.println("a * b = " + prod);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Method Signature

   multiply(int a, int b)

   Method Signature consists of:
   • Method Name
   • Parameter List

   Return type is NOT part of the signature.

---------------------------------------------------------

2. Java Pass By Value

   Java always passes a copy of primitive
   values to methods.

   Changes inside multiply() do not affect
   variables in main().

---------------------------------------------------------

3. Return Statement

   return transfers control back to the
   calling method and sends the calculated
   value to the caller.

---------------------------------------------------------

4. Call Stack Concept

   When multiply() is called, a new stack
   frame is created. After execution, the
   frame is removed and control returns
   to main().

---------------------------------------------------------

5. Method Reusability

   Same method can be called multiple times
   with different arguments without rewriting
   the multiplication logic.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I created a user-defined method named
multiply() which accepts two integers as
parameters.

Inside the method, I calculate the product
of the two numbers and return the result.

In the main method, I call multiply() by
passing two arguments and store the returned
value in a variable.

This demonstrates parameter passing,
method invocation, return statements, and
code reusability using functions."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

Only one multiplication operation is
performed irrespective of input size.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few primitive variables are used.

No extra data structure is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is Java called Pass By Value even
for method parameters?

Answer:

Java always passes a copy of the variable's
value. For primitive types, the actual value
is copied. Therefore modifications inside
the method do not affect the original variable.

---------------------------------------------------------

Q2. What happens internally when
multiply() is called?

Answer:

A new stack frame is created in the JVM call
stack containing parameters, local variables,
and method information. After execution, the
frame is removed and control returns to main().

---------------------------------------------------------

Q3. Why is the return type int instead of void?

Answer:

Because the method needs to send the calculated
product back to the caller. A void method
cannot return a value for further use.

=========================================================
END OF FILE
=========================================================
*/