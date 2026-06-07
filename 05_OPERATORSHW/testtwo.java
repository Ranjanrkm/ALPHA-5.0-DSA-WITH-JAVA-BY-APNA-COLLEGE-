/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to understand:

1. Relational Operators
   - >
   - <
2. Logical AND Operator (&&)
3. Conditional Statements (if)

The program evaluates three different conditions
using the values:

x = 200
y = 50
z = 100

and prints output whenever a condition becomes true.

=========================================================
INPUT FORMAT
=========================================================
No Input Required

Values are initialized inside the program.

=========================================================
OUTPUT FORMAT
=========================================================
Print the statements whose conditions evaluate
to true.

Expected Output:

java

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values:

x = 200
y = 50
z = 100

---------------------------------------------------------
FIRST IF CONDITION
---------------------------------------------------------

Condition:

x > y && y > z

Substitute values:

200 > 50 && 50 > 100

First Part:

200 > 50

TRUE

Second Part:

50 > 100

FALSE

Result:

TRUE && FALSE

FALSE

Therefore:

"Hello" is NOT printed.

---------------------------------------------------------
SECOND IF CONDITION
---------------------------------------------------------

Condition:

z > y && z < x

Substitute values:

100 > 50 && 100 < 200

First Part:

100 > 50

TRUE

Second Part:

100 < 200

TRUE

Result:

TRUE && TRUE

TRUE

Therefore:

"java" is printed.

---------------------------------------------------------
THIRD IF CONDITION
---------------------------------------------------------

Condition:

(y + 200) < x && (y + 50) < z

Substitute values:

(50 + 200) < 200 && (50 + 50) < 100

250 < 200 && 100 < 100

FALSE && FALSE

FALSE

Therefore:

"Hello java" is NOT printed.

---------------------------------------------------------
FINAL OUTPUT
---------------------------------------------------------

java

=========================================================
IMPORTANT CONCEPT:
LOGICAL AND (&&)
=========================================================

The && operator returns TRUE only when
both conditions are TRUE.

Truth Table:

Condition 1    Condition 2    Result

TRUE           TRUE           TRUE
TRUE           FALSE          FALSE
FALSE          TRUE           FALSE
FALSE          FALSE          FALSE

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class testtwo {

    public static void main(String args[]) {

        // Create integer variable x
        // and store value 200.
        //
        // After execution:
        // x = 200
        int x = 200;

        // Create integer variable y
        // and store value 50.
        //
        // After execution:
        // y = 50
        int y = 50;

        // Create integer variable z
        // and store value 100.
        //
        // After execution:
        // z = 100
        int z = 100;

        /*
        =================================================
        FIRST IF CONDITION
        =================================================

        Condition:

        x > y && y > z

        Substitute values:

        200 > 50 && 50 > 100

        First Part:

        200 > 50

        TRUE

        Second Part:

        50 > 100

        FALSE

        Final Result:

        TRUE && FALSE

        FALSE

        Therefore the code inside
        this if block will NOT execute.
        */
        if (x > y && y > z) {

            // This statement will not execute
            // because the condition is false.
            System.out.println("Hello");
        }

        /*
        =================================================
        SECOND IF CONDITION
        =================================================

        Condition:

        z > y && z < x

        Substitute values:

        100 > 50 && 100 < 200

        First Part:

        TRUE

        Second Part:

        TRUE

        Final Result:

        TRUE && TRUE

        TRUE

        Therefore this block executes.
        */
        if (z > y && z < x) {

            // This statement executes
            // because the entire condition
            // evaluates to TRUE.
            System.out.println("java");
        }

        /*
        =================================================
        THIRD IF CONDITION
        =================================================

        Condition:

        (y + 200) < x && (y + 50) < z

        Substitute values:

        (50 + 200) < 200
        &&
        (50 + 50) < 100

        First Part:

        250 < 200

        FALSE

        Second Part:

        100 < 100

        FALSE

        Final Result:

        FALSE && FALSE

        FALSE

        Therefore this block
        will NOT execute.
        */
        if ((y + 200) < x && (y + 50) < z) {

            // This statement will not execute
            // because condition is false.
            System.out.println("Hello java");
        }
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Relational Operators return
   boolean values.

   Examples:

   >
   <
   >=
   <=
   ==
   !=

---------------------------------------------------------

2. Logical AND (&&) returns TRUE only
   when all conditions are TRUE.

---------------------------------------------------------

3. If any one condition becomes FALSE,
   the entire && expression becomes FALSE.

---------------------------------------------------------

4. if statement executes only when
   the condition evaluates to TRUE.

---------------------------------------------------------

5. && uses Short-Circuit Evaluation.

   Example:

   false && anything

   Java immediately returns FALSE
   without checking the second condition.

---------------------------------------------------------

6. Logical operator questions are very
   common in TCS NQT, Infosys, Wipro,
   Accenture, Capgemini, and interviews.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Confusing:

   &
   and
   &&

---------------------------------------------------------

2. Using assignment operator (=)
   instead of comparison operator (==).

---------------------------------------------------------

3. Forgetting operator precedence.

---------------------------------------------------------

4. Assuming one TRUE condition is enough
   for && to return TRUE.

---------------------------------------------------------

5. Not evaluating conditions step-by-step.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates the use of
relational operators, logical AND operator,
and if statements in Java.

I initialized three variables:
x = 200, y = 50, and z = 100.

Then I evaluated three separate conditions.

The first condition evaluates to false,
so nothing is printed.

The second condition evaluates to true,
therefore 'java' is printed.

The third condition evaluates to false,
so it is skipped.

The final output of the program is 'java'."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

Only a fixed number of comparisons
and logical operations are performed.

No loops or recursion are used.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only three integer variables are stored.

No additional memory or data structures
are required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What does && mean?

Answer:

Logical AND operator.

Returns TRUE only if all conditions
are TRUE.

---------------------------------------------------------

Q2. What is the output of:

true && false

Answer:

false

---------------------------------------------------------

Q3. What is Short-Circuit Evaluation?

Answer:

If the first condition of && becomes false,
Java skips evaluating the remaining condition.

---------------------------------------------------------

Q4. Which condition becomes true
in this program?

Answer:

z > y && z < x

---------------------------------------------------------

Q5. What is the final output?

Answer:

java

=========================================================
END OF FILE
=========================================================
*/