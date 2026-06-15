/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to demonstrate
Method Overloading using Different
Data Types.

Method Overloading means creating multiple
methods with the same name but different
parameter lists.

In this program:

1. One method adds two integers.
2. Another method adds two float values.

Java automatically selects the correct
method based on the datatype of arguments
provided during the function call.

This concept is known as:

Compile-Time Polymorphism
or
Static Polymorphism.

=========================================================
INPUT FORMAT
=========================================================

No Input Required.

Values are hardcoded.

=========================================================
OUTPUT FORMAT
=========================================================

3
8.0

=========================================================
DRY RUN EXAMPLE
=========================================================

---------------------------------------------------------
FUNCTION CALL 1
---------------------------------------------------------

sum(1, 2)

Arguments:

1 -> int
2 -> int

Java searches for:

sum(int, int)

Found:

public static int sum(int a, int b)

Calculation:

1 + 2 = 3

Returned:

3

Output:

3

---------------------------------------------------------
FUNCTION CALL 2
---------------------------------------------------------

sum(3.2f, 4.8f)

Arguments:

3.2f -> float
4.8f -> float

Java searches for:

sum(float, float)

Found:

public static float sum(float a, float b)

Calculation:

3.2 + 4.8 = 8.0

Returned:

8.0

Output:

8.0

=========================================================
METHOD RESOLUTION FLOW
=========================================================

sum(1,2)
    |
    V
sum(int,int)
    |
    V
3

---------------------------------------------------------

sum(3.2f,4.8f)
    |
    V
sum(float,float)
    |
    V
8.0

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class overloadingusingdata {

    /*
    =====================================================
    OVERLOADED METHOD #1
    =====================================================

    This method accepts two integer values.

    Return Type:

    int

    Example:

    sum(1, 2)

    Output:

    3
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

    This method accepts two float values.

    Return Type:

    float

    Example:

    sum(3.2f, 4.8f)

    Output:

    8.0
    */
    public static float sum(float a, float b) {

        // Return the addition
        // of both float values.
        return a + b;
    }

    public static void main(String args[]) {

        /*
        =================================================
        CALLING INTEGER VERSION
        =================================================

        Java detects both arguments
        are integers.

        Therefore:

        sum(int,int)

        gets executed.
        */
        System.out.println(sum(1, 2));

        /*
        =================================================
        CALLING FLOAT VERSION
        =================================================

        Java detects both arguments
        are float values.

        Therefore:

        sum(float,float)

        gets executed.
        */
        System.out.println(sum(3.2f, 4.8f));
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

   sum(int a, int b)

   sum(int a, int b, int c)

---------------------------------------------------------

3. Overloading can be achieved using:

   ✓ Different Data Types

   Example:

   sum(int,int)

   sum(float,float)

---------------------------------------------------------

4. Return Type Alone Cannot
   Perform Overloading.

   Invalid Example:

   int sum(int a,int b)

   float sum(int a,int b)

   Compiler Error

---------------------------------------------------------

5. Method Overloading is:

   Compile-Time Polymorphism

   OR

   Static Polymorphism

---------------------------------------------------------

6. Method Selection Happens
   During Compilation.

---------------------------------------------------------

7. One of the Most Asked Core Java
   Interview Concepts.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Thinking return type can
   overload methods.

   Wrong.

---------------------------------------------------------

2. Creating two methods with
   same signature.

   Causes compilation error.

---------------------------------------------------------

3. Forgetting 'f' in float literals.

   Wrong:

   sum(3.2,4.8)

   Correct:

   sum(3.2f,4.8f)

---------------------------------------------------------

4. Confusing Method Overloading
   with Method Overriding.

---------------------------------------------------------

5. Assuming runtime decides
   overloaded methods.

   It is decided at compile time.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates Method
Overloading using different data types.

I created two methods having the same
name 'sum'.

The first method accepts two integers,
while the second method accepts two
float values.

When the method is called, Java checks
the argument types and automatically
invokes the appropriate overloaded method.

Since method selection happens during
compilation, method overloading is an
example of Compile-Time Polymorphism."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

Only one arithmetic addition operation
is performed inside each method.

No loops or recursion are involved.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

No extra memory dependent on input size
is used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What are the rules for Method Overloading?

Answer:

Methods must have:

✓ Same Method Name

and at least one of:

✓ Different Number of Parameters
✓ Different Data Types
✓ Different Order of Data Types

The parameter list must change.

---------------------------------------------------------

Q2. Can we overload methods only by
changing the return type?

Answer:

No.

Example:

int sum(int a,int b)

float sum(int a,int b)

This causes a compilation error because
both methods have the same signature.

---------------------------------------------------------

Q3. Why is Method Overloading called
Compile-Time Polymorphism?

Answer:

Because the compiler determines which
method to call during compilation based
on the method signature and argument types.

No runtime decision is involved.

---------------------------------------------------------

Q4. What is the difference between
Method Overloading and Method Overriding?

Answer:

Method Overloading:

• Same class
• Same method name
• Different parameters
• Compile-time polymorphism

Method Overriding:

• Parent-child relationship
• Same method signature
• Runtime polymorphism

---------------------------------------------------------

Q5. What happens if we call:

sum(5, 6.5f)

with the current code?

Answer:

Java performs method matching and type
promotion.

Since there is no exact match for:

sum(int,float)

the compiler looks for the best possible
conversion.

In interviews, this often leads to
questions on automatic type promotion.

---------------------------------------------------------

Q6. How does Java decide which overloaded
method to call?

Answer:

Java follows:

1. Exact Match
2. Type Promotion
3. Autoboxing
4. Varargs

The most specific applicable method
is selected by the compiler.

---------------------------------------------------------

Q7. Can constructors be overloaded?

Answer:

Yes.

Constructor Overloading is very common.

Example:

Student()

Student(int id)

Student(int id, String name)

The compiler chooses the appropriate
constructor based on the arguments passed.

=========================================================
END OF FILE
=========================================================
*/
