public class JavaBasics { // This is the class name.

    public static void main(String arg[]) { // Main method: Java starts execution from here.

        System.out.println("Hello Mr. Ranjan"); // Print the first message.

        System.out.println("Hello Mr. Ranjan"); // Print the second message.

    }
}

/*
WHAT THIS CODE DOES

This program prints the text:
Hello Mr. Ranjan

two times on the screen.

This is one of the most basic Java programs and is usually used to learn:
- class
- main method
- output printing
- syntax structure

LINE-BY-LINE EXPLANATION

public class JavaBasics
This creates a class named JavaBasics.
In Java, every program must be inside a class.

public static void main(String arg[])
This is the main method.
Java starts running the program from here.

System.out.println("Hello Mr. Ranjan");
This prints the text:
Hello Mr. Ranjan

println means:
- print the text
- then move to the next line

The second println line prints the same message again.

EXPLANATION OF ALL CODING TERMS USED

1) class
A class is a container that holds Java code.

2) public
public means the class or method can be accessed from anywhere.

3) static
static means the method belongs to the class itself, not to an object.

4) void
void means the method does not return anything.

5) main
main is the starting point of the Java program.

6) String arg[]
This stores command-line arguments.
For beginners, you can simply remember that it is part of the main method syntax.

7) System
System is a built-in Java class.

8) out
out is used for output.

9) println
println prints output and moves the cursor to the next line.

10) statement
A statement is one instruction in Java.
Example:
System.out.println("Hello");

11) semicolon ;
A semicolon marks the end of a statement in Java.

12) string
Text inside double quotes is called a String.
Example:
"Hello Mr. Ranjan"

IMPORTANT JAVA CONCEPTS USED

1) Program structure
This program teaches the basic structure of a Java program.

2) Output statement
The program uses System.out.println() to print text.

3) Strings
The printed message is a String because it is inside double quotes.

4) Sequential execution
Java runs statements one after another from top to bottom.

INPUT AND OUTPUT

Input:
No input is needed.

Output:
Hello Mr. Ranjan
Hello Mr. Ranjan

DRY RUN WITH EXAMPLE

Step 1:
Java enters the main method.

Step 2:
Run first println statement.

Output:
Hello Mr. Ranjan

Step 3:
Run second println statement.

Output:
Hello Mr. Ranjan

Final output:
Hello Mr. Ranjan
Hello Mr. Ranjan

COMMON BEGINNER MISTAKES

1) Forgetting semicolon
Wrong:
System.out.println("Hello")

Correct:
System.out.println("Hello");

2) Using single quotes instead of double quotes
Wrong:
'Hello'

Correct:
"Hello"

3) Writing Println instead of println
Java is case-sensitive.

Correct:
println

4) Forgetting braces {}
Braces are needed to define class and method blocks.

5) Changing class name incorrectly
The file name and public class name should usually match.

EASY INTERVIEW ANSWER

This is a basic Java program that prints a message using System.out.println().
It demonstrates the structure of a Java program and simple output statements.

ONE PRACTICE QUESTION

Write a Java program that prints:
Welcome to Java
Learning Java is fun
*/