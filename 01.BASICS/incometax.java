import java.util.*; // This imports Scanner for input and other useful utility classes.

/*
    Income Tax Program

    This program reads the yearly income of a person,
    checks the tax slab, calculates tax, and prints the result.

    The PDFs you shared say:
    - when input is a single number, Scanner + nextInt() is the cleanest choice
    - output formatting must be exact
    - if decimals are needed, printf can be used
    - extra spaces and wrong data types can cause mistakes in output
    
*/

public class incometax { // Keep the class name same as your code.

    public static void main(String args[]) { // Main method: Java starts running from here.

        Scanner sc = new Scanner(System.in); // Create Scanner object to read input from keyboard.

        int income = sc.nextInt(); // Read the income value as an integer.

        int tax; // Create a variable to store the tax amount.

        if (income < 500000) { // If income is less than 5 lakh, tax is 0.
            tax = 0; // No tax for this slab.
        } else if (income >= 500000 && income < 1000000) { // If income is between 5 lakh and 10 lakh.
            tax = (int) (income * 0.2); // Calculate 20% tax and convert it to int.
        } else { // If income is 10 lakh or more.
            tax = (int) (income * 0.3); // Calculate 30% tax and convert it to int.
        }

        System.out.println("your tax is :" + tax); // Print the final tax amount.

        sc.close(); // Close the Scanner after input is done.
    }
}

/*
WHAT THIS CODE DOES

This program reads a person's income and calculates tax based on income slabs.

The tax rule used here is:
- income below 500000 -> tax = 0
- income from 500000 to 999999 -> tax = 20%
- income 1000000 or more -> tax = 30%

LINE-BY-LINE EXPLANATION

import java.util.*;
This line imports Scanner.
Scanner is used to take input from the user.

public class incometax
This creates the Java class.
The class name is kept exactly the same as your code.

public static void main(String args[])
This is the main method.
Java starts execution from here.

Scanner sc = new Scanner(System.in);
This creates a Scanner object.
It helps the program read input from the keyboard.

int income = sc.nextInt();
This reads one integer input from the user.
Here, the input is income.

int tax;
This creates a variable named tax.
It will store the calculated tax amount.

if (income < 500000)
This checks whether income is less than 500000.
If true, tax becomes 0.

tax = 0;
This stores 0 in the tax variable.

else if (income >= 500000 && income < 1000000)
This checks whether income is between 500000 and 999999.
The && symbol means both conditions must be true.

tax = (int) (income * 0.2);
This calculates 20% tax.
The (int) part removes the decimal part.

else
This runs when none of the above conditions are true.
That means income is 1000000 or more.

tax = (int) (income * 0.3);
This calculates 30% tax.
Again, (int) removes the decimal part.

System.out.println("your tax is :" + tax);
This prints the final tax amount.
The value of tax is added to the text.

sc.close();
This closes the Scanner object.
It is a good habit after reading input.

EXPLANATION OF ALL CODING TERMS USED

1) import
This tells Java to use a ready-made class or package.

2) Scanner
Scanner is used for input from the user.

3) class
A class is a container for Java code.

4) public
public means the code can be used from anywhere.

5) static
static means the method belongs to the class, not an object.

6) void
void means the method returns nothing.

7) main
main is the starting point of every Java program.

8) String args[]
This can store command-line arguments.

9) int
int is a data type for whole numbers.
Example: 100, 500000, 25

10) variable
A variable stores a value.
Here, income and tax are variables.

11) if
if checks a condition.

12) else if
else if checks another condition if the first one is false.

13) else
else runs when all previous conditions are false.

14) &&
This means AND.
Both conditions must be true.

15) >, <, >=
These are comparison operators.
They are used to compare values.

16) type casting
Type casting means converting one data type into another.
Here, (int) converts a decimal result into a whole number.

17) println
This prints output and moves to the next line.

18) close()
This closes the Scanner object.

IMPORTANT JAVA CONCEPTS USED

1) Input handling
The PDFs show that if input is a single number, nextInt() is the easiest and cleanest method. 

2) Decision making
The program uses if - else if - else to choose the correct tax slab.

3) Type casting
The PDFs explain type casting clearly.
Here, the result of income * 0.2 or income * 0.3 is cast into int. 

4) Output formatting
The PDFs remind that exact output matters.
If a problem asks for decimals, use printf.
This program prints an integer tax amount, so println is fine. 

INPUT AND OUTPUT

Input:
One integer value for income.

Example input:
750000

Output:
your tax is :150000

Another example input:
1200000

Output:
your tax is :360000

DRY RUN WITH EXAMPLE

Example input:
750000

Step 1:
income = 750000

Step 2:
Check income < 500000
This is false.

Step 3:
Check income >= 500000 && income < 1000000
This is true.

Step 4:
tax = 750000 * 0.2
tax = 150000

Step 5:
Print:
your tax is :150000

COMMON BEGINNER MISTAKES

1) Forgetting semicolons
Every Java statement must end with a semicolon.

2) Using = instead of ==
= means assignment, not comparison.

3) Confusing tax slabs
You must check the income range carefully.

4) Forgetting type casting
income * 0.2 gives a decimal result.
If you store it in int, use (int).

5) Extra spaces in output
In coding tests, even small spacing mistakes can matter.

6) Not closing Scanner
It is a good habit to close it after use.

EASY INTERVIEW ANSWER

This program calculates income tax using if - else if - else.
It reads income as input, checks the correct tax slab, calculates tax, and prints the result.

ONE PRACTICE QUESTION

Write a Java program that reads marks and prints:
- "pass" if marks are 40 or more
- "fail" if marks are below 40
*/
