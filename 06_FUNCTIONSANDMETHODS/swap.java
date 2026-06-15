/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to swap two numbers
using a user-defined method.

This program demonstrates an important
Java interview concept:

Java is Pass By Value.

Although the values appear swapped inside
the swap() method, the original variables
in main() remain unchanged.

=========================================================
INPUT FORMAT
=========================================================

No Input Required.

Values are hardcoded:

a = 5
b = 10

=========================================================
OUTPUT FORMAT
=========================================================

a = 10
b = 5

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values Inside main():

a = 5
b = 10

---------------------------------------------------------

Function Call:

swap(a, b)

---------------------------------------------------------

Java Creates Copies:

a = 5
b = 10

inside swap()

---------------------------------------------------------

Swap Logic:

temp = a

temp = 5

a = b

a = 10

b = temp

b = 5

---------------------------------------------------------

Values Inside swap():

a = 10
b = 5

---------------------------------------------------------

Function Ends

Stack Frame Removed

---------------------------------------------------------

Original Values Inside main():

a = 5
b = 10

Remain Unchanged

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class swap {

    /*
    =====================================================
    FUNCTION TO SWAP TWO NUMBERS
    =====================================================

    Parameters:

    a -> Copy of first number
    b -> Copy of second number

    Important:

    Java passes primitive variables
    by value.

    Therefore only copies are swapped.
    */
    public static void swap(int a, int b) {

        /*
        Store first value temporarily
        so that it is not lost during
        swapping.
        */
        int temp = a;

        /*
        Assign second value
        to first variable.
        */
        a = b;

        /*
        Assign original first value
        stored in temp to second variable.
        */
        b = temp;

        /*
        Print swapped values
        inside the method.
        */
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {

        /*
        Original variables
        created inside main().
        */
        int a = 5;
        int b = 10;

        /*
        Function Call.

        Copies of a and b are passed
        to the swap method.
        */
        swap(a, b);

        /*
        Uncomment below lines to verify
        Java Pass By Value behavior.

        Output will be:

        a = 5
        b = 10

        because original variables
        remain unchanged.
        */

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Java Pass By Value

   Java always passes a copy of the value
   to methods, even for primitive types.

---------------------------------------------------------

2. Stack Frame Concept

   swap() gets its own stack frame.
   Local variables a, b, and temp exist
   only inside that frame.

---------------------------------------------------------

3. Primitive Variables

   int, float, char, double, boolean, etc.
   are passed by value in Java.

---------------------------------------------------------

4. Scope of Variables

   Variables declared inside swap()
   cannot be accessed from main().

---------------------------------------------------------

5. Real Swap in Java

   To swap original values, use:
   • Array
   • Object
   • Wrapper Class
   • Custom Class

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates swapping two
numbers using a method.

Inside the swap() method, I use a temporary
variable to exchange the values.

However, Java passes primitive variables
by value, so the method receives copies
of the original variables.

As a result, only the copied values are
swapped, while the original variables in
main() remain unchanged.

This is a common Java interview question
used to test understanding of Pass By Value."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

Only a constant number of assignments
are performed.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only one extra temporary variable
is used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why doesn't swap() change the original
values of a and b in main()?

Answer:

Because Java uses Pass By Value.

The method receives copies of a and b,
not the original variables.

Therefore modifications inside swap()
do not affect main() variables.

---------------------------------------------------------

Q2. What happens in memory when swap()
is called?

Answer:

A new stack frame is created for swap().

Copies of a and b along with temp are stored
in that frame. After method execution,
the frame is removed from the call stack.

---------------------------------------------------------

Q3. How can we actually swap values in Java?

Answer:

Primitive variables cannot be swapped
through a method directly.

A common approach is to pass:

• Array
• Object
• Custom Class Instance

and modify their internal state.

=========================================================
END OF FILE
=========================================================
*/
