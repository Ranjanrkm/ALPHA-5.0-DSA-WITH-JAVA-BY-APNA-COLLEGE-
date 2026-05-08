import java.util.*; // This imports Scanner and other useful utility classes.

/*
    Odd Even Program

    This program checks whether a number is even or odd.

    The PDFs you shared explain:
    - using Scanner for integer input
    - using if-else for decision making
    - exact output formatting
    - arithmetic operators like %
    :contentReference[oaicite:0]{index=0} :contentReference[oaicite:1]{index=1} :contentReference[oaicite:2]{index=2}
*/

public class oddeven { // Keep the class name same as your original code.

    public static void main(String args[]) { // Main method: Java starts execution here.

        Scanner sc = new Scanner(System.in); // Create Scanner object to read input.

        int number = sc.nextInt(); // Read one integer from the user.

        // Check whether the remainder after division by 2 is 0.
        if (number % 2 == 0) {

            System.out.println("even"); // Print even if the condition is true.

        } else {

            System.out.println("odd"); // Print odd if the condition is false.

        }

        sc.close(); // Close Scanner after use.
    }

}

/*
WHAT THIS CODE DOES

This program checks whether a number is:
- even
or
- odd

If the number is divisible by 2, it is even.
Otherwise, it is odd.

LINE-BY-LINE EXPLANATION

import java.util.*;
This imports Scanner and other utility classes.

public class oddeven
This creates a class named oddeven.

public static void main(String args[])
This is the main method.
Java starts execution from here.

Scanner sc = new Scanner(System.in);
This creates a Scanner object.
Scanner is used for input.

int number = sc.nextInt();
This reads one integer from the user.

if (number % 2 == 0)
This checks whether the number is divisible by 2.

% is called the modulus operator.
It gives the remainder after division.

If the remainder is 0, the number is even.

System.out.println("even");
This prints:
even

else
This runs when the if condition is false.

System.out.println("odd");
This prints:
odd

sc.close();
This closes the Scanner object.

EXPLANATION OF ALL CODING TERMS USED

1) import
This allows Java to use ready-made classes.

2) Scanner
Scanner is used for taking input.

3) class
A class is a container for Java code.

4) public
public means accessible from anywhere.

5) static
static means the method belongs to the class itself.

6) void
void means the method returns nothing.

7) main
main is the starting point of the Java program.

8) String args[]
This stores command-line arguments.

9) int
int is a data type for whole numbers.

10) variable
A variable stores data.
Here, number is a variable.

11) if
if checks a condition.

12) else
else runs when the if condition is false.

13) %
This is the modulus operator.
It gives the remainder.

Example:
5 % 2 = 1
6 % 2 = 0

14) ==
This checks equality.

15) condition
A condition becomes either true or false.

16) println
println prints output and moves to the next line.

17) close()
This closes the Scanner.

IMPORTANT JAVA CONCEPTS USED

1) Input handling
The PDFs show that nextInt() is the standard method for integer input. 

2) Decision making
This program uses if-else for checking conditions.

3) Arithmetic operator
The modulus operator % is used to find the remainder.

4) Comparison operator
== checks whether two values are equal.

5) Output formatting
The PDFs explain that exact output matters in coding tests. :contentReference[oaicite:4]{index=4}

INPUT AND OUTPUT ACCORDING TO THE PDFs AND THIS CODE

Input:
One integer number

Example input:
8

Output:
even

Another example:
7

Output:
odd

DRY RUN WITH EXAMPLE

Example input:
7

Step 1:
number = 7

Step 2:
Check:
7 % 2 == 0

7 % 2 = 1

Now:
1 == 0

This is false.

Step 3:
Run else block.

Print:
odd

Final output:
odd

COMMON BEGINNER MISTAKES

1) Using = instead of ==
= means assignment.
== means comparison.

2) Forgetting %
The modulus operator is needed for remainder checking.

3) Writing number / 2 instead of number % 2
/ gives division result.
% gives remainder.

4) Forgetting braces {}
Braces help define blocks clearly.

5) Missing semicolons
Every Java statement must end with a semicolon.

6) Not closing Scanner
Closing Scanner is a good habit.

EASY INTERVIEW ANSWER

This program checks whether a number is even or odd using the modulus operator.
If the remainder after division by 2 is 0, the number is even.
Otherwise, it is odd.

ONE PRACTICE QUESTION

Write a Java program that checks whether a number is divisible by both 3 and 5.
*/