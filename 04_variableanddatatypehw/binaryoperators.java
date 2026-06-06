/*
==========================================================================
1. PROBLEM STATEMENT
==========================================================================
Write a Java program to demonstrate the working of basic binary arithmetic 
operators (+, -, *, /, %). The program should eliminate hardcoded values 
to make it compatible with online grading platforms (such as TCS NQT, 
HackerRank, and CodeChef). It must read two integers, 'a' and 'b', from the 
standard input stream and output their sum, difference, product, quotient, 
and remainder (modulo) in a structured format. The solution must handle 
critical edge cases such as division by zero, negative integers, and large inputs.

==========================================================================
2. INPUT FORMAT
==========================================================================
The input consists of a single line containing two space-separated integers:
- The first integer represents variable 'a'.
- The second integer represents variable 'b'.

Example Input:
10 5

==========================================================================
3. OUTPUT FORMAT
==========================================================================
The output prints five lines, each showing the result of the respective 
binary operation in the following sequence:
Line 1: sum = <result>
Line 2: subtract = <result>
Line 3: multiply = <result>
Line 4: divide = <result>
Line 5: modulo = <result>

Example Output:
sum = 15
subtract = 5
multiply = 50
divide = 2
modulo = 0

==========================================================================
4. MULTIPLE DRY RUN EXAMPLES
==========================================================================
--------------------------------------------------------------------------
DRY RUN EXAMPLE A (Standard Positive Inputs)
--------------------------------------------------------------------------
Input: 20 4

Execution Steps:
1. sc.nextInt() reads 20 -> Assigned to variable 'a'.
2. sc.nextInt() reads 4  -> Assigned to variable 'b'.
3. Operations:
   - a + b = 20 + 4  = 24
   - a - b = 20 - 4  = 16
   - a * b = 20 * 4  = 80
   - a / b = 20 / 4  = 5
   - a % b = 20 % 4  = 0
4. Output matches the exact layout requested.

--------------------------------------------------------------------------
DRY RUN EXAMPLE B (Negative Inputs & Zero-handling)
--------------------------------------------------------------------------
Input: -15 6

Execution Steps:
1. sc.nextInt() reads -15 -> Assigned to variable 'a'.
2. sc.nextInt() reads 6   -> Assigned to variable 'b'.
3. Operations:
   - a + b = -15 + 6  = -9
   - a - b = -15 - 6  = -21
   - a * b = -15 * 6  = -90
   - a / b = -15 / 6  = -2 (Integer division truncates towards zero)
   - a % b = -15 % 6  = -3 (Sign of result matches the dividend 'a')

==========================================================================
*/

import java.util.Scanner;

public class binaryoperators {
    public static void main(String[] args) {
        // Instantiate a Scanner object to read data from standard input stream.
        // This makes the code dynamic and ready for competitive programming
        // environments rather than using static hardcoded test values.
        Scanner sc = new Scanner(System.in);

        // Read the first integer entered by the user or online judge.
        //
        // Example Input:
        // 10
        //
        // After execution:
        // a = 10
        //
        // This variable acts as the left operand (dividend/minuend).
        int a = sc.nextInt();

        // Read the second integer entered by the user or online judge.
        //
        // Example Input:
        // 5
        //
        // After execution:
        // b = 5
        //
        // This variable acts as the right operand (divisor/subtrahend).
        int b = sc.nextInt();

        // Compute and print the arithmetic sum of the two variables.
        // The parentheses ensure addition happens before string concatenation.
        //
        // Example Calculation:
        // 10 + 5 = 15
        System.out.println("sum = " + (a + b));

        // Compute and print the difference when b is subtracted from a.
        // Fixed the spelling from "substract" to "subtract" for clean production standards.
        //
        // Example Calculation:
        // 10 - 5 = 5
        System.out.println("subtract = " + (a - b));

        // Compute and print the product of the two variables.
        //
        // Example Calculation:
        // 10 * 5 = 50
        System.out.println("multiply = " + (a * b));

        // Check if the divisor variable is zero before attempting division.
        // This conditional block safeguards the application against a runtime
        // ArithmeticException error, which causes automatic failure on online judges.
        if (b != 0) {
            // Perform integer division. In Java, dividing two integers
            // discards the fractional part and evaluates to an integer quotient.
            //
            // Example Calculation:
            // 10 / 5 = 2
            System.out.println("divide = " + (a / b));

            // Perform the modulo operation to compute the remainder.
            //
            // Example Calculation:
            // 10 % 5 = 0
            System.out.println("modulo = " + (a % b));
        } else {
            // Handle the edge case gracefully if the divisor b is 0.
            // This prevents system crashes and outputs descriptive placeholders.
            System.out.println("divide = undefined (division by zero)");
            System.out.println("modulo = undefined (division by zero)");
        }

        // Close the scanner resource to release system memory handles.
        // This is a professional best practice to prevent resource leaks.
        sc.close();
    }
}

