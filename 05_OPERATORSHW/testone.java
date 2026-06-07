/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to evaluate two arithmetic
expressions and understand:

1. Operator Precedence
2. Integer Division
3. Effect of Parentheses

Expressions:

exp1 = (x * y / x)

exp2 = (x * (y / x))

Given:

x = 2
y = 5

Print the result of both expressions.

=========================================================
INPUT FORMAT
=========================================================
No Input Required

Values are already initialized:

x = 2
y = 5

=========================================================
OUTPUT FORMAT
=========================================================
Print:

exp1
exp2

Expected Output:

5
4

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values:

x = 2
y = 5

---------------------------------------------------------
CALCULATING exp1
---------------------------------------------------------

Expression:

(x * y / x)

Substitute values:

(2 * 5 / 2)

Step 1:

2 * 5

= 10

Step 2:

10 / 2

= 5

Therefore:

exp1 = 5

---------------------------------------------------------
CALCULATING exp2
---------------------------------------------------------

Expression:

(x * (y / x))

Substitute values:

2 * (5 / 2)

Step 1:

5 / 2

Since both operands are integers,
Java performs Integer Division.

5 / 2 = 2

(Decimal part 0.5 is discarded)

Step 2:

2 * 2

= 4

Therefore:

exp2 = 4

---------------------------------------------------------
FINAL OUTPUT
---------------------------------------------------------

5
4

=========================================================
IMPORTANT CONCEPT
=========================================================

Even though both expressions look similar,
their outputs are different because of
Parentheses and Integer Division.

Expression 1:

(2 * 5 / 2)

= 10 / 2

= 5

Expression 2:

2 * (5 / 2)

= 2 * 2

= 4

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class testone {

    public static void main(String args[]) {

        // Create integer variable x
        // and store value 2.
        //
        // After execution:
        // x = 2
        int x = 2;

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

        (x * y / x)

        Substitute values:

        (2 * 5 / 2)

        Step 1:

        2 * 5

        = 10

        Step 2:

        10 / 2

        = 5

        Final Result:

        exp1 = 5
        */
        int exp1 = (x * y / x);

        /*
        =================================================
        EXPRESSION 2
        =================================================

        Formula:

        (x * (y / x))

        Substitute values:

        2 * (5 / 2)

        Step 1:

        5 / 2

        Since both operands are int,
        Java performs Integer Division.

        5 / 2

        = 2

        Decimal part (.5) is removed.

        Step 2:

        2 * 2

        = 4

        Final Result:

        exp2 = 4
        */
        int exp2 = (x * (y / x));

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

1. Integer Division removes the
   decimal portion.

   Example:

   5 / 2 = 2

   Not 2.5

---------------------------------------------------------

2. Parentheses can completely change
   the final answer.

---------------------------------------------------------

3. Multiplication (*) and Division (/)
   have the same precedence.

---------------------------------------------------------

4. When precedence is same,
   Java evaluates Left to Right.

---------------------------------------------------------

5. Expression evaluation questions
   are very common in:

   - Java Interviews
   - TCS NQT
   - Infosys
   - Wipro
   - Accenture

---------------------------------------------------------

6. Always solve expressions step-by-step
   to avoid mistakes.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Assuming:

   (x * y / x)

   and

   (x * (y / x))

   are always equal.

   They are not.

---------------------------------------------------------

2. Forgetting Integer Division.

---------------------------------------------------------

3. Ignoring Parentheses.

---------------------------------------------------------

4. Thinking:

   5 / 2 = 2.5

   Wrong for int values.

---------------------------------------------------------

5. Solving the entire expression
   mentally without breaking it
   into smaller steps.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates the impact of
operator precedence, parentheses, and
integer division in Java.

I initialized x = 2 and y = 5.

For the first expression:

(x * y / x)

Java evaluates multiplication first,
giving 10, and then divides by 2,
resulting in 5.

For the second expression:

(x * (y / x))

The expression inside parentheses is
evaluated first.

Since 5 and 2 are integers, Java performs
integer division and produces 2.

Then 2 is multiplied by x, resulting in 4.

This example clearly shows how parentheses
and integer division can change the result."

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

No extra data structures are required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is Integer Division?

Answer:

Integer Division removes the decimal part.

Example:

5 / 2 = 2

---------------------------------------------------------

Q2. Why are exp1 and exp2 different?

Answer:

Because parentheses change the order
of evaluation and integer division
occurs inside exp2.

---------------------------------------------------------

Q3. What is the output of:

10 / 3

Answer:

3

Because decimal values are discarded.

---------------------------------------------------------

Q4. How can we get 2.5 instead of 2?

Answer:

Use double values.

Example:

5.0 / 2

Result = 2.5

---------------------------------------------------------

Q5. What are the outputs of this program?

Answer:

exp1 = 5

exp2 = 4

=========================================================
END OF FILE
=========================================================
*/


