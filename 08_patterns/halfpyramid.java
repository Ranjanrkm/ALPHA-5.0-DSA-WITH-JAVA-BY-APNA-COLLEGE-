/*
==========================================================================
1. PROBLEM STATEMENT
==========================================================================
Write a Java program to print a left-aligned half-pyramid pattern consisting 
of numerical digits. The program must eliminate hardcoded dimension values 
and dynamically accept an integer 'n' from the standard input stream. 
For each row 'i' from 1 to 'n', the program should print a continuous sequence 
of numbers starting from 1 up to 'i'.

==========================================================================
2. INPUT FORMAT
==========================================================================
The input consists of a single integer 'n' representing the total number 
of rows (the height) of the half-pyramid.

Example Input:
4

==========================================================================
3. OUTPUT FORMAT
==========================================================================
The output prints 'n' distinct lines. The first line contains the number 1. 
The second line contains 12. Each subsequent line continues this numerical 
pattern, terminating exactly after printing 'n' rows without any trailing 
leading spaces, adhering to strict competitive programming text-matching rules.

Example Output:
1
12
123
1234

==========================================================================
4. DRY RUN EXAMPLE(S) ONLY 2
==========================================================================
--------------------------------------------------------------------------
DRY RUN EXAMPLE 1 (Standard Bound: n = 4)
--------------------------------------------------------------------------
Input: 4

Execution Steps:
Outer Loop (line):
- line = 1: Inner loop runs from 1 to 1. Prints '1'. Moves to next line.
- line = 2: Inner loop runs from 1 to 2. Prints '1', '2'. Moves to next line.
- line = 3: Inner loop runs from 1 to 3. Prints '1', '2', '3'. Moves to next line.
- line = 4: Inner loop runs from 1 to 4. Prints '1', '2', '3', '4'. Moves to next line.
Program Terminates.

Output:
1
12
123
1234

--------------------------------------------------------------------------
DRY RUN EXAMPLE 2 (Smaller Bound: n = 3)
--------------------------------------------------------------------------
Input: 3

Execution Steps:
Outer Loop (line):
- line = 1: Inner loop runs from 1 to 1. Prints '1'.
- line = 2: Inner loop runs from 1 to 2. Prints '12'.
- line = 3: Inner loop runs from 1 to 3. Prints '123'.
Program Terminates.

Output:
1
12
123

==========================================================================
5. FULLY COMMENTED JAVA CODE
==========================================================================
*/

import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {
        // Initialize the Scanner object to dynamically read data from the 
        // standard input stream. This replaces the hardcoded 'n = 4' logic,
        // making the program compatible with hidden test cases on online judges.
        Scanner sc = new Scanner(System.in);

        // Check if input exists to avoid runtime exceptions on empty files
        if (sc.hasNextInt()) {
            // Read the integer representing the total number of rows.
            //
            // Example Input:
            // 4
            //
            // After execution:
            // n = 4
            int n = sc.nextInt();

            // The outer loop governs the vertical axis (rows) of the pattern.
            // It starts at line = 1 and increments until it reaches the target 'n'.
            for (int line = 1; line <= n; line++) {
                
                // The inner loop governs the horizontal axis (columns) of the pattern.
                // For any given row 'line', the loop iterates from 1 up to 'line'.
                for (int number = 1; number <= line; number++) {
                    
                    // Print the current numerical digit dynamically.
                    // Using print() instead of println() ensures the numbers 
                    // stay attached horizontally on the same console line.
                    System.out.print(number);
                }
                
                // Once the inner sequence for the current row is fully printed,
                // trigger a carriage return to shift the console cursor down
                // to the next line for the next iteration of the outer loop.
                System.out.println();
            }
        }
        
        // Close the Scanner resource to properly release standard input locks
        // and prevent application memory leaks.
        sc.close();
    }
}

/*
==========================================================================
6. IMPORTANT NOTES FOR REVISION
==========================================================================
* NESTED LOOP DEPENDENCY: Pattern programming heavily relies on dependent 
  nested loops. The termination condition of the inner loop (number <= line) 
  is dynamically bound to the current state of the outer loop variable (line).
* PRINT VS PRINTLN DIFFERENCE: System.out.print() outputs data into the standard 
  stream while maintaining the cursor on the exact same line, whereas 
  System.out.println() outputs the data and immediately appends a newline ('\n').
* DYNAMIC BOUNDARIES: Never hardcode constraints like 'line <= 4' in TCS NQT 
  evaluations. Test cases inject randomized limits (e.g., n=15, n=100); loops 
  must strictly iterate against the parsed variable 'n'.
* NO CONSOLE CHATTER: Avoid statements like System.out.print("Enter value: "). 
  Automated testing engines evaluate stdout literally and will fail your test 
  case due to mismatched text formatting.

==========================================================================
7. HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
==========================================================================
"To build this numerical half-pyramid, I implemented a nested loop structure. 
I removed the hardcoded values to accept the row height dynamically via the Scanner. 

The primary outer loop manages the Y-axis or the total number of vertical rows, 
iterating exactly 'n' times. Inside it, I placed an inner loop to manage the X-axis, 
or the columns. The critical logic here is that the inner loop's termination condition 
is directly bound to the outer loop's current iteration value. Therefore, on row 1, 
it prints 1 number; on row 4, it prints 4 numbers sequentially. 

Inside the inner loop, I utilize System.out.print() to print the digits side-by-side. 
Once the inner loop finishes populating the current row, the outer loop executes an 
empty System.out.println() command to drop the console cursor down to the next line 
before starting the next iteration."

==========================================================================
8. TIME COMPLEXITY
==========================================================================
* TIME COMPLEXITY: O(N^2)
  The time complexity maps directly to the sum of an arithmetic progression. 
  The inner loop runs 1 time for the first row, 2 times for the second row, 
  and N times for the Nth row. The total number of iterations is 
  1 + 2 + 3 + ... + N = (N * (N + 1)) / 2, which resolves asymptotically to O(N^2).

==========================================================================
9. SPACE COMPLEXITY
==========================================================================
* SPACE COMPLEXITY: O(1)
  The algorithm only allocates basic primitive tracking variables ('n', 'line', 'number') 
  within the stack frame. No dynamic heap memory or auxiliary data structures 
  are required, resulting in a constant O(1) auxiliary space footprint.

==========================================================================
10. INTERVIEW QUICK ANSWER
==========================================================================
Q: How would you modify this code to print an inverted half-pyramid (4321 on top)?
A: I would reverse the iteration structure of the outer loop. Instead of counting up, 
   I would configure the outer loop to start at `n` and decrement down to 1 
   (`for(int line = n; line >= 1; line--)`), leaving the inner loop completely unchanged.

Q: Why must you use System.out.print() inside the inner loop instead of System.out.println()?
A: System.out.println() automatically appends a newline character after every single output. 
   If used inside the inner loop, every digit would be printed vertically on a new line, 
   destroying the horizontal row structure of the pyramid.
*/