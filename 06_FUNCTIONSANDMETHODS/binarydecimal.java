/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to convert a Binary Number
(Binary Base-2) into its Decimal Equivalent
(Decimal Base-10).

The program should:

1. Take a binary number.
2. Extract each digit from right to left.
3. Multiply each digit by 2 raised to its position.
4. Add all values together.
5. Print the decimal equivalent.

Example:

Binary Number = 101

Calculation:

1 × 2^0 + 0 × 2^1 + 1 × 2^2

= 1 + 0 + 4

= 5

Decimal Equivalent = 5

=========================================================
INPUT FORMAT
=========================================================
A single integer representing a binary number.

Example:
101

=========================================================
OUTPUT FORMAT
=========================================================
Print the decimal equivalent.

Example:
Decimal of 101 = 5

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:

101

Initial Values:

binNum = 101
pow = 0
decNum = 0

---------------------------------------------------------
ITERATION 1
---------------------------------------------------------

lastDigit = 101 % 10

= 1

Contribution:

1 × 2^0

= 1

decNum = 0 + 1

= 1

pow = 1

binNum = 101 / 10

= 10

---------------------------------------------------------
ITERATION 2
---------------------------------------------------------

lastDigit = 10 % 10

= 0

Contribution:

0 × 2^1

= 0

decNum = 1 + 0

= 1

pow = 2

binNum = 10 / 10

= 1

---------------------------------------------------------
ITERATION 3
---------------------------------------------------------

lastDigit = 1 % 10

= 1

Contribution:

1 × 2^2

= 4

decNum = 1 + 4

= 5

pow = 3

binNum = 1 / 10

= 0

Loop Ends

---------------------------------------------------------
FINAL OUTPUT
---------------------------------------------------------

Decimal of 101 = 5

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:

1111

Calculation:

1×2^0 = 1
1×2^1 = 2
1×2^2 = 4
1×2^3 = 8

Total:

1 + 2 + 4 + 8

= 15

Output:

Decimal of 1111 = 15

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

import java.util.*;

public class binarydecimal {

    /*
    =====================================================
    METHOD TO CONVERT BINARY TO DECIMAL
    =====================================================

    This method accepts a binary number
    and converts it into decimal format.
    */
    public static void binToDecimal(int binNum) {

        // Store the original binary number.
        //
        // This is used later while printing
        // the final result.
        //
        // Example:
        // binNum = 101
        // myNum = 101
        int myNum = binNum;

        // Variable used to track the position
        // of binary digits.
        //
        // Rightmost digit starts at power 0.
        int pow = 0;

        // Variable used to store the final
        // decimal number.
        int decNum = 0;

        /*
        =================================================
        PROCESS EACH BINARY DIGIT
        =================================================

        Continue until all digits
        are processed.
        */
        while (binNum > 0) {

            // Extract the last digit
            // of the binary number.
            //
            // Example:
            //
            // 101 % 10 = 1
            int lastDigit = binNum % 10;

            // Convert binary digit into
            // decimal contribution.
            //
            // Formula:
            //
            // digit × 2^position
            //
            // Example:
            //
            // 1 × 2^2 = 4
            decNum = decNum
                    + (lastDigit * (int) Math.pow(2, pow));

            // Move to the next power.
            //
            // Example:
            //
            // 2^0 → 2^1 → 2^2
            pow++;

            // Remove the last digit
            // from the binary number.
            //
            // Example:
            //
            // 101 / 10 = 10
            binNum = binNum / 10;
        }

        // Print final decimal equivalent.
        //
        // Example:
        //
        // Decimal of 101 = 5
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    public static void main(String args[]) {

        // Create Scanner object
        // for taking input.
        Scanner sc = new Scanner(System.in);

        // Read binary number.
        //
        // Example Input:
        //
        // 101
        int binNum = sc.nextInt();

        // Call conversion method.
        binToDecimal(binNum);

        // Close Scanner.
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Binary Number contains only:

   0 and 1

---------------------------------------------------------

2. Decimal Conversion Formula:

   digit × 2^position

---------------------------------------------------------

3. Position starts from:

   Right to Left

---------------------------------------------------------

4. Math.pow(2, pow)

   returns:

   2 raised to power pow

---------------------------------------------------------

5. Frequently Asked In:

   • TCS NQT
   • Infosys
   • Wipro
   • Capgemini
   • Java Interviews

---------------------------------------------------------

6. Reverse Concept:

   Decimal → Binary

   can also be asked in interviews.

---------------------------------------------------------

7. Hidden Test Case Tip:

   Validate that input contains only
   binary digits (0 and 1) in real-world
   interview solutions.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Using base 10 instead of base 2.

---------------------------------------------------------

2. Forgetting to increment power.

---------------------------------------------------------

3. Processing digits from left to right.

---------------------------------------------------------

4. Forgetting type casting:

   (int) Math.pow(...)

---------------------------------------------------------

5. Assuming binary numbers can contain:

   2, 3, 4, 5...

   They cannot.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program converts a binary number
into its decimal equivalent.

I process the binary number from right
to left using modulus and division.

For each digit, I multiply it by
2 raised to the current position.

I continuously add these contributions
to obtain the decimal value.

A variable named 'pow' keeps track
of the current binary position.

The algorithm continues until all
digits are processed and then prints
the decimal equivalent."

=========================================================
TIME COMPLEXITY
=========================================================

O(n)

Where:

n = Number of digits in the binary number

Reason:

Each digit is processed exactly once.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few integer variables are used.

No extra array or collection is required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is a Binary Number?

Answer:

A number represented using only:

0 and 1

---------------------------------------------------------

Q2. What is the decimal value of:

101 ?

Answer:

5

---------------------------------------------------------

Q3. What is the decimal value of:

1111 ?

Answer:

15

---------------------------------------------------------

Q4. What formula is used?

Answer:

digit × 2^position

---------------------------------------------------------

Q5. What is the time complexity?

Answer:

O(n)

Because every binary digit is processed once.

=========================================================
END OF FILE
=========================================================
*/
