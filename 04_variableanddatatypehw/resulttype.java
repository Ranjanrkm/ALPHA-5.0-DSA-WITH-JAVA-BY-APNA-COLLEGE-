/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to understand Type Promotion
and Result Type in Java Expressions.

The program contains variables of different data types:

1. byte
2. char
3. short
4. int
5. float
6. double

Evaluate the following expression:

(f * b) + (i % c) - (d * s)

and print the final result.

This program demonstrates how Java automatically
promotes smaller data types to larger data types
during arithmetic operations.

=========================================================
INPUT FORMAT
=========================================================
No Input Required

All values are already initialized inside the program.

=========================================================
OUTPUT FORMAT
=========================================================
Print the final result of the expression.

Example Output:
-51133.1784

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values:

b = 4
c = 'a'
s = 512
i = 1000
f = 3.14
d = 99.9954

---------------------------------------------------------
STEP 1
---------------------------------------------------------

Evaluate:

(f * b)

= 3.14 × 4

= 12.56

---------------------------------------------------------
STEP 2
---------------------------------------------------------

Evaluate:

(i % c)

ASCII value of 'a' = 97

= 1000 % 97

97 × 10 = 970

1000 - 970 = 30

Result = 30

---------------------------------------------------------
STEP 3
---------------------------------------------------------

Evaluate:

(d * s)

= 99.9954 × 512

= 51175.6448

---------------------------------------------------------
STEP 4
---------------------------------------------------------

Final Expression

(f * b) + (i % c) - (d * s)

= 12.56 + 30 - 51175.6448

= 42.56 - 51175.6448

= -51133.0848

Output:
-51133.0848

=========================================================
IMPORTANT CONCEPT:
TYPE PROMOTION IN JAVA
=========================================================

Java automatically promotes smaller data types
during arithmetic operations.

byte  →
short →
char  →  int → long → float → double

Whenever arithmetic is performed on:

byte
short
char

they are automatically converted into int.

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class resulttype {

    public static void main(String args[]) {

        // Store value 4 inside byte variable.
        //
        // Range of byte:
        // -128 to 127
        byte b = 4;

        // Store character 'a'.
        //
        // Internally Java stores characters
        // using Unicode values.
        //
        // ASCII / Unicode value of 'a'
        // is 97.
        char c = 'a';

        // Store value inside short variable.
        //
        // Range:
        // -32768 to 32767
        short s = 512;

        // Store integer value.
        int i = 1000;

        // Store floating-point value.
        //
        // 'f' suffix tells Java that
        // this is a float literal.
        float f = 3.14f;

        // Store double precision value.
        //
        // double provides more precision
        // than float.
        double d = 99.9954;

        /*
        =================================================
        EXPRESSION EVALUATION
        =================================================

        Expression:

        (f * b) + (i % c) - (d * s)

        -------------------------------------------------

        Part 1:

        f * b

        = 3.14 * 4
        = 12.56

        Result Type:
        float

        -------------------------------------------------

        Part 2:

        i % c

        c = 'a'

        ASCII value of 'a' = 97

        = 1000 % 97
        = 30

        Result Type:
        int

        -------------------------------------------------

        Part 3:

        d * s

        = 99.9954 * 512

        = 51175.6448

        Result Type:
        double

        -------------------------------------------------

        Since one operand is double,
        Java promotes the entire
        expression result to double.

        Final Result Type:
        double
        */

        double result = (f * b) + (i % c) - (d * s);

        // Print final computed value.
        System.out.println(result);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. byte, short, and char are automatically
   promoted to int during arithmetic operations.

2. If an expression contains double,
   the final result becomes double.

3. Character values participate in arithmetic
   using their ASCII/Unicode values.

   Example:

   'a' = 97
   'A' = 65

4. Java follows automatic type promotion
   to avoid loss of data.

5. Promotion Order:

   byte → short → int → long
                     ↓
                 float
                     ↓
                 double

6. This is one of the most frequently asked
   interview concepts in Java.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Thinking char cannot participate
   in arithmetic operations.

---------------------------------------------------------

2. Forgetting that:

   byte + byte

   returns int

   not byte.

---------------------------------------------------------

3. Assuming result type remains float
   when double is present.

---------------------------------------------------------

4. Confusing ASCII values of characters.

---------------------------------------------------------

5. Forgetting to add 'f' suffix
   for float literals.

   Wrong:

   float f = 3.14;

   Correct:

   float f = 3.14f;

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates Java's type
promotion rules.

I created variables of different primitive
data types such as byte, char, short, int,
float, and double.

Then I evaluated an arithmetic expression
containing all these variables.

During computation, Java automatically
promotes smaller data types like byte,
short, and char to int.

Since the expression also contains a
double variable, the final result gets
promoted to double.

This example clearly demonstrates how
Java handles mixed-type arithmetic."

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

Only a few primitive variables are used.

No extra data structure is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is Type Promotion in Java?

Answer:
Type Promotion is the automatic conversion
of smaller data types into larger compatible
data types during expression evaluation.

---------------------------------------------------------

Q2. What happens when byte, short,
or char participate in arithmetic?

Answer:
They are automatically converted to int.

---------------------------------------------------------

Q3. What is the ASCII value of 'a'?

Answer:
97

---------------------------------------------------------

Q4. Why is the final result stored
inside double?

Answer:
Because the expression contains a double
value and Java promotes the entire
expression to double.

---------------------------------------------------------

Q5. What is the result type of:

byte a = 5;
byte b = 6;

a + b

Answer:
int

Not byte.

=========================================================
END OF FILE
=========================================================
*/