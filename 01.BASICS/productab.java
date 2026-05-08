import java.util.*; // This imports Scanner and other useful Java utility classes.

/*
    Product of Two Numbers Program

    This program reads two integers from the user,
    multiplies them, and prints the product.

    The PDFs you shared explain:
    - using Scanner for integer input
    - using arithmetic operators like *
    - exact output formatting in Java
    - beginner-friendly input/output handling
    :contentReference[oaicite:0]{index=0} :contentReference[oaicite:1]{index=1} :contentReference[oaicite:2]{index=2}
*/

public class productab { // Keep the class name same as your original code.

    public static void main(String args[]) { // Main method: Java starts execution here.

        Scanner sc = new Scanner(System.in); // Create Scanner object to take input.

        int a = sc.nextInt(); // Read first integer from the user.

        int b = sc.nextInt(); // Read second integer from the user.

        int product = a * b; // Multiply a and b and store the result in product.

        System.out.println(product); // Print the final product.

        sc.close(); // Close Scanner after use.
    }

}

/*
WHAT THIS CODE DOES

This program multiplies two numbers and prints the result.

The program:
1. Reads two integers
2. Multiplies them
3. Prints the product

LINE-BY-LINE EXPLANATION

import java.util.*;
This imports Scanner and other utility classes.

public class productab
This creates a class named productab.

public static void main(String args[])
This is the main method.
Java starts execution from here.

Scanner sc = new Scanner(System.in);
This creates a Scanner object.
Scanner is used to read input from the keyboard.

int a = sc.nextInt();
This reads the first integer.

int b = sc.nextInt();
This reads the second integer.

int product = a * b;
This multiplies a and b using the * operator.
The result is stored in the variable product.

System.out.println(product);
This prints the final product on the screen.

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
Here:
a, b, and product are variables.

11) *
This is the multiplication operator.

12) assignment operator =
This stores a value into a variable.

13) println
println prints output and moves to the next line.

14) close()
This closes the Scanner.

IMPORTANT JAVA CONCEPTS USED

1) Input handling
The PDFs show that nextInt() is commonly used for integer input. 

2) Arithmetic operators
This program uses the multiplication operator (*).

3) Variables
Variables store input values and calculation results.

4) Output formatting
The program prints the answer using println.
The PDFs explain that exact output matters in coding problems. :contentReference[oaicite:4]{index=4}

INPUT AND OUTPUT ACCORDING TO THE PDFs AND THIS CODE

Input:
Two integer numbers

Example input:
5
4

Output:
20

Another example:
7
3

Output:
21

DRY RUN WITH EXAMPLE

Example input:
5
4

Step 1:
a = 5

Step 2:
b = 4

Step 3:
product = a * b
product = 5 * 4
product = 20

Step 4:
Print:
20

Final output:
20

COMMON BEGINNER MISTAKES

1) Forgetting to take both inputs
Two numbers are needed for multiplication.

2) Using + instead of *
+ adds numbers.
* multiplies numbers.

3) Missing semicolons
Every Java statement must end with a semicolon.

4) Using nextFloat() for integer input
Since the variables are int, nextInt() is correct here.

5) Forgetting to store the result
Always store the multiplication result before printing if needed later.

6) Not closing Scanner
Closing Scanner is a good habit.

EASY INTERVIEW ANSWER

This program reads two integers using Scanner, multiplies them using the * operator, stores the result in a variable, and prints the product.

ONE PRACTICE QUESTION

Write a Java program that reads two integers and prints:
- their sum
- their difference
- their product
*/
