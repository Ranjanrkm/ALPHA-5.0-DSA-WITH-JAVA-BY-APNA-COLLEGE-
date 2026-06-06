
/*
==========================================================================
1. PROBLEM STATEMENT
==========================================================================
Write a Java program to demonstrate and analyze the exact functional behavior 
of unary prefix and postfix decrement operators (`--a` and `a--`). 
To ensure compatibility with competitive coding environments (such as TCS NQT, 
HackerRank, and LeetCode), the code must eliminate hardcoded inputs and 
dynamically parse values using standard input streams. The program reads an 
initial integer `a`, performs the unary operations, and tracks how the value 
of the operand changes before and after expression evaluation.

==========================================================================
2. INPUT FORMAT
==========================================================================
The input consists of a single integer representing the initial value of variable `a`.

Example Input:
10

==========================================================================
3. OUTPUT FORMAT
==========================================================================
The program prints four distinct lines demonstrating the outcomes of both 
postfix and prefix execution flows:
Line 1: Postfix Result - Current Value of 'a'
Line 2: Postfix Result - Captured Value of 'b' (assigned via a--)
Line 3: Prefix Result  - Current Value of 'a' (after resetting and applying --a)
Line 4: Prefix Result  - Captured Value of 'c' (assigned via --a)

Example Output:
9
10
9
9

==========================================================================
4. MULTIPLE DRY RUN EXAMPLES
==========================================================================
--------------------------------------------------------------------------
DRY RUN EXAMPLE A (Using Input Value 10)
--------------------------------------------------------------------------
Input: 10

Execution Steps:
1. sc.nextInt() reads 10 -> assigned to variable `originalA`.
2. Postfix Routine:
   - `a` is initialized to 10.
   - `b = a--;` -> Post-decrement rule: Use the current value first, then decrement.
   - Hence, `b` receives the value 10.
   - After assignment, `a` decrements from 10 to 9.
   - Prints `a` (9) followed by `b` (10).
3. Prefix Routine:
   - `a` is reset back to 10.
   - `c = --a;` -> Pre-decrement rule: Decrement the value first, then use it.
   - Hence, `a` decrements from 10 to 9 immediately.
   - `c` receives the updated value 9.
   - Prints `a` (9) followed by `c` (9).

--------------------------------------------------------------------------
DRY RUN EXAMPLE B (Using Input Value -5)
--------------------------------------------------------------------------
Input: -5

Execution Steps:
1. `a` starts at -5.
2. Postfix Routine:
   - `b = a--;` -> `b` captures -5 first.
   - `a` is decremented by 1: -5 - 1 = -6.
   - Prints `a` (-6) and `b` (-5).
3. Prefix Routine:
   - `a` is reset to -5.
   - `c = --a;` -> `a` is decremented first: -5 - 1 = -6.
   - `c` captures the updated value: -6.
   - Prints `a` (-6) and `c` (-6).

==========================================================================
*/

import java.util.Scanner;

public class prepost {
    public static void main(String[] args) {
        // Instantiate a Scanner object to capture standard input stream.
        // This makes the solution dynamic and production-grade for coding assessments.
        Scanner sc = new Scanner(System.in);

        // Read the initial baseline integer entered by the user.
        //
        // Example Input:
        // 10
        //
        // After execution:
        // originalA = 10
        int originalA = sc.nextInt();

        // ==========================================
        // SCENARIO 1: POST-DECREMENT OPERATION (a--)
        // ==========================================
        
        // Initialize working variable 'a' with the original input value.
        int a = originalA;

        // Apply the post-decrement operator.
        // 
        // Operational Rule: "Use the current value now, decrement it later."
        // 1. The current value of 'a' (which is 10) is assigned to 'b'.
        // 2. Variable 'a' is then decremented silently in memory from 10 to 9.
        //
        // After execution:
        // b = 10
        // a = 9
        int b = a--;

        // Print the mutated value of 'a' after the post-decrement took place.
        System.out.println(a);

        // Print the value captured by 'b' during the post-decrement step.
        System.out.println(b);

        // ==========================================
        // SCENARIO 2: PREFIX DECREMENT OPERATION (--a)
        // ==========================================
        
        // Reset working variable 'a' back to the initial baseline value to ensure 
        // an accurate standalone comparison of the prefix behavior.
        a = originalA;

        // Apply the prefix decrement operator.
        // 
        // Operational Rule: "Decrement the value first, use it later."
        // 1. Variable 'a' is immediately decremented in memory from 10 to 9.
        // 2. The newly calculated value of 'a' (which is 9) is assigned to 'c'.
        //
        // After execution:
        // a = 9
        // c = 9
        int c = --a;

        // Print the mutated value of 'a' after the prefix operation.
        System.out.println(a);

        // Print the value captured by 'c' during the prefix assignment step.
        System.out.println(c);

        // Close the scanner handle to prevent resource leaks.
        sc.close();
    }
}

