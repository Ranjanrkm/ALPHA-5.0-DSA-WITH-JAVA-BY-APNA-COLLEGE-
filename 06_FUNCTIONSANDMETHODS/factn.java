/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to calculate the factorial
of a given number.

Factorial of a number n is defined as:

n! = n × (n-1) × (n-2) × ... × 2 × 1

Examples:

5! = 5 × 4 × 3 × 2 × 1 = 120

4! = 4 × 3 × 2 × 1 = 24

0! = 1

=========================================================
INPUT FORMAT
=========================================================

A single integer n.

Example:

5

=========================================================
OUTPUT FORMAT
=========================================================

Print the factorial of n.

Example:

120

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:

5

---------------------------------------------------------
INITIALIZATION
---------------------------------------------------------

f = 1

---------------------------------------------------------
ITERATION 1
---------------------------------------------------------

i = 1

f = 1 × 1

f = 1

---------------------------------------------------------
ITERATION 2
---------------------------------------------------------

i = 2

f = 1 × 2

f = 2

---------------------------------------------------------
ITERATION 3
---------------------------------------------------------

i = 3

f = 2 × 3

f = 6

---------------------------------------------------------
ITERATION 4
---------------------------------------------------------

i = 4

f = 6 × 4

f = 24

---------------------------------------------------------
ITERATION 5
---------------------------------------------------------

i = 5

f = 24 × 5

f = 120

---------------------------------------------------------
FINAL OUTPUT
---------------------------------------------------------

120

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

4

Calculation:

1 × 2 × 3 × 4

= 24

Output:

24

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

import java.util.*;

public class factn {

    /*
    =====================================================
    FUNCTION TO CALCULATE FACTORIAL
    =====================================================

    This function returns the factorial
    of the given number.

    Formula:

    n! = 1 × 2 × 3 × ... × n
    */
    public static int factorial(int n) {

        // Initialize factorial value with 1.
        //
        // Multiplication starts from 1 because
        // multiplying any number by 1 keeps
        // the value unchanged.
        int f = 1;

        /*
        =================================================
        TRAVERSE FROM 1 TO n
        =================================================

        Multiply each number into the
        factorial variable.
        */
        for (int i = 1; i <= n; i++) {

            // Multiply current factorial
            // value with the current number.
            //
            // Example:
            //
            // f = 6
            // i = 4
            //
            // f = 24
            f = f * i;
        }

        // Return final factorial value.
        return f;
    }

    public static void main(String args[]) {

        // Create Scanner object
        // for reading input.
        Scanner sc = new Scanner(System.in);

        // Read the number whose factorial
        // needs to be calculated.
        int n = sc.nextInt();

        // Call factorial function
        // and store the result.
        int ans = factorial(n);

        // Print factorial.
        System.out.println(ans);

        // Close Scanner object.
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Factorial Formula:

   n! = n × (n-1) × (n-2) × ... × 1

---------------------------------------------------------

2. Special Case:

   0! = 1

---------------------------------------------------------

3. Factorial is defined only for:

   n >= 0

---------------------------------------------------------

4. Most Asked In:

   • TCS NQT
   • Infosys
   • Wipro
   • Accenture
   • Java Interviews

---------------------------------------------------------

5. Factorial grows very rapidly.

   Example:

   10! = 3628800

---------------------------------------------------------

6. For large values of n,
   int may overflow.

   Use long or BigInteger
   for larger inputs.

---------------------------------------------------------

7. Hidden Test Case:

   n = 0

   Output:

   1

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Initializing:

   int f = 0;

   This makes every answer 0.

---------------------------------------------------------

2. Using:

   i < n

   instead of

   i <= n

---------------------------------------------------------

3. Forgetting that:

   0! = 1

---------------------------------------------------------

4. Returning loop variable
   instead of factorial.

---------------------------------------------------------

5. Ignoring integer overflow.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used an iterative approach to calculate
the factorial of a number.

I initialized a variable named 'f' with 1.

Then I traversed from 1 to n and multiplied
each number with the current factorial value.

After the loop finishes, the variable 'f'
contains the factorial of the given number.

This approach is simple, efficient, and
commonly used in interviews and coding tests."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

The loop runs exactly n times.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few variables are used.

No extra array, list, or recursion stack
is required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

✅ Q1. Why did you initialize f with 1 and not 0?
A: Factorial is calculated using multiplication. If we initialize with 0, every multiplication result becomes 0. Therefore we start with 1, the multiplicative identity.

✅ Q2. What happens when n = 0?
A: The loop does not execute and f remains 1, which correctly represents 0! = 1.

✅ Q3. Can this code overflow?
A: Yes. Since int has limited range, factorial values grow very quickly and overflow can occur for larger inputs. We can use long or BigInteger for larger numbers.

✅ Q4. Can you solve this recursively?
A: Yes. Factorial can be implemented recursively using n * factorial(n-1) with a base case of n == 0 or n == 1.

✅ Q5. Why is the Time Complexity O(n)?
A: Because the loop runs exactly n times and performs constant-time work in each iteration.

=========================================================
END OF FILE
=========================================================
*/