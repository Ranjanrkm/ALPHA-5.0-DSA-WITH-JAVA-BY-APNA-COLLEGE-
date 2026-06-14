import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to demonstrate a function
with parameters and return value.

The program takes two integers as input,
passes them to a function, calculates their
sum, returns the result, and prints it.

This program helps understand:

1. Function Parameters
2. Function Arguments
3. Return Statement
4. Method Calling
5. Control Flow Between Methods

=========================================================
INPUT FORMAT
=========================================================

Two integers.

Example:

10
20

=========================================================
OUTPUT FORMAT
=========================================================

Sum is :30

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

10
20

---------------------------------------------------------
STEP 1
---------------------------------------------------------

a = 10
b = 20

---------------------------------------------------------
STEP 2
---------------------------------------------------------

Function Call:

calculateSum(a, b)

becomes

calculateSum(10, 20)

---------------------------------------------------------
STEP 3
---------------------------------------------------------

Inside Function

numb1 = 10
numb2 = 20

sum = numb1 + numb2

sum = 10 + 20

sum = 30

---------------------------------------------------------
STEP 4
---------------------------------------------------------

return 30

---------------------------------------------------------
STEP 5
---------------------------------------------------------

Back To main()

sum = 30

---------------------------------------------------------
STEP 6
---------------------------------------------------------

Print:

sum is :30

=========================================================
FUNCTION FLOW DIAGRAM
=========================================================

main()
  |
  | a = 10
  | b = 20
  |
  V
calculateSum(10,20)
  |
  | sum = 30
  |
  V
return 30
  |
  V
main()
  |
  | print 30
  |
  V
Program Ends

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class functionpara {

    /*
    =====================================================
    FUNCTION TO CALCULATE SUM
    =====================================================

    Formal Parameters:

    numb1
    numb2

    These variables receive values from
    the calling function.

    Return Type:

    int

    Meaning:

    This function must return an integer.
    */
    public static int calculateSum(int numb1, int numb2) {

        // Calculate sum of both numbers.
        //
        // Example:
        //
        // numb1 = 10
        // numb2 = 20
        //
        // sum = 30
        int sum = numb1 + numb2;

        // Return the calculated result
        // back to the calling method.
        return sum;
    }

    public static void main(String args[]) {

        // Create Scanner object
        // for reading user input.
        Scanner sc = new Scanner(System.in);

        // Read first integer.
        int a = sc.nextInt();

        // Read second integer.
        int b = sc.nextInt();

        /*
        =================================================
        FUNCTION CALL
        =================================================

        a and b are called:

        Actual Parameters / Arguments

        Their values are copied into:

        numb1 and numb2

        which are called:

        Formal Parameters
        */
        int sum = calculateSum(a, b);

        // Print the returned sum.
        System.out.println("sum is :" + sum);

        // Close Scanner object.
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Formal Parameters

   Variables written in the function
   definition.

   Example:

   calculateSum(int numb1, int numb2)

---------------------------------------------------------

2. Actual Parameters / Arguments

   Values passed during function call.

   Example:

   calculateSum(a, b)

---------------------------------------------------------

3. Return Type

   int

   Means the function must return
   an integer value.

---------------------------------------------------------

4. return Statement

   Immediately ends function execution
   and sends value back to caller.

---------------------------------------------------------

5. Java Uses Pass By Value

   Java always passes a copy of the value.

---------------------------------------------------------

6. Function Reusability

   Same method can be called multiple times.

---------------------------------------------------------

7. This is one of the most important
   Java interview concepts.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Forgetting return statement
   in non-void methods.

---------------------------------------------------------

2. Using:

   void calculateSum()

   and then trying to store result.

---------------------------------------------------------

3. Confusing arguments and parameters.

---------------------------------------------------------

4. Printing result inside function
   instead of returning it.

---------------------------------------------------------

5. Declaring return type as int
   but returning nothing.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates a method that
accepts parameters and returns a value.

I created a method named calculateSum()
which takes two integers as input.

Inside the method, I add both numbers
and store the result in a variable named sum.

The result is then returned using the
return statement.

In the main method, I read two numbers,
pass them as arguments to the function,
store the returned value, and print it.

This approach promotes code reusability
and modular programming."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

Only one addition operation is performed.

No loops or recursion are used.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few integer variables are used.

No extra data structures are created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is the difference between
formal parameters and actual parameters?

Answer:

Formal Parameters:

Variables defined in the method declaration.

Example:

calculateSum(int numb1, int numb2)

Actual Parameters:

Values passed during method call.

Example:

calculateSum(a, b)

---------------------------------------------------------

Q2. Does Java use Pass By Value or Pass By Reference?

Answer:

Java uses Pass By Value only.

For primitive types, a copy of the value
is passed to the method.

---------------------------------------------------------

Q3. Why return the sum instead of printing
it inside the function?

Answer:

Returning makes the method reusable.

The caller can print it, store it,
multiply it, or use it in further
calculations.

Printing inside the function reduces
flexibility.

---------------------------------------------------------

Q4. What happens if we remove the return
statement?

Answer:

Compilation Error.

Because the method return type is int,
Java expects an integer value to be returned.

---------------------------------------------------------

Q5. Can this function be overloaded?

Answer:

Yes.

Example:

calculateSum(int a, int b)

calculateSum(int a, int b, int c)

calculateSum(double a, double b)

Java chooses the correct version based
on parameter list.

---------------------------------------------------------

Q6. Where is the returned value stored
after function execution?

Answer:

The returned value is placed back into
the calling statement.

Example:

int sum = calculateSum(a, b);

The returned integer is assigned to
the variable sum.

---------------------------------------------------------

Q7. What happens internally during
a function call?

Answer:

A new stack frame is created in the
method call stack.

Parameters and local variables are stored
inside that frame.

After execution completes, the frame is
removed and control returns to the caller.

=========================================================
END OF FILE
=========================================================
*/
