/*
==========================================================================
1. PROBLEM STATEMENT
==========================================================================
Write a Java program to print an inverted right-angled half-pyramid pattern 
consisting of star ('*') characters. The program must eliminate hardcoded 
dimension values to be fully compatible with online grading systems (such as 
TCS NQT, HackerRank, and LeetCode). It should dynamically read an integer 'n' 
from the standard input stream representing the height of the pattern. The 
first row must print 'n' stars, and each subsequent row must decrement the 
star count by one until the last row prints exactly one star.

==========================================================================
2. INPUT FORMAT
==========================================================================
The input consists of a single line containing an integer 'n' representing 
the total number of rows (the height) of the inverted star pattern.

Example Input:
4

==========================================================================
3. OUTPUT FORMAT
==========================================================================
The output prints 'n' distinct lines. The first line contains 'n' characters, 
the second contains 'n-1' characters, continuing the continuous decrement 
until the final line contains exactly 1 character. No extraneous textual 
prompts are allowed.

Example Output:
****
***
**
*

==========================================================================
4. DRY RUN EXAMPLE(S) ONLY 2
==========================================================================
--------------------------------------------------------------------------
DRY RUN EXAMPLE 1 (Standard Dimension: n = 4)
--------------------------------------------------------------------------
Input: 4

Execution Steps:
Outer Loop (line) runs from 1 to 4:
- line = 1: Inner loop limit = 4 - 1 + 1 = 4. Iterates 4 times. Prints "****".
- line = 2: Inner loop limit = 4 - 2 + 1 = 3. Iterates 3 times. Prints "***".
- line = 3: Inner loop limit = 4 - 3 + 1 = 2. Iterates 2 times. Prints "**".
- line = 4: Inner loop limit = 4 - 4 + 1 = 1. Iterates 1 time.  Prints "*".
Each row completes with a newline instruction.

--------------------------------------------------------------------------
DRY RUN EXAMPLE 2 (Minimal Dimension: n = 2)
--------------------------------------------------------------------------
Input: 2

Execution Steps:
Outer Loop (line) runs from 1 to 2:
- line = 1: Inner loop limit = 2 - 1 + 1 = 2. Iterates 2 times. Prints "**".
- line = 2: Inner loop limit = 2 - 2 + 1 = 1. Iterates 1 time.  Prints "*".
Pattern terminates smoothly.

==========================================================================
5. FULLY COMMENTED JAVA CODE
==========================================================================
*/

import java.util.Scanner;

public class invertedstar {
    public static void main(String[] args) {
        // Instantiate a Scanner object to handle raw input streams dynamically.
        // This eliminates the static hardcoded value 'int n = 4;' and ensures 
        // full verification readiness against automated hidden unit test benches.
        Scanner sc = new Scanner(System.in);

        // Guard clause ensuring input availability to gracefully handle unexpected empty file cases.
        if (sc.hasNextInt()) {
            
            // Read the integer defining the target height and row configuration.
            int n = sc.nextInt();

            // Outer loop: Manages the row progression (vertical structural layout axis).
            // It tracks the index of the current row, initializing at 1 up to 'n'.
            for (int line = 1; line <= n; line++) {
                
                // Inner loop: Manages the column printing sequence (horizontal structure axis).
                // The mathematical constraint formulation (n - line + 1) calculates 
                // the inverse relationship between the row number and the element count:
                // For line = 1, elements = n - 1 + 1 = n
                // For line = n, elements = n - n + 1 = 1
                for (int star = 1; star <= (n - line + 1); star++) {
                    
                    // Output a single star character without introducing a newline sequence,
                    // keeping characters appended alongside each other within the same row.
                    System.out.print("*");
                }
                
                // Advance the execution cursor down to the immediate subsequent line 
                // once the current loop horizontal sequence has finished printing.
                System.out.println();
            }
        }

        // Close the input scanner resource stream to mitigate platform memory descriptor leaks.
        sc.close();
    }
}

/*
==========================================================================
6. IMPORTANT NOTES FOR REVISION
==========================================================================
* LINEAR DECREMENT IDENTIFICATION: The formula `n - line + 1` establishes a 
  linear arithmetic progression inside nested loop structures, translating an 
  increasing sequence counter into a decreasing loop terminal limit.

* TERMINAL OMISSION OF PROMPTS: Standard assessment engines analyze stream bytes 
  literally. Introducing conversational interaction text like `System.out.print("Enter N: ")` 
  causes complete verification failure due to output character mismatches.

* STREAM BUFFER SEPARATION: `System.out.print()` pushes string tokens directly into 
  the active console output cache line, whereas `System.out.println()` outputs an implicit 
  newline control character (`\n`), flushing the active system buffer line.
  
* COMPILER LOOP INVARIANTS: Optimization engines can track `n - line + 1` as a local 
  loop invariant for the specific scope of the inner block execution, minimizing 
  redundant arithmetic recalculations at runtime.

==========================================================================
7. HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
==========================================================================
"To construct this inverted half-pyramid pattern, I implemented a dynamic design using 
two nested loops, removing any hardcoded dimensions to accept inputs via standard stream parsing.

The primary outer loop dictates the vertical orientation, iterating from 1 to 'n' to establish 
the row layers. The key logic is embedded in the inner loop's boundary configuration. 
Instead of mapping columns to a fixed scalar variable, I utilized the linear mathematical expression 
`n - line + 1` as the upper loop bound constraint. Since 'line' increments on each outer pass, 
this calculation systematically decreases the total number of iterations executed by the inner loop.

Inside this inner column loop, `System.out.print("*")` ensures that elements are printed sequentially 
side-by-side. After finishing each line, an empty `System.out.println()` resets the console cursor to 
the next line, achieving an optimized linear-geometric scaling model."

==========================================================================
8. TIME COMPLEXITY
==========================================================================
* TIME COMPLEXITY: O(N^2)
  The total operation count mirrors the summation of the first 'N' natural numbers. 
  The inner loop executes exactly N times during the first pass, N-1 times during the second, 
  and down to 1 time on the final pass. This translates to the arithmetic sequence formula: 
  N + (N - 1) + (N - 2) + ... + 1 = [N * (N + 1)] / 2, which simplifies to O(N^2) asymptotically.

==========================================================================
9. SPACE COMPLEXITY
==========================================================================
* SPACE COMPLEXITY: O(1)
  The space footprint remains completely constant. The algorithm only provisions 
  a fixed number of primitive 32-bit integer stack registers ('n', 'line', 'star') 
  regardless of the input size, utilizing zero auxiliary heap memory allocations.

==========================================================================
10. INTERVIEW QUICK ANSWER
==========================================================================
Q: Can you write an alternative inner-loop structure that produces the same output without the formula 'n - line + 1'?
A: Yes. We can modify the loop direction of the outer tracker. By initializing the outer loop at 'n' and 
   decrementing it down to 1 (`for (int line = n; line >= 1; line--)`), the inner loop condition can be 
   simplified to explicitly depend directly on the outer index variable (`for (int star = 1; star <= line; star++)`).

Q: Why do pattern programming questions evaluate to O(N^2) time complexity?
A: They evaluate to quadratic O(N^2) time because the target pattern represents a 2-dimensional grid matrix. 
   To generate a grid layout containing dimensions proportional to rows and columns, a system must traverse 
   and calculate point coordinates along both structural axes, necessitating dependent nested loops.
*/