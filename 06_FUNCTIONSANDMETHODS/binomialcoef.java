/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to calculate the Binomial Coefficient.

Binomial Coefficient formula:

nCr = n! / (r! * (n-r)!)

This program calculates:

5C2

which means:

5 choose 2

=========================================================
INPUT FORMAT
=========================================================
No Input Required

Values are hardcoded inside the program:

n = 5
r = 2

=========================================================
OUTPUT FORMAT
=========================================================
Print the binomial coefficient.

Expected Output:
10

=========================================================
DRY RUN EXAMPLE
=========================================================

Given:
n = 5
r = 2

---------------------------------------------------------
STEP 1: Calculate factorial of n
---------------------------------------------------------

5! = 5 × 4 × 3 × 2 × 1
   = 120

---------------------------------------------------------
STEP 2: Calculate factorial of r
---------------------------------------------------------

2! = 2 × 1
   = 2

---------------------------------------------------------
STEP 3: Calculate factorial of (n-r)
---------------------------------------------------------

(5 - 2)! = 3!
         = 3 × 2 × 1
         = 6

---------------------------------------------------------
STEP 4: Apply Binomial Coefficient Formula
---------------------------------------------------------

nCr = 5! / (2! * 3!)

nCr = 120 / (2 * 6)

nCr = 120 / 12

nCr = 10

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class binomialcoef {

    /*
    =====================================================
    FUNCTION: factorial
    =====================================================

    This function calculates factorial of a number.

    Formula:
    n! = 1 × 2 × 3 × ... × n

    Example:
    factorial(5) = 120
    */
    public static int factorial(int n) {

        // Start factorial with 1 because
        // multiplying by 1 does not change the value.
        int f = 1;

        /*
        =================================================
        LOOP TO CALCULATE FACTORIAL
        =================================================

        Traverse from 1 up to n and multiply
        each number into the result.
        */
        for (int i = 1; i <= n; i++) {

            // Multiply current factorial value
            // with the loop variable.
            f = f * i;
        }

        // Return final factorial value.
        return f; // factorial of n
    }

    /*
    =====================================================
    FUNCTION: bincoeff
    =====================================================

    This function calculates the binomial coefficient.

    Formula:
    nCr = n! / (r! * (n-r)!)
    */
    public static int bincoeff(int n, int r) {

        // Calculate n!
        int fact_n = factorial(n);

        // Calculate r!
        int fact_r = factorial(r);

        // Calculate (n-r)!
        int fact_nmr = factorial(n - r);

        /*
        =================================================
        APPLY BINOMIAL COEFFICIENT FORMULA
        =================================================

        nCr = n! / (r! * (n-r)!)
        */
        int bincoeff = fact_n / (fact_r * fact_nmr);

        // Return final answer.
        return bincoeff;
    }

    public static void main(String args[]) {

        /*
        =================================================
        CALCULATE 5C2
        =================================================

        Example:

        n = 5
        r = 2

        Binomial Coefficient:
        5C2 = 10
        */
        System.out.println(bincoeff(5, 2));
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Binomial coefficient formula:

   nCr = n! / (r! * (n-r)!)

2. Factorial formula:

   n! = 1 × 2 × 3 × ... × n

3. This program uses a simple factorial-based
   method.

4. This method is easy to understand and useful
   for interviews and basics.

5. For large values of n, factorial grows very fast
   and may overflow int.

6. In competitive programming, a more optimized
   approach may be used to avoid overflow.

7. If n < r, binomial coefficient is not valid.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Forgetting the formula:

   nCr = n! / (r! * (n-r)!)

2. Writing:

   factorial(n-r)

   incorrectly as:

   factorial(r-n)

3. Using int for very large factorial values
   and causing overflow.

4. Forgetting that 0! = 1.

5. Not checking whether r > n.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program calculates the binomial coefficient
using the factorial formula.

First, I created a factorial function that
calculates n! using a loop.

Then I used the formula:

nCr = n! / (r! * (n-r)!)

After calculating n!, r!, and (n-r)!,
I divide them according to the formula
and return the result.

For the input values 5 and 2,
the output becomes 10."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:
The factorial function runs in linear time.
It is called three times, but the overall
complexity is still O(n).

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:
Only a few integer variables are used.
No extra data structure is created.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is the formula for binomial coefficient?

Answer:
nCr = n! / (r! * (n-r)!)

---------------------------------------------------------

Q2. What is 5C2?

Answer:
10

---------------------------------------------------------

Q3. What is 0!?

Answer:
1

---------------------------------------------------------

Q4. What is the time complexity of this approach?

Answer:
O(n)

---------------------------------------------------------

Q5. Why can large factorial values be a problem?

Answer:
Because factorial grows very fast and can
overflow int or even long for large n.

=========================================================
END OF FILE
=========================================================
*/