/*
==========================================================================
IMPORTANT NOTES FOR REVISION
============================
* ARITHMETICEXCEPTION HANDLING: Dividing any integer by 0 triggers an 
  ArithmeticException at runtime. Always wrap or validate the divisor using 
  an conditional check 'if (b != 0)' in coding assessments.
* SIGN OF MODULO OPERATION: In Java, the result of the modulo (%) operator 
  always takes the sign of the dividend (the first number 'a'), completely 
  ignoring the sign of the divisor ('b'). For example, (-5 % 2) is -1, 
  whereas (5 % -2) is 1.
* INTEGER OVERFLOW: When adding or multiplying large integers close to 
  Integer.MAX_VALUE (2,147,483,647), the result can overflow into negative 
  ranges. For production-grade safety, upgrade data types to 'long' if the 
  problem constraints exceed $10^9$.
* NO CHATTY PROMPTS RULE: Never print statements like "Enter input values: " 
  in TCS NQT or platform test screens. Automated text interpreters evaluate 
  exact character matches and will mark extra conversational prompts as wrong answers.

==========================================================================
COMMON BEGINNER MISTAKES
========================
1. Hardcoding Input Values: Keeping 'int a = 10;' inside competitive 
   programming submissions. This causes the solution to fail every single hidden 
   test case because the evaluation engine tests with varied inputs.
2. Crashing on Division by Zero: Failing to validate if the second integer is 
   zero before calculating 'a / b' and 'a % b', leading to an immediate runtime crash.
3. String Concatenation Confusion: Writing System.out.println("sum = " + a + b). 
   Without wrapping (a + b) in parentheses, Java performs sequential string 
   concatenation, leading to an incorrect output of "sum = 105" instead of "15".
4. Misspelling Terms: Retaining non-standard spelling variants like "substract" 
   instead of "subtract" which can break literal word checks in automated testing regex patterns.

==========================================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
================================================
"I have updated the initial program to be fully optimized, dynamic, and safe for 
production and competitive execution environment. Instead of hardcoding variables, 
I integrated the Scanner utility to read inputs dynamically from standard streams. 

To ensure the code runs flawlessly under all test criteria, I explicitly added a 
conditional guard clause that checks if the divisor is zero, neutralizing potential 
ArithmeticException errors before they happen. Furthermore, I grouped the arithmetic 
operations inside explicit operator precedence parentheses to avoid accidental string 
concatenation bugs. 

Finally, I resource-managed the data streams by closing the Scanner handle to avoid 
system memory leaks, completing a robust implementation of binary operators."

==========================================================================
TIME COMPLEXITY & SPACE COMPLEXITY
==================================
* TIME COMPLEXITY: $O(1)$ - System execution takes absolute constant time. 
  The binary arithmetic steps and standard I/O processing operations do not 
  scale or depend on any increasing collection, looping, or array size bounds.
* SPACE COMPLEXITY: $O(1)$ - The application consumes static, minimal memory space. 
  Only two primitive 'int' storage slots are reserved for variables 'a' and 'b', 
  guaranteeing optimal space execution.

==========================================================================
INTERVIEW QUICK ANSWER
======================
Q: What happens if you add two integers that exceed Integer.MAX_VALUE in Java?
A: Java does not throw an exception on integer overflow. Instead, it wraps around 
   silently using two's complement representation, turning a highly positive number 
   into a negative integer value.

Q: How does integer division work in Java compared to floating-point division?
A: Integer division (using 'int' variables) truncates all decimal/fractional parts 
   completely toward zero, returning an integer quotient. To retain fractional accuracy, 
   at least one operand must be explicitly cast to a 'double' or 'float'.

Q: What defines the sign of the result of a modulo (%) operation in Java?
A: The sign of the remainder is completely determined by the sign of the dividend 
   (the left-hand operand). The sign of the divisor has no effect on the result.
*/