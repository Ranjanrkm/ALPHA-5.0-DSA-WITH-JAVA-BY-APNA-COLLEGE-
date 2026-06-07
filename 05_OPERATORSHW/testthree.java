/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to understand:

1. Assignment Operator (=)
2. Compound Assignment Operators
   - +=
   - -=
   - /=
3. Order of Execution

The program initializes three variables:

x = 2
y = 2
z = 2

Then performs:

x += y;
y -= z;
z /= (x + y);

Finally, print the values of x, y, and z.

=========================================================
INPUT FORMAT
=========================================================
No Input Required

All values are initialized inside the program.

=========================================================
OUTPUT FORMAT
=========================================================
Print:

x y z

Expected Output:

4 0 0

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values:

x = 2
y = 2
z = 2

---------------------------------------------------------
STEP 1
---------------------------------------------------------

Statement:

x += y;

Meaning:

x = x + y

Substitute values:

x = 2 + 2

x = 4

Current State:

x = 4
y = 2
z = 2

---------------------------------------------------------
STEP 2
---------------------------------------------------------

Statement:

y -= z;

Meaning:

y = y - z

Substitute values:

y = 2 - 2

y = 0

Current State:

x = 4
y = 0
z = 2

---------------------------------------------------------
STEP 3
---------------------------------------------------------

Statement:

z /= (x + y);

Meaning:

z = z / (x + y)

First evaluate:

(x + y)

= 4 + 0

= 4

Now:

z = 2 / 4

Since z is int,
Java performs Integer Division.

2 / 4 = 0

(Decimal part 0.5 is discarded)

Current State:

x = 4
y = 0
z = 0

---------------------------------------------------------
FINAL OUTPUT
---------------------------------------------------------

4 0 0

=========================================================
IMPORTANT CONCEPT:
COMPOUND ASSIGNMENT OPERATORS
=========================================================

x += y

means

x = x + y

---------------------------------------------------------

x -= y

means

x = x - y

---------------------------------------------------------

x *= y

means

x = x * y

---------------------------------------------------------

x /= y

means

x = x / y

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class testthree {

    public static void main(String args[]) {

        // Declare three integer variables:
        // x, y, and z.
        //
        // At this point memory is allocated
        // but values are not yet assigned.
        int x, y, z;

        /*
        =================================================
        CHAIN ASSIGNMENT
        =================================================

        Statement:

        x = y = z = 2;

        Java evaluates from right to left.

        Step 1:
        z = 2

        Step 2:
        y = z

        y = 2

        Step 3:
        x = y

        x = 2

        Final Values:

        x = 2
        y = 2
        z = 2
        */
        x = y = z = 2;

        /*
        =================================================
        COMPOUND ADDITION ASSIGNMENT
        =================================================

        x += y;

        Equivalent to:

        x = x + y;

        Substitute values:

        x = 2 + 2

        x = 4
        */
        x += y;

        /*
        =================================================
        COMPOUND SUBTRACTION ASSIGNMENT
        =================================================

        y -= z;

        Equivalent to:

        y = y - z;

        Substitute values:

        y = 2 - 2

        y = 0
        */
        y -= z;

        /*
        =================================================
        COMPOUND DIVISION ASSIGNMENT
        =================================================

        z /= (x + y);

        Equivalent to:

        z = z / (x + y);

        First evaluate:

        (x + y)

        = 4 + 0

        = 4

        Now:

        z = 2 / 4

        Since both operands are integers,
        Java performs Integer Division.

        2 / 4

        = 0

        Final:

        z = 0
        */
        z /= (x + y);

        // Print final values of x, y, and z.
        //
        // Output:
        //
        // 4 0 0
        System.out.println(x + " " + y + " " + z);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Chain Assignment:

   x = y = z = 2;

   assigns the same value to all variables.

---------------------------------------------------------

2. Compound Assignment Operators:

   +=
   -=
   *=
   /=
   %=

---------------------------------------------------------

3. Example:

   x += 5;

   means

   x = x + 5;

---------------------------------------------------------

4. Integer Division removes decimal values.

   Example:

   2 / 4 = 0

   5 / 2 = 2

---------------------------------------------------------

5. Assignment questions are frequently
   asked in Java MCQs and interviews.

---------------------------------------------------------

6. Always solve step-by-step
   rather than mentally.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Forgetting that:

   x += y

   is same as:

   x = x + y

---------------------------------------------------------

2. Thinking:

   2 / 4 = 0.5

   Wrong for int variables.

---------------------------------------------------------

3. Ignoring execution order.

---------------------------------------------------------

4. Forgetting that chain assignment
   works from right to left.

---------------------------------------------------------

5. Assuming division automatically
   returns decimal values.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates assignment
and compound assignment operators.

First, I initialize x, y, and z with
the same value using chain assignment.

Then I use:

x += y

which adds y to x.

Next:

y -= z

which subtracts z from y.

Finally:

z /= (x + y)

which divides z by the sum of x and y.

Since all variables are integers,
Java performs integer division,
which removes decimal values.

The final values become:

x = 4
y = 0
z = 0"

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

Only three integer variables are used.

No extra memory is required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What does += mean?

Answer:

x += y

is equivalent to

x = x + y

---------------------------------------------------------

Q2. What does -= mean?

Answer:

x -= y

is equivalent to

x = x - y

---------------------------------------------------------

Q3. What does /= mean?

Answer:

x /= y

is equivalent to

x = x / y

---------------------------------------------------------

Q4. What is the output of:

int a = 2;
a /= 4;

Answer:

0

Because integer division removes
the decimal part.

---------------------------------------------------------

Q5. What is the output of this program?

Answer:

4 0 0

=========================================================
END OF FILE
=========================================================
*/