/*
==========================================================================
IMPORTANT NOTES FOR REVISION
============================
* OPERATOR PRECEDENCE & SIDE EFFECTS: Unary postfix operators (`a++`, `a--`) 
  hold higher precedence than prefix operators (`++a`, `--a`) and binary 
  arithmetic operators, but their state mutations apply *after* the value 
  at that position is loaded into the expression evaluation stack.
* THE COMPILER EVALUATION STEPS: For `b = a--`, the compiler performs 
  the following atomic actions:
    1. Load current value of `a`.
    2. Decrement `a`.
    3. Return the *loaded* value to be assigned to `b`.
* NO CHATTY PORTAL INTERFACES: Avoid outputting prompts like "Enter value for a:". 
  Online grading systems match literal output strings. Extraneous text causes 
  unconditional runtime failures.
* THREAD SAFETY CAVEAT: Unary modification steps (`a--`) are not thread-safe 
  atomic operations. They consist of a read, a modify, and a write step behind 
  the scenes.

==========================================================================
COMMON BEGINNER MISTAKES
========================
1. Double Decrement Confusion in Complex Expressions: Writing equations like 
   `int result = a-- - --a;` and assuming `a` remains unchanged. Each operator 
   mutates the original variable state chronologically.
2. Assuming Prefix/Postfix Changes Assignment Speed: Believing that postfix operators 
   delay assignment until the next line of code. The variable is decremented inside 
   the exact same expression; it's simply the evaluation value that changes.
3. Hardcoding Test Inputs: Keeping lines like `int a = 10;` inside production or 
   assessment environments, causing hidden test evaluation profiles to fail completely.
4. Applying Unary Operators onto Constants: Attempting to write code like `int b = 10--;`. 
   Unary operators require a variable memory location reference (lvalue); compiling 
   constants causes severe syntax compile errors.

==========================================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
================================================
"I have updated the program to comprehensively showcase both postfix and prefix unary 
decrement behaviors while transitioning it into a fully dynamic and robust script. 

The fundamental difference lies in the order of execution inside the JVM expression stack. 
With the postfix decrement operator `a--`, the runtime system loads the current value of `a` 
to evaluate the current expression first, and then decrements the storage location of `a` 
as a side-effect. This is why variable `b` captures the initial value. 

Conversely, with the prefix operator `--a`, the JVM decrements the variable value directly 
in storage before loading it onto the evaluation stack, causing both the variable and the 
assignment target to receive the newly updated, decremented value. 

To ensure complete test-bench safety, I refactored the design to accept input streams 
dynamically using the Scanner utility and eliminated interactive chatty console outputs."

==========================================================================
TIME COMPLEXITY & SPACE COMPLEXITY
==================================
* TIME COMPLEXITY: $O(1)$ - The execution scale is completely constant. Memory tracking, 
  unary modifications, and standard output streaming do not scale with input sizes.
* SPACE COMPLEXITY: $O(1)$ - The program reserves basic, fixed primitive stack memory slots 
  for variables `originalA`, `a`, `b`, and `c`, demanding no dynamic heap allocations.

==========================================================================
INTERVIEW QUICK ANSWER
======================
Q: What is the exact difference between prefix and postfix operators?
A: Prefix operators (`--a`, `++a`) modify the variable's value first and then return 
   the updated result. Postfix operators (`a--`, `a++`) evaluate the current expression 
   using the variable's current value first, and then apply the modification to the variable.

Q: Is the statement `int x = 5++;` valid in Java?
A: No, it causes a compile-time error. Unary increment/decrement operators require an 
   explicit variable reference (lvalue) to apply and store modifications. They cannot 
   be directly appended to absolute literal values.

Q: Are unary operations like `a++` atomic in multi-threaded Java applications?
A: No. `a++` is a compound operation consisting of three distinct processing steps: 
   reading the value, adding 1 to it, and writing the new value back to memory. 
   Without external synchronization or `AtomicInteger` wrappers, it leads to race conditions.
*/