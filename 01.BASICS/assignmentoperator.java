public class assignmentoperator { // This is the class name. It stays the same as your code.

    public static void main(String args[]) { // Main method: Java starts running from here.

        int a = 10; // Create an integer variable named a and store 10 in it.

        // a = a + 10; // This is the long way of adding 10 to a.
        a += 10; // This is the short form. It means: a = a + 10;

        System.out.println(a); // Print the final value of a.
    }
}

/*
WHAT THIS CODE DOES

This program shows the assignment operator in Java.
It starts with a value of 10 and adds 10 more using the short form:

a += 10

So the final output becomes 20.

LINE-BY-LINE EXPLANATION

public class assignmentoperator
This creates a class named assignmentoperator.
In Java, the class name should match the file name.

public static void main(String args[])
This is the main method.
Java begins execution from here.

int a = 10;
This creates an integer variable named a and stores 10 in it.

a = a + 10;
This line is written as a comment.
It shows the long form of adding 10 to a.

a += 10;
This is the short form.
It means:
a = a + 10

So a becomes 20.

System.out.println(a);
This prints the value of a on the screen.
The output will be 20.

EXPLANATION OF ALL CODING TERMS USED

1) class
A class is a blueprint of a Java program.
Every Java program is written inside a class.

2) public
public means the program can be accessed from anywhere.

3) static
static means the method belongs to the class itself, not to an object.

4) void
void means the method does not return any value.

5) main
main is the starting point of the Java program.

6) String args[]
This is used to store command-line arguments.
For beginners, you can think of it as the input list for the program start.

7) int
int is a data type used to store whole numbers.
Example: 5, 10, 100

8) variable
A variable stores a value.
Here, a is a variable.

9) assignment operator
An assignment operator gives a value to a variable.
Example:
a = 10

10) +=
This is an assignment operator.
It means “add and assign.”
a += 10 means a = a + 10

11) comment
A comment is a line that Java ignores.
It is used to explain code for humans.

12) System.out.println()
This prints the output and moves to the next line.

IMPORTANT JAVA CONCEPTS USED

1) Assignment operator
The main concept in this code is the assignment operator.
It is used to store a value in a variable.

2) Compound assignment operator
a += 10 is called a compound assignment operator.
It combines addition and assignment in one step.

3) Short form vs long form
Long form:
a = a + 10

Short form:
a += 10

Both do the same thing.

4) Output
The final value printed is 20.

INPUT AND OUTPUT

Input:
No user input is needed in this program.

Output:
20

DRY RUN WITH EXAMPLE

Start:
a = 10

After a += 10:
a = 10 + 10
a = 20

Then print:
20

COMMON BEGINNER MISTAKES

1) Writing a + = 10
This is wrong.
The correct form is:
a += 10

2) Forgetting that += changes the original variable
After a += 10, a becomes 20.

3) Thinking a += 10 is different from a = a + 10
Both are the same.

4) Missing semicolon
Every statement must end with a semicolon.

5) Confusing assignment with equality
= means assignment.
It does not mean equal to.

EASY INTERVIEW ANSWER

The += operator is called a compound assignment operator.
It adds a value to a variable and stores the result back in the same variable.
For example, a += 10 means a = a + 10.

ONE PRACTICE QUESTION

Write a Java program using -= to subtract 5 from a variable and print the result.
*/