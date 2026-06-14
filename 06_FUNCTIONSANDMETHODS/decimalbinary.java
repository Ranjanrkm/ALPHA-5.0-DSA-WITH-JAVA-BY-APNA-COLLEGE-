/*
=========================================================
PROBLEM STATEMENT
=========================================================
Convert a Decimal Number into its Binary Equivalent.

Given a decimal number, convert it into binary
representation and print the result.

The binary number is formed by repeatedly:

1. Dividing the decimal number by 2.
2. Storing the remainder.
3. Constructing the binary number using
   powers of 10.

Example:

Decimal Number = 7

Binary Number = 111

=========================================================
INPUT FORMAT
=========================================================
A single integer n.

Example:

7

=========================================================
OUTPUT FORMAT
=========================================================
Print the binary equivalent.

Example:

Binary form of 7 = 111

=========================================================
DRY RUN EXAMPLE
=========================================================

Input:

7

---------------------------------------------------------
INITIALIZATION
---------------------------------------------------------

n = 7

pow = 0

binNum = 0

---------------------------------------------------------
ITERATION 1
---------------------------------------------------------

n = 7

rem = 7 % 2

rem = 1

binNum = 0 + (1 × 10^0)

binNum = 1

n = 7 / 2

n = 3

pow = 1

---------------------------------------------------------
ITERATION 2
---------------------------------------------------------

n = 3

rem = 3 % 2

rem = 1

binNum = 1 + (1 × 10^1)

binNum = 11

n = 3 / 2

n = 1

pow = 2

---------------------------------------------------------
ITERATION 3
---------------------------------------------------------

n = 1

rem = 1 % 2

rem = 1

binNum = 11 + (1 × 10^2)

binNum = 111

n = 1 / 2

n = 0

Loop Ends

---------------------------------------------------------
FINAL OUTPUT
---------------------------------------------------------

Binary form of 7 = 111

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

10

Calculation:

10 % 2 = 0
5 % 2 = 1
2 % 2 = 0
1 % 2 = 1

Binary:

1010

Output:

Binary form of 10 = 1010

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class decimalbinary {

    /*
    =====================================================
    FUNCTION TO CONVERT DECIMAL TO BINARY
    =====================================================

    This method converts a decimal number
    into its binary equivalent.

    Example:

    7 → 111
    10 → 1010
    */
    public static void dectoBin(int n) {

        // Store original number.
        //
        // Used later while printing
        // the final answer.
        int myNum = n;

        // Represents the current position
        // in the binary number.
        //
        // Starts from 10^0.
        int pow = 0;

        // Stores the final binary number.
        int binNum = 0;

        /*
        =================================================
        CONTINUE UNTIL NUMBER BECOMES ZERO
        =================================================
        */
        while (n > 0) {

            // Find remainder after
            // dividing by 2.
            //
            // Possible values:
            //
            // 0 or 1
            int rem = n % 2;

            /*
            Convert remainder into
            corresponding binary position.

            Example:

            rem = 1
            pow = 2

            Contribution:

            1 × 10² = 100
            */
            binNum = binNum
                    + (rem * (int) Math.pow(10, pow));

            // Move to next binary position.
            pow++;

            // Reduce number by dividing by 2.
            n = n / 2;
        }

        // Print final binary number.
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }

    public static void main(String args[]) {

        /*
        =================================================
        SAMPLE FUNCTION CALL
        =================================================

        Decimal Number:

        7

        Binary Number:

        111
        */
        dectoBin(7);
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Decimal Number System:

   Base = 10

   Digits:

   0 to 9

---------------------------------------------------------

2. Binary Number System:

   Base = 2

   Digits:

   0 and 1

---------------------------------------------------------

3. Decimal to Binary Logic:

   Repeatedly divide by 2
   and store remainders.

---------------------------------------------------------

4. Remainders form the binary number.

---------------------------------------------------------

5. Frequently Asked In:

   • TCS NQT
   • Infosys
   • Wipro
   • Capgemini
   • Java Interviews

---------------------------------------------------------

6. Reverse Problem:

   Binary → Decimal

   is also very common.

---------------------------------------------------------

7. Limitation:

   This approach stores binary
   as an integer.

   For very large numbers,
   use StringBuilder instead.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Using:

   n % 10

   instead of

   n % 2

---------------------------------------------------------

2. Forgetting to increment power.

---------------------------------------------------------

3. Forgetting to divide n by 2.

---------------------------------------------------------

4. Using base 2 instead of
   base 10 while constructing
   binary integer.

---------------------------------------------------------

5. Not handling n = 0 separately
   in advanced implementations.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program converts a decimal number
into its binary equivalent.

I repeatedly divide the number by 2 and
store the remainder obtained in each step.

Each remainder contributes to a specific
binary position represented using powers
of 10.

The process continues until the number
becomes zero.

Finally, the constructed binary number
is printed.

For example, decimal 7 is converted to
binary 111."

=========================================================
TIME COMPLEXITY
=========================================================

O(log₂ n)

Reason:

In every iteration,
the number is divided by 2.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few variables are used.

No additional data structures are required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. How do you convert decimal to binary?

Answer:

Repeatedly divide by 2 and store remainders.

---------------------------------------------------------

Q2. What is binary representation of 7?

Answer:

111

---------------------------------------------------------

Q3. What is binary representation of 10?

Answer:

1010

---------------------------------------------------------

Q4. Why is Time Complexity O(log n)?

Answer:

Because the number gets divided by 2
in every iteration.

---------------------------------------------------------

Q5. What are valid binary digits?

Answer:

0 and 1

=========================================================
END OF FILE
=========================================================
*/
