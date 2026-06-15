/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to check whether a
number is Prime or Not Prime using the
Optimized Prime Checking Approach.

A Prime Number is a number that has exactly
two factors:

1. 1
2. Itself

Examples:

Prime Numbers:
2, 3, 5, 7, 11, 13

Not Prime:
1, 4, 6, 8, 9, 10

This optimized approach checks divisibility
only up to √n instead of n-1.

=========================================================
INPUT FORMAT
=========================================================

A single integer n.

Example:

7

=========================================================
OUTPUT FORMAT
=========================================================

true

OR

false

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:

n = 7

---------------------------------------------------------

√7 ≈ 2.64

Loop Range:

2 to 2

---------------------------------------------------------

i = 2

7 % 2 != 0

---------------------------------------------------------

No divisor found.

Return:

true

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

n = 36

---------------------------------------------------------

√36 = 6

Loop Range:

2 to 6

---------------------------------------------------------

i = 2

36 % 2 == 0

Divisor Found

Return:

false

=========================================================
WHY √n OPTIMIZATION WORKS
=========================================================

Consider:

n = 36

Factor Pairs:

1 × 36
2 × 18
3 × 12
4 × 9
6 × 6

After √36 = 6,
the factors start repeating.

Therefore, if a factor exists,
at least one factor must be present
before or at √n.

Hence checking beyond √n is unnecessary.

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class primeoptimize {

    /*
    =====================================================
    FUNCTION TO CHECK PRIME NUMBER
    =====================================================

    Returns:

    true  -> Prime Number
    false -> Not Prime Number

    Optimized Approach:

    Check divisibility only up to √n.
    */
    public static boolean isprime(int n) {

        /*
        =================================================
        HANDLE EDGE CASES
        =================================================

        Prime numbers start from 2.

        0 and 1 are not prime.
        */
        if (n <= 1) {
            return false;
        }

        /*
        2 is the smallest and
        only even prime number.
        */
        if (n == 2) {
            return true;
        }

        /*
        =================================================
        OPTIMIZED DIVISIBILITY CHECK
        =================================================

        Instead of checking from:

        2 to n-1

        we only check:

        2 to √n

        This significantly reduces
        the number of iterations.
        */
        for (int i = 2; i <= Math.sqrt(n); i++) {

            /*
            If remainder becomes 0,
            then a divisor exists.

            Therefore the number
            is not prime.
            */
            if (n % i == 0) {
                return false;
            }
        }

        /*
        No divisor found till √n.

        Therefore number is prime.
        */
        return true;
    }

    public static void main(String args[]) {

        // Sample function call.
        System.out.println(isprime(7));
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Prime Number Concept

   A prime number has exactly
   two factors:

   • 1
   • Itself

---------------------------------------------------------

2. Time Complexity Optimization

   Brute Force:

   Check from 2 to n-1

   Complexity:

   O(n)

   Optimized:

   Check from 2 to √n

   Complexity:

   O(√n)

---------------------------------------------------------

3. Mathematical Concept Used

   Factor Pair Property

   If:

   a × b = n

   then at least one factor must be
   less than or equal to √n.

---------------------------------------------------------

4. Java API Used

   Math.sqrt(n)

   Return Type:

   double

---------------------------------------------------------

5. Important Edge Cases

   n <= 1  → false

   n = 2   → true

   n = 3   → true

---------------------------------------------------------

6. Interview Optimization

   For very large prime queries,
   use:

   • Sieve of Eratosthenes
   • Segmented Sieve

---------------------------------------------------------

7. Technical Term

   Early Return Optimization

   The moment a divisor is found,
   the function exits immediately.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used an optimized prime-checking approach.

Instead of checking divisibility from
2 to n-1, I only check up to √n.

The optimization is based on the mathematical
fact that factors always occur in pairs.
If a number has a factor greater than √n,
its corresponding factor must be smaller
than √n.

Therefore checking beyond √n is redundant.

If any divisor is found, I immediately
return false using early termination.
Otherwise, after the loop completes,
I return true."

=========================================================
TIME COMPLEXITY
=========================================================

O(√n)

Reason:

The loop executes only up to √n.

Example:

n = 1,000,000

Iterations ≈ 1000

instead of

999,999

in brute force.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few primitive variables
are used.

No extra arrays, collections,
or recursion stack are required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why does checking up to √n guarantee
that we will find a factor if one exists?

Answer:

Factors occur in pairs.

If n = a × b and both a and b were greater
than √n, then a × b would be greater than n,
which is impossible.

Therefore at least one factor must be
≤ √n.

---------------------------------------------------------

Q2. What is the drawback of using
Math.sqrt(n) inside the loop condition?

Answer:

Math.sqrt(n) is executed repeatedly
during each iteration.

A better implementation is:

int limit = (int)Math.sqrt(n);

for(int i = 2; i <= limit; i++)

This avoids repeated method calls and
improves efficiency slightly.

---------------------------------------------------------

Q3. If multiple prime checks are required,
is this the best approach?

Answer:

No.

For multiple queries, using
Sieve of Eratosthenes is more efficient.

Sieve Complexity:

O(n log log n)

After preprocessing, prime lookup
becomes O(1).

=========================================================
END OF FILE
=========================================================
*/