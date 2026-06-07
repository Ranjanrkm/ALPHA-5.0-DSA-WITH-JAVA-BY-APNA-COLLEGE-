/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to understand Operator
Precedence, Associativity, and Integer Division.

Evaluate the following expressions:

exp1 = (y * (x / y + x / y))

exp2 = (y * x / y + y * x / y)

and print their results.

This program demonstrates how Java evaluates
mathematical expressions step-by-step.

=========================================================
INPUT FORMAT
=========================================================
No Input Required

Values are initialized inside the program.

x = 10
y = 5

=========================================================
OUTPUT FORMAT
=========================================================
Print:

exp1
exp2

Expected Output:

20
20

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values:

x = 10
y = 5

---------------------------------------------------------
CALCULATING exp1
---------------------------------------------------------

Expression:

(y * (x / y + x / y))

Substitute values:

5 * (10 / 5 + 10 / 5)

Step 1:

10 / 5 = 2

Expression becomes:

5 * (2 + 2)

Step 2:

2 + 2 = 4

Expression becomes:

5 * 4

Step 3:

5 * 4 = 20

Therefore:

exp1 = 20

---------------------------------------------------------
CALCULATING exp2
---------------------------------------------------------

Expression:

(y * x / y + y * x / y)

Substitute values:

(5 * 10 / 5 + 5 * 10 / 5)

Step 1:

5 * 10 = 50

Expression becomes:

50 / 5 + 50 / 5

Step 2:

50 / 5 = 10

Expression becomes:

10 + 10

Step 3:

10 + 10 = 20

Therefore:

exp2 = 20

---------------------------------------------------------
FINAL OUTPUT
---------------------------------------------------------

20
20

=========================================================
IMPORTANT CONCEPT:
OPERATOR PRECEDENCE
=========================================================

1. Parentheses () have highest priority.

2. Multiplication (*) and Division (/)
   have same precedence.

3. When operators have same precedence,
   Java evaluates from Left to Right.

This rule is called:

Left-to-Right Associativity

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class testfive {

    public static void main(String args[]) {

        // Create integer variable x
        // and store value 10.
        //
        // After execution:
        // x = 10
        int x = 10;

        // Create integer variable y
        // and store value 5.
        //
        // After execution:
        // y = 5
        int y = 5;

        /*
        =================================================
        EXPRESSION 1
        =================================================

        Formula:

        (y * (x / y + x / y))

        Step 1:

        x / y

        = 10 / 5
        = 2

        Step 2:

        x / y

        = 10 / 5
        = 2

        Step 3:

        (2 + 2)
        = 4

        Step 4:

        y * 4

        = 5 * 4
        = 20

        Final Result:

        exp1 = 20
        */
        int exp1 = (y * (x / y + x / y));

        /*
        =================================================
        EXPRESSION 2
        =================================================

        Formula:

        (y * x / y + y * x / y)

        Java evaluates * and /
        from Left to Right.

        First Part:

        5 * 10 = 50

        50 / 5 = 10

        Second Part:

        5 * 10 = 50

        50 / 5 = 10

        Final:

        10 + 10

        = 20

        Final Result:

        exp2 = 20
        */
        int exp2 = (y * x / y + y * x / y);

        // Print result of first expression.
        System.out.println(exp1);

        // Print result of second expression.
        System.out.println(exp2);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Operator Precedence decides
   which operation executes first.

2. Parentheses () always get
   highest priority.

3. Multiplication (*) and Division (/)
   have equal precedence.

4. Equal precedence operators
   are evaluated from Left to Right.

5. Integer Division:

   10 / 5 = 2

   11 / 5 = 2

   Decimal part is discarded.

6. Java follows BODMAS/PEDMAS rules
   with associativity.

7. Parentheses improve readability
   and reduce logical mistakes.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Forgetting that integer division
   removes decimal values.

   Example:

   11 / 5 = 2

   Not 2.2

---------------------------------------------------------

2. Ignoring parentheses.

---------------------------------------------------------

3. Assuming multiplication executes
   before division.

   Actually both have same precedence.

---------------------------------------------------------

4. Forgetting Left-to-Right evaluation.

---------------------------------------------------------

5. Miscalculating expressions mentally
   without breaking them into steps.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates operator
precedence and associativity in Java.

I initialized two integer variables,
x = 10 and y = 5.

Then I evaluated two mathematical
expressions.

For exp1, parentheses force Java to
calculate the division results and
addition first before multiplication.

For exp2, multiplication and division
have the same precedence, so Java
evaluates them from left to right.

After simplification, both expressions
produce the same result, which is 20.

This example helps understand how Java
processes arithmetic expressions."

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

Only a few integer variables are used.

No additional data structures are created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is Operator Precedence?

Answer:
Operator precedence determines which
operator is evaluated first.

---------------------------------------------------------

Q2. Which has higher precedence:
Multiplication or Division?

Answer:
Both have the same precedence.

---------------------------------------------------------

Q3. How are operators with equal
precedence evaluated?

Answer:
From Left to Right.

---------------------------------------------------------

Q4. What is the result of:

11 / 5

Answer:
2

Because integer division removes
the decimal part.

---------------------------------------------------------

Q5. Why use parentheses?

Answer:
To control evaluation order and
improve code readability.

=========================================================
END OF FILE
=========================================================
*/