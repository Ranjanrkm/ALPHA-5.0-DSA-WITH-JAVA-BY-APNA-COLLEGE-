/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to demonstrate
Method Overloading using Different
Number of Parameters.

Method Overloading allows multiple methods
to have the same name but different parameter lists.

In this program:

1. First method calculates the sum of 2 integers.
2. Second method calculates the sum of 3 integers.

Java automatically determines which method
to call based on the number of arguments
provided during the method call.

This is an example of:

Compile-Time Polymorphism
(Static Polymorphism)

=========================================================
INPUT FORMAT
=========================================================

No Input Required.

Values are hardcoded.

=========================================================
OUTPUT FORMAT
=========================================================

8
6

=========================================================
DRY RUN EXAMPLE
=========================================================

---------------------------------------------------------
FUNCTION CALL 1
---------------------------------------------------------

sum(3, 5)

Arguments Count = 2

Java Searches For:

sum(int, int)

Method Found:

public static int sum(int a, int b)

Calculation:

3 + 5 = 8

Returned:

8

---------------------------------------------------------
FUNCTION CALL 2
---------------------------------------------------------

sum(1, 2, 3)

Arguments Count = 3

Java Searches For:

sum(int, int, int)

Method Found:

public static int sum(int a, int b, int c)

Calculation:

1 + 2 + 3 = 6

Returned:

6

=========================================================
METHOD RESOLUTION FLOW
=========================================================

sum(3,5)
   |
   V
sum(int,int)
   |
   V
8

---------------------------------------------------------

sum(1,2,3)
   |
   V
sum(int,int,int)
   |
   V
6

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class overloadingusingpara {

    /*
    =====================================================
    OVERLOADED METHOD #1
    =====================================================

    This method accepts two integer values.

    Parameters:

    a, b

    Purpose:

    Calculate sum of two numbers.

    Example:

    sum(3, 5)

    Output:

    8
    */
    public static int sum(int a, int b) {

        // Return the addition
        // of both integer values.
        return a + b;
    }

    /*
    =====================================================
    OVERLOADED METHOD #2
    =====================================================

    This method accepts three integer values.

    Parameters:

    a, b, c

    Purpose:

    Calculate sum of three numbers.

    Example:

    sum(1, 2, 3)

    Output:

    6
    */
    public static int sum(int a, int b, int c) {

        // Return the addition
        // of all three numbers.
        return a + b + c;
    }

    public static void main(String args[]) {

        /*
        =================================================
        CALLING FIRST OVERLOADED METHOD
        =================================================

        Since two arguments are provided,
        Java invokes:

        sum(int,int)
        */
        System.out.println(sum(3, 5));

        /*
        =================================================
        CALLING SECOND OVERLOADED METHOD
        =================================================

        Since three arguments are provided,
        Java invokes:

        sum(int,int,int)
        */
        System.out.println(sum(1, 2, 3));
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Method Overloading means:

   Same Method Name

   Different Parameter List

---------------------------------------------------------

2. Overloading can be achieved using:

   ✓ Different Number of Parameters

   Example:

   sum(int,int)

   sum(int,int,int)

---------------------------------------------------------

3. Overloading can also be achieved using:

   ✓ Different Data Types

   Example:

   sum(int,int)

   sum(float,float)

---------------------------------------------------------

4. Return Type Alone Cannot
   Perform Method Overloading.

---------------------------------------------------------

5. Method Overloading is:

   Compile-Time Polymorphism

   OR

   Static Polymorphism

---------------------------------------------------------

6. Compiler decides which method
   to execute before program execution.

---------------------------------------------------------

7. Method Signature consists of:

   Method Name +
   Parameter List

   Return type is NOT part of
   the method signature.

---------------------------------------------------------

8. One of the most frequently asked
   Core Java interview concepts.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Thinking return type can overload methods.

   Wrong Example:

   int sum(int a,int b)

   float sum(int a,int b)

   Compilation Error

---------------------------------------------------------

2. Creating multiple methods with
   identical signatures.

---------------------------------------------------------

3. Confusing Overloading with Overriding.

---------------------------------------------------------

4. Assuming runtime chooses overloaded methods.

   Overloading is resolved at compile time.

---------------------------------------------------------

5. Forgetting that parameter count
   itself can create a valid overload.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates Method Overloading
using a different number of parameters.

I created two methods having the same name
'sum'.

The first method accepts two integers and
returns their sum.

The second method accepts three integers
and returns their sum.

When a method call is made, Java checks the
number of arguments and selects the correct
method during compilation.

Since method selection happens at compile time,
Method Overloading is an example of
Compile-Time Polymorphism."

=========================================================
TIME COMPLEXITY
=========================================================

sum(int,int)

O(1)

Reason:

Only one addition operation.

---------------------------------------------------------

sum(int,int,int)

O(1)

Reason:

Only two addition operations.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

No extra memory proportional
to input size is used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. How does Java differentiate between
overloaded methods?

Answer:

Java uses the method signature.

Method Signature consists of:

• Method Name
• Number of Parameters
• Type of Parameters
• Order of Parameters

The return type is not considered.

---------------------------------------------------------

Q2. Why is Method Overloading called
Compile-Time Polymorphism?

Answer:

Because the compiler determines the exact
method to call during compilation based on
the arguments provided.

No runtime decision is involved.

---------------------------------------------------------

Q3. Can we overload the main() method?

Answer:

Yes.

Example:

public static void main(String[] args)

public static void main(int x)

public static void main(String s)

However, JVM always starts execution from:

public static void main(String[] args)

---------------------------------------------------------

Q4. What is the difference between
Method Overloading and Method Overriding?

Answer:

Method Overloading:

• Same Class
• Same Method Name
• Different Parameters
• Compile-Time Binding

Method Overriding:

• Parent-Child Relationship
• Same Signature
• Runtime Binding

---------------------------------------------------------

Q5. What happens if we write:

sum(5, 10L)

Answer:

Java searches for the closest matching
method.

If no exact match exists, Java may perform
type promotion.

Interviewers often ask this to test
understanding of method resolution rules.

---------------------------------------------------------

Q6. Which has higher priority during
method selection?

Answer:

Java generally follows:

1. Exact Match
2. Primitive Widening
3. Autoboxing
4. Varargs

The most specific applicable method
is selected.

---------------------------------------------------------

Q7. Can constructors be overloaded?

Answer:

Yes.

Constructor Overloading is widely used.

Example:

Student()

Student(int id)

Student(int id, String name)

Java selects the appropriate constructor
based on the arguments passed.

---------------------------------------------------------

Q8. Why is Method Overloading useful
in real-world applications?

Answer:

It improves readability and API design.

Users can perform similar operations
using the same method name while passing
different inputs.

Example:

Math.abs(int)

Math.abs(long)

Math.abs(float)

Math.abs(double)

This makes libraries easier to use and
maintain.

=========================================================
END OF FILE
=========================================================
*/
