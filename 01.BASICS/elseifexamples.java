import java.util.*; // This imports Scanner and other useful Java classes.

/*
    This program teaches the if - else if - else ladder in Java.

    The PDFs you shared focus on beginner-friendly Java input/output,
    correct reading of input with Scanner, and clear output formatting.
    This example uses simple integer input and prints a result based on age.
*/

public class elseifexamples { // Keeping the class name same as your code.

    public static void main(String args[]) { // Main method: Java starts execution here.

        Scanner sc = new Scanner(System.in); // Create Scanner object to read input from keyboard.

        int age = sc.nextInt(); // Read the age entered by the user.

        if (age >= 18) { // If age is 18 or more, this block runs.
            System.out.println("adult : drive, vote"); // Print adult message.
        } else if (age >= 13 && age < 18) { // If age is between 13 and 17, this block runs.
            System.out.println("teenager"); // Print teenager message.
        } else { // If none of the above conditions are true, this block runs.
            System.out.println("child"); // Print child message.
        }

        sc.close(); // Close Scanner after input is done.
    }
}

/*
WHAT THIS CODE DOES

This program checks a person's age and prints:
- adult if age is 18 or above
- teenager if age is between 13 and 17
- child if age is below 13

It is a simple example of decision making in Java.

LINE-BY-LINE EXPLANATION

import java.util.*;
This imports the Scanner class.
Scanner helps us take input from the user.

public class elseifexamples
This creates the class.
In Java, all code stays inside a class.

public static void main(String args[])
This is the starting point of the program.
Java begins running from here.

Scanner sc = new Scanner(System.in);
This creates a Scanner object.
It reads input from the keyboard.

int age = sc.nextInt();
This reads one integer value from the user.
Here, the integer is the age.

if (age >= 18)
This checks whether age is 18 or more.
If yes, the first block runs.

System.out.println("adult : drive, vote");
This prints the adult message.
I corrected the word "dive" to "drive" because that is the correct meaning.

else if (age >= 13 && age < 18)
This checks whether age is from 13 to 17.
The && symbol means both conditions must be true.

System.out.println("teenager");
This prints the teenager message.

else
This runs only when none of the above conditions are true.
So this means age is less than 13.

System.out.println("child");
This prints the child message.

sc.close();
This closes the Scanner object.
It is a good habit after taking input.

EXPLANATION OF ALL CODING TERMS USED

1) import
This brings ready-made Java classes into the program.

2) Scanner
Scanner is used to read input from the user.

3) class
A class is a container for Java code.

4) public
public means the code can be accessed from anywhere.

5) static
static means the method belongs to the class, not an object.

6) void
void means the method returns nothing.

7) main
main is the starting point of the program.

8) String args[]
This is used for command-line arguments.

9) int
int is a data type for whole numbers.

10) if
if checks a condition.

11) else if
else if checks another condition if the first one is false.

12) else
else runs when all previous conditions are false.

13) condition
A condition is a question that gives true or false.

14) >=
This means greater than or equal to.

15) <
This means less than.

16) &&
This means AND.
Both conditions must be true.

17) println
This prints output and moves to the next line.

18) close()
This closes the Scanner.

IMPORTANT JAVA CONCEPTS USED

1) Decision making
This program uses if - else if - else.
It helps Java choose one correct path.

2) Relational operators
These are used for comparison:
>= and <

3) Logical operator
&& is a logical AND operator.

4) Input handling
The program reads age using Scanner and nextInt().
The PDFs say this is a simple and common way to take integer input.

5) Output formatting
The output is plain text.
The PDFs remind that exact output matters in coding problems.

INPUT AND OUTPUT ACCORDING TO THE PDFs AND THIS CODE

Input:
One integer value for age

Example input:
16

Output:
teenager

Another example:
20

Output:
adult : drive, vote

Another example:
10

Output:
child

The PDFs say that when input is a single number, nextInt() is a clean and safe choice.
That is exactly what this program uses.

DRY RUN WITH EXAMPLE

Example input:
16

Step 1:
age = 16

Step 2:
Check if age >= 18
16 >= 18 is false

Step 3:
Check else if age >= 13 && age < 18
16 >= 13 is true
16 < 18 is true
So this condition is true

Step 4:
Print teenager

Final output:
teenager

COMMON BEGINNER MISTAKES

1) Using = instead of ==
= is for assignment.
== is for comparison.
Here we use >= and < for comparison.

2) Forgetting && in else if
Both conditions must be checked together.

3) Missing braces {}
Braces help show which lines belong to each block.

4) Using nextLine() instead of nextInt() here
Since age is a number, nextInt() is the correct choice.

5) Typing the wrong word in output
Even a small typo can cause wrong output in coding tests.

6) Not closing Scanner
It is better to close it after use.

EASY INTERVIEW ANSWER

This program uses if - else if - else to check age and print whether the person is a child, teenager, or adult.
It demonstrates decision making in Java.

ONE PRACTICE QUESTION

Write a Java program that reads a number and prints:
- "positive" if the number is greater than 0
- "zero" if the number is 0
- "negative" if the number is less than 0
*/
