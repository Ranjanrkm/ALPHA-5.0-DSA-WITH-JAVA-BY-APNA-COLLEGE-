
import java.util.*; // This imports Scanner and other useful Java utility classes.

/*
    Largest of 3 Numbers Program

    This program reads three integers from the user
    and prints which number is the largest.

    The PDFs you shared explain:
    - using Scanner for integer input
    - using conditions like if-else for decision making
    - exact output formatting in Java
    - logical operators such as &&
    :contentReference[oaicite:0]{index=0} :contentReference[oaicite:1]{index=1} :contentReference[oaicite:2]{index=2}
*/

public class largestof3 { // Keep the class name same as your original code.

    public static void main(String args[]) { // Main method: Java starts execution here.

        Scanner sc = new Scanner(System.in); // Create Scanner object to take input.

        int a = sc.nextInt(); // Read first integer.
        int b = sc.nextInt(); // Read second integer.
        int c = sc.nextInt(); // Read third integer.

        // Check whether a is greater than or equal to both b and c.
        if (a >= b && a >= c) {
            System.out.println("largest is a"); // Print if a is largest.
        }

        // If first condition is false, check whether b is greater than or equal to c.
        else if (b >= c) {
            System.out.println("largest is b"); // Print if b is largest.
        }

        // If both above conditions are false, then c is largest.
        else {
            System.out.println("largest is c"); // Print if c is largest.
        }

        sc.close(); // Close Scanner after input work is done.
    }

}

/*
WHAT THIS CODE DOES

This program compares three numbers and prints which one is the largest.

The program:
1. Reads three integers from the user
2. Compares them using conditions
3. Prints the largest value name

LINE-BY-LINE EXPLANATION

import java.util.*;
This imports Scanner and other utility classes.

public class largestof3
This creates a class named largestof3.

public static void main(String args[])
This is the main method.
Java starts execution from here.

Scanner sc = new Scanner(System.in);
This creates a Scanner object for taking keyboard input.

int a = sc.nextInt();
This reads the first integer.

int b = sc.nextInt();
This reads the second integer.

int c = sc.nextInt();
This reads the third integer.

if (a >= b && a >= c)
This checks:
- Is a greater than or equal to b?
AND
- Is a greater than or equal to c?

If both are true, then a is the largest.

System.out.println("largest is a");
This prints that a is largest.

else if (b >= c)
If a is not largest, then check whether b is greater than or equal to c.

If true, b is largest.

System.out.println("largest is b");
This prints that b is largest.

else
If both previous conditions are false, then c must be the largest.

System.out.println("largest is c");
This prints that c is largest.

sc.close();
This closes the Scanner object.

EXPLANATION OF ALL CODING TERMS USED

1) import
This allows Java to use ready-made classes.

2) Scanner
Scanner is used for input.

3) class
A class is a container for Java code.

4) public
public means accessible from anywhere.

5) static
static means the method belongs to the class.

6) void
void means the method returns nothing.

7) main
main is the starting point of the program.

8) String args[]
This stores command-line arguments.

9) int
int is a data type for whole numbers.

10) variable
A variable stores data.
Here:
a, b, and c are variables.

11) if
if checks a condition.

12) else if
else if checks another condition when the previous one is false.

13) else
else runs when all previous conditions are false.

14) >=
This means greater than or equal to.

15) &&
This means logical AND.
Both conditions must be true.

16) condition
A condition becomes either true or false.

17) println
println prints output and moves to the next line.

18) close()
This closes the Scanner.

IMPORTANT JAVA CONCEPTS USED

1) Input handling
The PDFs say nextInt() is best for integer input.
This program uses nextInt() three times. 

2) Decision making
This program uses if - else if - else for choosing the largest number.

3) Logical operators
&& checks whether multiple conditions are true together.

4) Comparison operators
>= compares values.

5) Output formatting
The output is plain text using println.
The PDFs remind that exact output matters in coding tests. :contentReference[oaicite:4]{index=4}

INPUT AND OUTPUT ACCORDING TO THE PDFs AND THIS CODE

Input:
Three integer numbers

Example input:
10
20
15

Output:
largest is b

Another example:
30
10
5

Output:
largest is a

Another example:
2
4
9

Output:
largest is c

DRY RUN WITH EXAMPLE

Example input:
10
20
15

Step 1:
a = 10
b = 20
c = 15

Step 2:
Check:
a >= b && a >= c

10 >= 20 is false
So this condition becomes false.

Step 3:
Check:
b >= c

20 >= 15 is true

Step 4:
Print:
largest is b

Final output:
largest is b

COMMON BEGINNER MISTAKES

1) Using = instead of ==
= is assignment.
Comparison operators are:
>, <, >=, <=, ==

2) Forgetting &&
Both conditions must be checked together.

3) Missing braces {}
Braces help define code blocks clearly.

4) Confusing >= and >
>= means greater than OR equal to.

5) Forgetting semicolon
Every Java statement must end with a semicolon.

6) Not closing Scanner
Closing Scanner is a good habit.

EASY INTERVIEW ANSWER

This program reads three integers and uses if-else conditions to compare them.
It prints which variable contains the largest value.

ONE PRACTICE QUESTION

Write a Java program to read three numbers and print the smallest among them.
*/