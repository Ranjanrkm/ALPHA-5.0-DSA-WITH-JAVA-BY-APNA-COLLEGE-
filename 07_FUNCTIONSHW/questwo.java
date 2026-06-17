import java.util.*;

/*
=========================================================
1. Problem Statement
=========================================================
Write a Java program to check whether a given number
is Even or Odd using a user-defined method.

A number is:
- Even if it is divisible by 2.
- Odd if it is not divisible by 2.

The program should:
1. Read an integer input.
2. Pass the number to a method named isEven().
3. Return true if the number is even.
4. Return false if the number is odd.
5. Display the appropriate result.

=========================================================
2. Input Format
=========================================================
A single integer.

Example:
10

=========================================================
3. Output Format
=========================================================
If the number is even:
Number is even
true

If the number is odd:
Number is odd
false

=========================================================
4. Dry Run Example(s)
=========================================================

Input:
10

Method Call:
isEven(10)

Calculation:
10 % 2 = 0

Condition:
0 == 0 → true

Output:
Number is even
true

---------------------------------------------------------

Input:
7

Method Call:
isEven(7)

Calculation:
7 % 2 = 1

Condition:
1 == 0 → false

Output:
Number is odd
false

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class questwo {

    /*
     * Method to check whether a number is even.
     *
     * Parameter:
     * n -> Input integer
     *
     * Returns:
     * true  -> Number is even
     * false -> Number is odd
     */
    public static boolean isEven(int n) {

        // Check divisibility by 2
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read integer input (TCS NQT style - no prompts)
        int n = sc.nextInt();

        // Check and print result
        if (isEven(n)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        // Print boolean result
        System.out.println(isEven(n));

        // Close Scanner
        sc.close();
    }
}

/*
=========================================================
6. Important Notes For Revision
=========================================================

1. The modulus operator (%) returns the remainder
   after division.

2. A number is even if n % 2 == 0.

3. boolean methods return either true or false and
   are commonly used in condition checking.

4. static methods can be called directly from main()
   without creating an object.

5. Negative numbers can also be even or odd.
   Example:
   -8 -> Even
   -7 -> Odd

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program checks whether a given number is even
or odd using a user-defined boolean method.

First, I read an integer from the user.

Then I pass that number to the isEven() method.

Inside the method, I use the modulus operator (%)
to check whether the remainder after division by 2
is zero.

If the remainder is zero, the method returns true;
otherwise, it returns false.

Based on the returned value, I print whether the
number is even or odd and also display the boolean
result."

=========================================================
8. Time Complexity
=========================================================

O(1)

Reason:
Only one modulus operation and one condition check
are performed.

=========================================================
9. Space Complexity
=========================================================

O(1)

Reason:
Only a few primitive variables are used.

=========================================================
10. Interview Quick Answer
=========================================================

Q1. Why is n % 2 == 0 used to check even numbers?

Answer:
Because an even number is completely divisible by 2,
which means the remainder becomes 0.

---------------------------------------------------------

Q2. Can the isEven() method be simplified?

Answer:
Yes.

return n % 2 == 0;

This directly returns the boolean result without
using if-else.

---------------------------------------------------------

Q3. Why is the return type boolean?

Answer:
Because the method only needs to indicate whether
the condition is true or false.

---------------------------------------------------------

Q4. Does this logic work for negative numbers?

Answer:
Yes.

Examples:
-10 % 2 = 0 → Even
-7 % 2 = -1 → Odd

Therefore the same logic works correctly for both
positive and negative integers.
=========================================================
*/