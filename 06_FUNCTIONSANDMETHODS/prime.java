/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to check whether a given
number is Prime or Not Prime.

A Prime Number is a number that has exactly
two factors:

1. 1
2. Itself

Examples:

2, 3, 5, 7, 11, 13 ...

Not Prime:

1, 4, 6, 8, 9, 10 ...

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

n = 2

---------------------------------------------------------

Since n = 2

2 is the smallest prime number.

Return:

true

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

n = 5

---------------------------------------------------------

i = 2

5 % 2 != 0

---------------------------------------------------------

i = 3

5 % 3 != 0

---------------------------------------------------------

i = 4

5 % 4 != 0

---------------------------------------------------------

No divisor found.

Return:

true

=========================================================
DRY RUN EXAMPLE 3
=========================================================

Input:

n = 8

---------------------------------------------------------

i = 2

8 % 2 == 0

Divisor found.

Return:

false

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class prime {

    /*
    =====================================================
    FUNCTION TO CHECK PRIME NUMBER
    =====================================================

    Returns:

    true  -> Prime Number
    false -> Not Prime Number

    Assumption:

    n >= 2
    */
    public static boolean isPrime(int n) {

        /*
        =================================================
        CORNER CASE
        =================================================

        2 is the smallest prime number.

        It has exactly two factors:

        1 and 2
        */
        if (n == 2) {
            return true;
        }

        /*
        =================================================
        CHECK ALL POSSIBLE DIVISORS
        =================================================

        Traverse from 2 up to n-1.

        If any number divides n completely,
        then n cannot be prime.
        */
        for (int i = 2; i <= n - 1; i++) {

            /*
            Check whether current value
            divides n completely.

            If remainder becomes 0,
            a divisor is found.
            */
            if (n % i == 0) {

                // Number is not prime.
                return false;
            }
        }

        /*
        No divisor found.

        Therefore number is prime.
        */
        return true;
    }

    public static void main(String args[]) {

        /*
        =================================================
        SAMPLE FUNCTION CALL
        =================================================

        Checking whether 2 is prime.
        */
        System.out.println(isPrime(2));
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Prime Number:

   Has exactly two factors:

   • 1
   • Itself

---------------------------------------------------------

2. Smallest Prime Number:

   2

---------------------------------------------------------

3. 1 is NOT a Prime Number.

---------------------------------------------------------

4. Current Approach:

   Check divisibility from:

   2 to n-1

---------------------------------------------------------

5. Better Optimization:

   Check only up to:

   √n

   Because factors always occur in pairs.

---------------------------------------------------------

6. Interviewers frequently ask:

   "Can you optimize this solution?"

   Expected answer:

   Iterate only till sqrt(n).

---------------------------------------------------------

7. Hidden Edge Cases:

   n = 0

   n = 1

   n = 2

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program checks whether a number is
prime or not.

First, I handle the special case of 2,
which is the smallest prime number.

Then I iterate from 2 to n-1 and check
whether any number divides n completely.

If a divisor is found, I immediately return
false because the number cannot be prime.

If the loop completes without finding any
divisor, I return true.

This is a straightforward brute-force
approach for prime checking."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Reason:

In the worst case, the loop runs from
2 to n-1.

For a prime number, all iterations execute.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few variables are used.

No extra data structure is required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Can this solution be optimized further?

Answer:

Yes.

Instead of checking till n-1, we only need
to check till √n.

If no factor exists up to √n, no larger
factor can exist without a corresponding
smaller factor already being found.

This reduces complexity from O(n) to O(√n).

---------------------------------------------------------

Q2. Why does the function immediately return
false when a divisor is found?

Answer:

Once a divisor other than 1 and itself is
found, the number is definitely not prime.

There is no need to continue checking,
which saves unnecessary iterations.

---------------------------------------------------------

Q3. What happens for n = 1 in this code?

Answer:

This implementation assumes n >= 2.

If n = 1 is passed, the loop does not run
and the function incorrectly returns true.

A production-ready solution should handle:

if(n <= 1)
    return false;

before checking divisibility.

=========================================================
END OF FILE
=========================================================
*/
