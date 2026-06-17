import java.util.*;

/*
=========================================================
1. Problem Statement
=========================================================
Write a Java program to check whether a given number
is a Palindrome Number or not.

A Palindrome Number is a number that remains the same
when its digits are reversed.

Examples:
121  -> Palindrome
1331 -> Palindrome
123  -> Not Palindrome

The program should:
1. Read an integer from input.
2. Reverse the number using arithmetic operations.
3. Compare the reversed number with the original number.
4. Print whether the number is a palindrome or not.

=========================================================
2. Input Format
=========================================================
A single integer number.

Example:
121

=========================================================
3. Output Format
=========================================================
If palindrome:
Number : 121 is a palindrome

If not palindrome:
Number : 123 is not a palindrome

=========================================================
4. Dry Run Example(s)
=========================================================

Input:
121

Initial Values:
number = 121
reverse = 0

Iteration 1:
remainder = 121 % 10 = 1
reverse = 0 * 10 + 1 = 1
number = 121 / 10 = 12

Iteration 2:
remainder = 12 % 10 = 2
reverse = 1 * 10 + 2 = 12
number = 12 / 10 = 1

Iteration 3:
remainder = 1 % 10 = 1
reverse = 12 * 10 + 1 = 121
number = 1 / 10 = 0

Comparison:
Original Number = 121
Reversed Number = 121

Output:
Number : 121 is a palindrome

---------------------------------------------------------

Input:
123

Reversed Number:
321

Comparison:
123 != 321

Output:
Number : 123 is not a palindrome

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class ques3 {

    /*
     * Method to check whether a number is palindrome.
     *
     * Parameter:
     * number -> Input number
     *
     * Returns:
     * true  -> if number is palindrome
     * false -> otherwise
     */
    public static boolean isPalindrome(int number) {

        // Store original number for comparison later
        int originalNumber = number;

        // Variable to store reversed number
        int reverse = 0;

        // Reverse the digits of the number
        while (number != 0) {

            // Extract last digit
            int remainder = number % 10;

            // Build reversed number
            reverse = reverse * 10 + remainder;

            // Remove last digit
            number = number / 10;
        }

        // Compare original and reversed numbers
        return originalNumber == reverse;
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read number (TCS NQT style - no prompts)
        int palindrome = sc.nextInt();

        // Check palindrome and print result
        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

        // Close scanner
        sc.close();
    }
}

/*
=========================================================
6. Important Notes For Revision
=========================================================

1. Palindrome checking is commonly performed using
   digit extraction with modulus (%) and division (/).

2. number % 10 extracts the last digit of a number.

3. number / 10 removes the last digit from a number.

4. reverse = reverse * 10 + remainder is the standard
   formula used to reverse an integer.

5. This solution avoids String conversion and uses
   pure mathematical operations, which is preferred
   in coding interviews.

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program checks whether a given number is a
palindrome or not.

First, I store the original number because the input
number will change during the reversing process.

Using a while loop, I repeatedly extract the last
digit using modulus operator (%).

Then I build the reversed number using the formula:

reverse = reverse * 10 + remainder

After removing all digits, I compare the reversed
number with the original number.

If both are equal, the number is a palindrome;
otherwise, it is not."

=========================================================
8. Time Complexity
=========================================================

O(d)

Where:
d = Number of digits in the given number

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

Q1. Why do we store the original number before
reversing it?

Answer:
During the reversing process, the value of number
changes and eventually becomes 0. Therefore, we
store the original value for final comparison.

---------------------------------------------------------

Q2. Can we check palindrome without reversing
the entire number?

Answer:
Yes. We can compare the first and last digits
repeatedly or reverse only half of the number.
However, full reversal is simpler and commonly used.

---------------------------------------------------------

Q3. What happens for a negative number like -121?

Answer:
This implementation returns false because the
reversed value becomes -121 logic-wise, and
negative numbers are generally not considered
palindromes in interview problems.

---------------------------------------------------------

Q4. What is the difference between checking a
palindrome using String and using arithmetic?

Answer:
String approach converts the number into text and
compares characters, while arithmetic approach uses
digit extraction (% and /) and is generally preferred
in DSA and coding interviews.
=========================================================
*/