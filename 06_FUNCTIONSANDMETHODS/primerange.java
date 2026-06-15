/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to print all Prime Numbers
from 2 to N.

A Prime Number is a number that has exactly
two factors:

1. 1
2. Itself

The program uses:

1. Prime Checking Function
2. Optimized Prime Logic (√n)
3. Function Calling
4. Nested Method Execution

Example:

Input:
20

Output:
2 3 5 7 11 13 17 19

=========================================================
INPUT FORMAT
=========================================================

A single integer n.

Example:

20

=========================================================
OUTPUT FORMAT
=========================================================

Print all prime numbers from 2 to n.

Example:

2 3 5 7 11 13 17 19

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

n = 10

---------------------------------------------------------

i = 2

isPrime(2) = true

Print:

2

---------------------------------------------------------

i = 3

isPrime(3) = true

Print:

3

---------------------------------------------------------

i = 4

isPrime(4) = false

Skip

---------------------------------------------------------

i = 5

isPrime(5) = true

Print:

5

---------------------------------------------------------

i = 6

isPrime(6) = false

Skip

---------------------------------------------------------

i = 7

isPrime(7) = true

Print:

7

---------------------------------------------------------

i = 8

isPrime(8) = false

Skip

---------------------------------------------------------

i = 9

isPrime(9) = false

Skip

---------------------------------------------------------

i = 10

isPrime(10) = false

Skip

---------------------------------------------------------

Final Output:

2 3 5 7

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class primerange {

    /*
    =====================================================
    FUNCTION TO CHECK PRIME NUMBER
    =====================================================

    Returns:

    true  -> Prime Number
    false -> Not Prime Number
    */
    public static boolean isprime(int n) {

        // Handle invalid prime cases.
        if (n <= 1) {
            return false;
        }

        // Smallest prime number.
        if (n == 2) {
            return true;
        }

        /*
        Check divisibility only up to √n.

        This optimization reduces
        unnecessary iterations.
        */
        for (int i = 2; i <= Math.sqrt(n); i++) {

            // If divisor found,
            // number is not prime.
            if (n % i == 0) {
                return false;
            }
        }

        // No divisor found.
        return true;
    }

    /*
    =====================================================
    FUNCTION TO PRINT PRIME NUMBERS
    =====================================================

    Prints all prime numbers
    from 2 to n.
    */
    public static void primeinrange(int n) {

        /*
        Traverse from 2 to n
        and check each number.
        */
        for (int i = 2; i <= n; i++) {

            /*
            Call prime checking function.

            If current number is prime,
            print it.
            */
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String args[]) {

        // Print prime numbers
        // from 2 to 20.
        primeinrange(20);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. √n Prime Optimization

   Prime checking is optimized from O(n)
   to O(√n) using the factor-pair concept.

---------------------------------------------------------

2. Method Decomposition

   Logic is divided into:

   isprime()      → Prime Validation

   primeinrange() → Range Traversal

   This improves modularity and reusability.

---------------------------------------------------------

3. Early Return Optimization

   Function immediately returns false
   when a divisor is found, avoiding
   unnecessary iterations.

---------------------------------------------------------

4. Math.sqrt() API

   Math.sqrt(n) returns a double value.

   Frequently asked Java API question.

---------------------------------------------------------

5. Sieve of Eratosthenes

   If interviewers ask for optimization
   of printing primes in a range,
   Sieve is the expected answer.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"I used two methods in this solution.

The first method, isprime(), checks whether
a number is prime using the optimized √n
approach.

The second method, primeinrange(), traverses
from 2 to n and calls isprime() for each number.

If isprime() returns true, the number is printed.

This approach demonstrates modular programming,
code reusability, and prime optimization using
the factor-pair concept."

=========================================================
TIME COMPLEXITY
=========================================================

O(n√n)

Reason:

For every number from 2 to n,
we perform a prime check up to √n.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

No extra array, collection,
or recursion stack is used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is the overall complexity O(n√n)?

Answer:

The outer loop runs n times and each
prime check takes O(√n) time, resulting in
O(n√n) overall complexity.

---------------------------------------------------------

Q2. How can you optimize this program for
large values of n?

Answer:

Use the Sieve of Eratosthenes algorithm.

It generates all prime numbers up to n in:

O(n log log n)

which is significantly faster than O(n√n).

---------------------------------------------------------

Q3. Why do we check divisibility only up to √n?

Answer:

Factors always occur in pairs.

If a factor greater than √n exists,
its corresponding smaller factor must
already exist below √n.

Therefore checking beyond √n is unnecessary.

=========================================================
END OF FILE
=========================================================
*/