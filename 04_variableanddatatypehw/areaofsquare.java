import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to find the area of a square.

Formula:
Area = Side × Side

The program should read the side length of the square
and print its area.

=========================================================
INPUT FORMAT
=========================================================
A single integer representing the side length of the square.

Example:
5

=========================================================
OUTPUT FORMAT
=========================================================
Print the area of the square.

Example:
25

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:
5

Step 1:
side = 5

Step 2:
area = side * side
area = 5 * 5
area = 25

Output:
25

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:
10

Step 1:
side = 10

Step 2:
area = 10 * 10
area = 100

Output:
100

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

// Import Scanner class for taking input from the user.
import java.util.*;

public class areaofsquare {

    public static void main(String args[]) {

        // Create Scanner object.
        //
        // Scanner is used to read input from the keyboard.
        Scanner sc = new Scanner(System.in);

        // Read the side length of the square.
        //
        // Example Input:
        // 5
        //
        // After execution:
        // side = 5
        //
        // This variable stores the length of one side
        // of the square.
        int side = sc.nextInt();

        // Calculate the area of the square.
        //
        // Formula:
        // Area = Side × Side
        //
        // Example:
        // side = 5
        //
        // area = 5 × 5
        // area = 25
        int area = side * side;

        // Print the final area.
        //
        // According to TCS NQT and Online Judge standards,
        // avoid unnecessary messages such as:
        // "Enter the side"
        // "Area is"
        //
        // Print only the required output.
        System.out.println(area);

        // Close Scanner object.
        //
        // Good programming practice.
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Formula of square area:
   Area = Side × Side

2. All sides of a square are equal.

3. If side = 0
   Area = 0

4. For very large values,
   use long instead of int.

5. Competitive Programming Tip:
   Print only the required output.
   Extra text may fail hidden test cases.

6. TCS NQT Rule:
   Never write:
   System.out.println("Enter Side:");

   unless explicitly asked.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Writing:
   area = side + side;

   Instead of:
   area = side * side;

2. Printing unnecessary text:
   "Area of square is :"

   This may fail online judges.

3. Forgetting to take input.

4. Using wrong formula.

5. Not closing Scanner object.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program calculates the area of a square.

First, I take the side length as input using Scanner.

Then I apply the formula:

Area = Side × Side

The calculated area is stored in a variable named area.

Finally, I print the result.

The solution is straightforward because only one
mathematical operation is required."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:
Only one multiplication operation is performed.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:
Only two integer variables are used:
side and area.

No extra data structure is required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is the formula for area of a square?

Answer:
Area = Side × Side

---------------------------------------------------------

Q2. Why do we multiply side by side?

Answer:
Because the area of a square is the product
of its length and breadth, and both are equal.

---------------------------------------------------------

Q3. What is the time complexity?

Answer:
O(1), because only one multiplication is performed.

---------------------------------------------------------

Q4. What is the space complexity?

Answer:
O(1), because only a few variables are used.

---------------------------------------------------------

Q5. If side = 12, what is the area?

Answer:
12 × 12 = 144

=========================================================
END OF FILE
=========================================================
*/