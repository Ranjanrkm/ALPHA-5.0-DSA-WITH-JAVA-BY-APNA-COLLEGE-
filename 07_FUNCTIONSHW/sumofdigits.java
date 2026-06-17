import java.util.*;

/*
=========================================================
1. Problem Statement
=========================================================
Write a Java program to calculate the sum of digits
of a given integer using a user-defined method.

The program should:
1. Read an integer from input.
2. Extract each digit one by one.
3. Add all digits together.
4. Return and print the final sum.

Example:
Input  : 12345
Output : 15

Explanation:
1 + 2 + 3 + 4 + 5 = 15

=========================================================
2. Input Format
=========================================================
A single integer.

Example:
12345

=========================================================
3. Output Format
=========================================================
Sum of digits is : 15

=========================================================
4. Dry Run Example(s)
=========================================================

Input:
1234

Initial Values:
n = 1234
sumOfDigits = 0

Iteration 1:
lastDigit = 1234 % 10 = 4
sumOfDigits = 0 + 4 = 4
n = 1234 / 10 = 123

Iteration 2:
lastDigit = 123 % 10 = 3
sumOfDigits = 4 + 3 = 7
n = 123 / 10 = 12

Iteration 3:
lastDigit = 12 % 10 = 2
sumOfDigits = 7 + 2 = 9
n = 12 / 10 = 1

Iteration 4:
lastDigit = 1 % 10 = 1
sumOfDigits = 9 + 1 = 10
n = 1 / 10 = 0

Loop Ends

Output:
Sum of digits is : 10

---------------------------------------------------------

Input:
987

Calculation:
9 + 8 + 7 = 24

Output:
Sum of digits is : 24

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class sumofdigits {

    /*
     * Method to calculate the sum of digits.
     *
     * Parameter:
     * n -> Input integer
     *
     * Returns:
     * Sum of all digits present in the number.
     */
    public static int sumDigits(int n) {

        // Handle negative numbers safely
        n = Math.abs(n);

        // Variable to store the sum of digits
        int sumOfDigits = 0;

        // Extract and add digits until number becomes 0
        while (n > 0) {

            // Extract last digit
            int lastDigit = n % 10;

            // Add digit to sum
            sumOfDigits += lastDigit;

            // Remove last digit
            n /= 10;
        }

        // Return final sum
        return sumOfDigits;
    }

    public static void main(String args[]) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read integer input (TCS NQT style - no prompts)
        int digits = sc.nextInt();

        // Print sum of digits
        System.out.println("Sum of digits is : " + sumDigits(digits));

        // Close Scanner
        sc.close();
    }
}

/*
=========================================================
6. Important Notes For Revision
=========================================================

1. The modulus (%) operator is used to extract the
   last digit of a number.

2. Integer division (/) removes the last digit from
   the number after processing.

3. Math.abs() converts negative numbers into positive
   values before digit processing.

4. Digit extraction logic is commonly used in
   palindrome, Armstrong, reverse-number, and
   digit-count problems.

5. This approach uses arithmetic operations and avoids
   String conversion, which is preferred in interviews.

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program calculates the sum of digits of a given
integer using arithmetic operations.

First, I read an integer from the input.

Inside the sumDigits() method, I repeatedly extract
the last digit using the modulus operator (%).

Each extracted digit is added to a running sum.

Then I remove the last digit using integer division.

This process continues until the number becomes zero.

Finally, the calculated sum is returned and printed."

=========================================================
8. Time Complexity
=========================================================

O(d)

Where:
d = Number of digits in the input number

Reason:
Each digit is processed exactly once.

=========================================================
9. Space Complexity
=========================================================

O(1)

Reason:
Only a few integer variables are used.
No extra data structures are required.

=========================================================
10. Interview Quick Answer
=========================================================

Q1. Why do we use n % 10?

Answer:
It extracts the last digit of a number.

Example:
123 % 10 = 3

---------------------------------------------------------

Q2. Why do we use n /= 10?

Answer:
It removes the last digit after processing.

Example:
123 / 10 = 12

---------------------------------------------------------

Q3. Why is Math.abs() used?

Answer:
It ensures that negative numbers are converted into
positive values before digit extraction.

Example:
Math.abs(-123) = 123

---------------------------------------------------------

Q4. Can this problem be solved using String methods?

Answer:
Yes. We can convert the number into a String and
iterate through each character, but arithmetic-based
solutions are generally preferred in coding interviews.
=========================================================
*/
