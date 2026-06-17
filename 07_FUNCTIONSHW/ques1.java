import java.util.*;

/*
=========================================================
1. Problem Statement
=========================================================
Write a Java program to calculate the average of three numbers.

The program should:
1. Read three double values from the user.
2. Pass them to a user-defined method.
3. Calculate and return the average.
4. Display the average value.

=========================================================
2. Input Format
=========================================================
Three double values.

Example:
10
20
30

=========================================================
3. Output Format
=========================================================
The average value of the three numbers.

Example:
20.0

=========================================================
4. Dry Run Example(s)
=========================================================

Input:
10
20
30

Method Call:
average(10, 20, 30)

Calculation:
(10 + 20 + 30) / 3
= 60 / 3
= 20.0

Output:
The average value is 20.0

---------------------------------------------------------

Input:
5
7
9

Calculation:
(5 + 7 + 9) / 3
= 21 / 3
= 7.0

Output:
The average value is 7.0

=========================================================
5. Fully Commented Java Code
=========================================================
*/

public class ques1 {

    /*
     * User-defined method to calculate the average
     * of three double values.
     *
     * Parameters:
     * x -> First number
     * y -> Second number
     * z -> Third number
     *
     * Returns:
     * Average of x, y, and z
     */
    public static double average(double x, double y, double z) {
        return (x + y + z) / 3.0;
    }

    public static void main(String[] args) {

        // Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read three double values
        // No input prompts (TCS NQT style)
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        // Call average method and store result
        double result = average(x, y, z);

        // Print result
        System.out.println("The average value is " + result);

        // Close scanner
        sc.close();
    }
}

/*
=========================================================
6. Important Notes For Revision
=========================================================

1. static methods can be called directly from main()
   without creating an object.

2. double is used instead of int to preserve decimal
   precision during division.

3. Using 3.0 ensures floating-point division and avoids
   unintended integer division issues.

4. Method Reusability:
   The average() method can be reused anywhere in the
   program without rewriting the logic.

5. Scanner.nextDouble() is used to read decimal values
   from standard input.

=========================================================
7. How To Explain This Code In Front Of Interviewer
=========================================================

"This program calculates the average of three numbers
using a user-defined static method.

First, I read three double values using Scanner.
Then I pass those values to the average() method.

Inside the method, I add all three numbers and divide
their sum by 3.0 to obtain the average.

The calculated value is returned to the main method
and printed as output.

I used double data type so that decimal precision is
maintained throughout the calculation."

=========================================================
8. Time Complexity
=========================================================

O(1)

Reason:
Only a fixed number of arithmetic operations are
performed irrespective of input size.

=========================================================
9. Space Complexity
=========================================================

O(1)

Reason:
Only a few variables are used and no extra data
structure is created.

=========================================================
10. Interview Quick Answer
=========================================================

Q1. Why did you use double instead of int?
Answer:
double allows decimal values and preserves precision
during division, whereas int would truncate decimals.

---------------------------------------------------------

Q2. Why is the average() method declared static?
Answer:
Because main() is static, it can directly call another
static method without creating an object of the class.

---------------------------------------------------------

Q3. What happens if we write /3 instead of /3.0?
Answer:
Since x, y, and z are double values, both work correctly.
However, using 3.0 clearly indicates floating-point
division and improves code readability.

---------------------------------------------------------

Q4. Can method overloading be applied here?
Answer:
Yes. We can create multiple average() methods with
different parameter types such as int, float, or
different numbers of arguments.
=========================================================
*/