/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to understand the Post-Increment
Unary Operator (a++).

The program demonstrates how the value is assigned first
and incremented later when using post-increment.

=========================================================
INPUT FORMAT
=========================================================
No Input Required

All values are initialized inside the program.

=========================================================
OUTPUT FORMAT
=========================================================
Print the values of:

1. a
2. b

after executing the post-increment operation.

Expected Output:
11
10

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values:

a = 10

---------------------------------------------------------
STEP 1
---------------------------------------------------------

Statement:

int b = a++;

This is a POST-INCREMENT operation.

Meaning:

1. Assign current value of a to b
2. Then increment a

---------------------------------------------------------
STEP 2
---------------------------------------------------------

Assign value to b

b = 10

Current State:

a = 10
b = 10

---------------------------------------------------------
STEP 3
---------------------------------------------------------

Increment a

a = a + 1

a = 11

Final State:

a = 11
b = 10

---------------------------------------------------------
OUTPUT
---------------------------------------------------------

11
10

=========================================================
PRE-INCREMENT VS POST-INCREMENT
=========================================================

PRE-INCREMENT (++a)

1. Increment first
2. Then assign

Example:

a = 10

b = ++a

a = 11
b = 11

---------------------------------------------------------

POST-INCREMENT (a++)

1. Assign first
2. Then increment

Example:

a = 10

b = a++

a = 11
b = 10

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class unaryoperators {

    public static void main(String args[]) {

        // Create an integer variable named 'a'
        // and store value 10 inside it.
        //
        // Initial State:
        // a = 10
        int a = 10;

        /*
        =================================================
        POST-INCREMENT OPERATOR
        =================================================

        Statement:

        int b = a++;

        Post-Increment works in two steps:

        Step 1:
        Assign current value of a to b.

        b = 10

        Step 2:
        Increase value of a by 1.

        a = 11

        Final Values:

        a = 11
        b = 10
        */
        int b = a++;

        // Print updated value of a.
        //
        // After post-increment:
        // a = 11
        System.out.println(a);

        // Print value stored inside b.
        //
        // b received the old value
        // before increment happened.
        //
        // b = 10
        System.out.println(b);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Unary Operator works on only one operand.

   Example:

   ++a
   --a
   a++
   a--

2. Pre-Increment:

   ++a

   Increment first
   Then use the value

3. Post-Increment:

   a++

   Use current value first
   Then increment

4. Pre-Decrement:

   --a

   Decrement first
   Then use the value

5. Post-Decrement:

   a--

   Use current value first
   Then decrement

6. Interview Rule:

   Pre-Increment:
   Change → Use

   Post-Increment:
   Use → Change

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Thinking a++ and ++a are always same.

   They are not same when assignment
   is involved.

---------------------------------------------------------

2. Forgetting execution order.

   Post-Increment:

   Use first
   Increment later

---------------------------------------------------------

3. Predicting wrong output for:

   int b = a++;

---------------------------------------------------------

4. Mixing increment operators inside
   complex expressions without tracing.

---------------------------------------------------------

5. Confusing increment with addition.

   a++

   is equivalent to:

   a = a + 1

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates the
post-increment unary operator.

Initially, variable a contains 10.

When executing:

int b = a++;

Java first assigns the current value of a
to b, which is 10.

After assignment, Java increments a by 1.

Therefore, the final values become:

a = 11
b = 10

This example clearly shows the difference
between pre-increment and post-increment."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

Only constant-time assignment and
increment operations are performed.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only two integer variables are used.

No extra memory is required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is a Unary Operator?

Answer:
An operator that works on only one operand.

Examples:

++a
a++
--a
a--

---------------------------------------------------------

Q2. What is Pre-Increment?

Answer:

++a

The value is incremented first and then used.

Example:

a = 10

b = ++a

a = 11
b = 11

---------------------------------------------------------

Q3. What is Post-Increment?

Answer:

a++

The current value is used first and then
incremented.

Example:

a = 10

b = a++

a = 11
b = 10

---------------------------------------------------------

Q4. Output of:

int a = 5;
System.out.println(a++);

Answer:

5

After printing:
a becomes 6

---------------------------------------------------------

Q5. Output of:

int a = 5;
System.out.println(++a);

Answer:

6

Because increment happens first.

=========================================================
END OF FILE
=========================================================
*/