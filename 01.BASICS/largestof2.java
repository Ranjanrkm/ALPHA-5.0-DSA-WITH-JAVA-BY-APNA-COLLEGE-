public class largestof2 { // This is the class name. It is kept the same as your code.

    public static void main(String args[]) { // Main method: Java starts execution from here.

        int A = 10; // Create integer variable A and store value 10.
        int B = 5;  // Create integer variable B and store value 5.

        if (A > B) { // Check whether A is greater than B.
            System.out.println("A is largest of 2"); // This runs if the condition is true.
        }

        else { // This runs when the if condition is false.
            System.out.println("B is largest of 2"); // Print that B is larger.
        }

    }

}

/*
WHAT THIS CODE DOES

This program compares two numbers and prints which number is larger.

Here:
A = 10
B = 5

Since 10 is greater than 5, the output becomes:
A is largest of 2

LINE-BY-LINE EXPLANATION

public class largestof2
This creates a class named largestof2.
The class name is kept exactly the same as your code.

public static void main(String args[])
This is the main method.
Java starts running the program from here.

int A = 10;
This creates an integer variable named A and stores 10.

int B = 5;
This creates another integer variable named B and stores 5.

if (A > B)
This checks whether A is greater than B.

The > symbol means "greater than".

If the condition becomes true, the code inside the if block runs.

System.out.println("A is largest of 2");
This prints:
A is largest of 2

else
else runs when the if condition is false.

System.out.println("B is largest of 2");
This prints:
B is largest of 2

EXPLANATION OF ALL CODING TERMS USED

1) class
A class is a container that holds Java code.

2) public
public means the class or method can be accessed from anywhere.

3) static
static means the method belongs to the class itself.

4) void
void means the method does not return any value.

5) main
main is the starting point of the Java program.

6) String args[]
This is used for command-line arguments.

7) int
int is a data type for whole numbers.

8) variable
A variable stores data.
Here, A and B are variables.

9) if
if is used to check a condition.

10) else
else runs when the if condition is false.

11) condition
A condition is something that becomes true or false.

12) >
This is called the greater than operator.

13) println
println prints output and moves to the next line.

IMPORTANT JAVA CONCEPTS USED

1) Decision making
This program uses if-else to make decisions.

2) Comparison operator
The > operator compares two values.

3) Boolean result
The condition A > B becomes either true or false.

4) Output
The result is shown using System.out.println().

INPUT AND OUTPUT

Input:
No user input is needed in this program.

Values already given:
A = 10
B = 5

Output:
A is largest of 2

DRY RUN WITH EXAMPLE

Step 1:
A = 10
B = 5

Step 2:
Check:
A > B

Check becomes:
10 > 5

This is true.

Step 3:
Run the if block.

Print:
A is largest of 2

Final output:
A is largest of 2

COMMON BEGINNER MISTAKES

1) Using = instead of >
Wrong:
if (A = B)

Correct:
if (A > B)

2) Forgetting braces {}
Braces help define the block clearly.

3) Confusing assignment and comparison
= means assignment.
> means comparison.

4) Forgetting semicolons
Every Java statement must end with a semicolon.

5) Thinking else always runs
else runs only when the if condition is false.

EASY INTERVIEW ANSWER

This program compares two numbers using if-else.
If A is greater than B, it prints that A is larger.
Otherwise, it prints that B is larger.

ONE PRACTICE QUESTION

Write a Java program to compare three numbers and print the largest among them.
*/
